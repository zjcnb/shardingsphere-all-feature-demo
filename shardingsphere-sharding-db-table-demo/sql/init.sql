/** ------------------------------------------------------------------------------------------------- **/

CREATE DATABASE test0;

USE test0;

CREATE TABLE `t_user0`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `t_user1`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/** ------------------------------------------------------------------------------------------------- **/

CREATE DATABASE test1;

USE test1;

CREATE TABLE `t_user0`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `t_user1`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



