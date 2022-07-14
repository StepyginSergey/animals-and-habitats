CREATE TABLE region (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE skin_color (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    color_name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE animal_kind (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    kind_name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE animal (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    kind_id INTEGER NOT NULL,
    skin_color_id INTEGER,

    PRIMARY KEY (id),
    FOREIGN KEY (kind_id) REFERENCES animal_kind(id),
    FOREIGN KEY (skin_color_id) REFERENCES skin_color(id)
);

CREATE TABLE animal_region (
  animal_id int NOT NULL,
  region_id int NOT NULL,
  PRIMARY KEY (animal_id, region_id),
  FOREIGN KEY (animal_id) REFERENCES animal(id),
  FOREIGN KEY (region_id) REFERENCES region(id));