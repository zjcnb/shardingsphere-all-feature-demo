/** ------------------------------------------------------------------------------------------------- **/

CREATE DATABASE demo_primary_ds;

USE demo_primary_ds;

CREATE TABLE `t_user`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


