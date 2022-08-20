DROP SEQUENCE IF EXISTS address_seq;

CREATE SEQUENCE IF NOT EXISTS address_seq
INCREMENT 1
START 1001;

DROP TABLE IF EXISTS address;

CREATE TABLE IF NOT EXISTS address (
  id bigint NOT NULL,
  street varchar(255) NULL,
  PRIMARY KEY (id)
);


insert into address (id, street) values (1, '3 Rigney Trail');
insert into address (id, street) values (2, '20975 Schiller Parkway');
insert into address (id, street) values (3, '3 Luster Pass');
insert into address (id, street) values (4, '925 Bartelt Alley');
insert into address (id, street) values (5, '48 Aberg Trail');
insert into address (id, street) values (6, '247 Glacier Hill Avenue');
insert into address (id, street) values (7, '6074 Cardinal Center');
insert into address (id, street) values (8, '00 Moose Alley');
insert into address (id, street) values (9, '021 Vermont Center');
insert into address (id, street) values (10, '3245 Surrey Place');
insert into address (id, street) values (11, '32 Charing Cross Trail');
insert into address (id, street) values (12, '1 Moland Road');
insert into address (id, street) values (13, '2093 Larry Avenue');
insert into address (id, street) values (14, '7 Fallview Lane');
insert into address (id, street) values (15, '55670 Center Trail');
insert into address (id, street) values (16, '9515 Messerschmidt Junction');
insert into address (id, street) values (17, '7 Clyde Gallagher Alley');
insert into address (id, street) values (18, '93 Summer Ridge Alley');
insert into address (id, street) values (19, '36 Kensington Drive');
insert into address (id, street) values (20, '0 Ryan Alley');
insert into address (id, street) values (21, '2819 Morning Crossing');
insert into address (id, street) values (22, '2 Green Plaza');
insert into address (id, street) values (23, '1 School Way');
insert into address (id, street) values (24, '2100 Larry Crossing');
insert into address (id, street) values (25, '03552 Bellgrove Terrace');
insert into address (id, street) values (26, '2 Gale Way');
insert into address (id, street) values (27, '20 Lien Hill');
insert into address (id, street) values (28, '537 Scott Court');
insert into address (id, street) values (29, '1 Longview Drive');
insert into address (id, street) values (30, '4 Mccormick Drive');
insert into address (id, street) values (31, '0 Sugar Terrace');
insert into address (id, street) values (32, '69 Scofield Trail');
insert into address (id, street) values (33, '4 Emmet Point');
insert into address (id, street) values (34, '71 Red Cloud Center');
insert into address (id, street) values (35, '4 North Center');
insert into address (id, street) values (36, '179 Memorial Trail');
insert into address (id, street) values (37, '821 Meadow Ridge Alley');
insert into address (id, street) values (38, '11949 Mosinee Court');
insert into address (id, street) values (39, '79 Merchant Plaza');
insert into address (id, street) values (40, '58 Shoshone Road');
insert into address (id, street) values (41, '931 Dorton Place');
insert into address (id, street) values (42, '6 Ronald Regan Lane');
insert into address (id, street) values (43, '1818 Schurz Junction');
insert into address (id, street) values (44, '2463 Gulseth Junction');
insert into address (id, street) values (45, '3 Rieder Trail');
insert into address (id, street) values (46, '34 Warbler Alley');
insert into address (id, street) values (47, '312 3rd Avenue');
insert into address (id, street) values (48, '55 Southridge Lane');
insert into address (id, street) values (49, '5802 Marquette Court');
insert into address (id, street) values (50, '54389 Hauk Crossing');
insert into address (id, street) values (51, '1276 Toban Parkway');
insert into address (id, street) values (52, '83409 Gale Way');
insert into address (id, street) values (53, '578 Arrowood Drive');
insert into address (id, street) values (54, '084 Hanover Circle');
insert into address (id, street) values (55, '77 Ryan Alley');
insert into address (id, street) values (56, '111 Sheridan Alley');
insert into address (id, street) values (57, '0371 Union Street');
insert into address (id, street) values (58, '3877 Doe Crossing Parkway');
insert into address (id, street) values (59, '32402 Laurel Terrace');
insert into address (id, street) values (60, '4294 Waywood Crossing');
insert into address (id, street) values (61, '97 Sunbrook Terrace');
insert into address (id, street) values (62, '20010 Lukken Parkway');
insert into address (id, street) values (63, '38 Basil Trail');
insert into address (id, street) values (64, '9159 Rusk Court');
insert into address (id, street) values (65, '12992 Truax Circle');
insert into address (id, street) values (66, '8523 Ilene Pass');
insert into address (id, street) values (67, '8060 Grim Crossing');
insert into address (id, street) values (68, '73 Kenwood Way');
insert into address (id, street) values (69, '7 Saint Paul Trail');
insert into address (id, street) values (70, '5 Amoth Court');
insert into address (id, street) values (71, '77 Artisan Hill');
insert into address (id, street) values (72, '2 Gerald Crossing');
insert into address (id, street) values (73, '42464 Raven Trail');
insert into address (id, street) values (74, '38346 Huxley Avenue');
insert into address (id, street) values (75, '3931 Oak Valley Avenue');
insert into address (id, street) values (76, '3 David Lane');
insert into address (id, street) values (77, '2364 Arkansas Terrace');
insert into address (id, street) values (78, '1897 Fulton Avenue');
insert into address (id, street) values (79, '06822 Myrtle Place');
insert into address (id, street) values (80, '764 Village Green Hill');
insert into address (id, street) values (81, '129 Macpherson Hill');
insert into address (id, street) values (82, '2 Truax Point');
insert into address (id, street) values (83, '58914 Jenna Park');
insert into address (id, street) values (84, '2 Sycamore Hill');
insert into address (id, street) values (85, '3799 Messerschmidt Lane');
insert into address (id, street) values (86, '2 Ronald Regan Way');
insert into address (id, street) values (87, '8 Stuart Hill');
insert into address (id, street) values (88, '3253 Glacier Hill Road');
insert into address (id, street) values (89, '42 Loomis Plaza');
insert into address (id, street) values (90, '6089 Londonderry Terrace');
insert into address (id, street) values (91, '66620 Springs Way');
insert into address (id, street) values (92, '53886 Anzinger Hill');
insert into address (id, street) values (93, '63 Sachs Court');
insert into address (id, street) values (94, '27856 Warner Crossing');
insert into address (id, street) values (95, '50461 Dawn Crossing');
insert into address (id, street) values (96, '218 Sycamore Street');
insert into address (id, street) values (97, '15 Troy Way');
insert into address (id, street) values (98, '6 Eastlawn Way');
insert into address (id, street) values (99, '2956 Aberg Hill');
insert into address (id, street) values (100, '15369 Brickson Park Road');
