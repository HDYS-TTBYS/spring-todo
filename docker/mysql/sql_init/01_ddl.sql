CREATE DATABASE IF NOT EXISTS sample_schema CHARACTER SET
utf8 COLLATE utf8_general_ci;

USE sample_schema;

CREATE TABLE IF NOT EXISTS sample_schema.todo(
    id    int PRIMARY KEY AUTO_INCREMENT,
    assagin_person     varchar(20) NOT NULL,
    title              varchar(128) NOT NULL,
    todo_description   varchar(255) NOT NULL,
    created_at         bigint NOT NULL,
    updated_at         bigint NOT NULL,
    INDEX(id)
);
