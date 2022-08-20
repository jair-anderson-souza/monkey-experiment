package tests

import io.gatling.core.Predef.{nothingFor, _}
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class PersonSimulation extends Simulation {

  object Update {

    val file = csv("persons.csv").random
    val scenarioUpdate = scenario("Update")
      .feed(file)
      .exec(
        http("update").put("/person").body(StringBody(""" { "id": "${id}", "name" : "${name}" } """))
      ).pause(1.seconds)

  }

  object Create {

    val file = csv("create-persons.csv").random
    val scenarioCreate = scenario("Create_New_Person")
      .feed(file)
      .exec(
        http("create").post("/person").body(StringBody((""" { "name": "${name}" } """)))
      ).pause(1.seconds)

  }

  object SearchById {

    var file = csv("ids.csv").random
    val scenarioFindById = scenario("Load_Find_By_ID")
      .feed(file)
      .exec(
        http("find_by_id").get("/person/${id}")
      ).pause(1.seconds)
  }

  object Search {

    var pagination = csv("pagination.csv").random

    val scenarioFindAll = scenario("Load_Find_All")
      .feed(pagination)
      .exec(
        http("list_persons").get("/person").check(status.in(200, 201, 202, 203, 204))
      ).pause(1.seconds)
  }

  val httpProtocol = http.baseUrl("http://localhost:8080").header("Content-Type", "application/json")

  val admins = scenario("admins").exec(Search.scenarioFindAll, SearchById.scenarioFindById, Update.scenarioUpdate, Create.scenarioCreate)
  val users = scenario("users").exec(Search.scenarioFindAll, SearchById.scenarioFindById)
  val searchAll = scenario("search").exec(Search.scenarioFindAll)


  setUp(
    searchAll.inject(
//      atOnceUsers(100)
      rampConcurrentUsers(200).to(400).during(1.minutes)
    )
  ).protocols(httpProtocol)
}
