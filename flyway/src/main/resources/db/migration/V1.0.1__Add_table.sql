CREATE TABLE clazz
(
    id int4,
    name varchar(50),
    PRIMARY KEY (id)
);

CREATE TABLE student
(
    id int4,
    clazz_id int4,
    name varchar(50),
    PRIMARY KEY (id),
    FOREIGN KEY (clazz_id)
          REFERENCES clazz (id)
);

CREATE SEQUENCE clazz_sequence START 101;
CREATE SEQUENCE student_sequence START 101;
