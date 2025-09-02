-- testdb.AIRCRAFTS definition
CREATE DATABASE `testdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `AIRCRAFTS`
(
    `ID`                    int          NOT NULL AUTO_INCREMENT,
    `ICAO_CODE`             varchar(30)  NOT NULL,
    `MANUFACTURER`          varchar(50)  NOT NULL,
    `MODEL_FAA`             varchar(100) NOT NULL,
    `MODEL_BADA`            varchar(100) NOT NULL,
    `PHYSICAL_CLASS_ENGINE` varchar(30)  DEFAULT NULL,
    `NUM_ENGINES`           int          DEFAULT NULL,
    `LENGTH` double DEFAULT NULL,
    `HEIGHT` double DEFAULT NULL,
    `WINGSPAN` double DEFAULT NULL,
    `MAX_SPEED`             int          DEFAULT NULL,
    `WEIGHT`                int          DEFAULT NULL,
    `IMAGE_URL`             varchar(255) DEFAULT NULL,
    PRIMARY KEY (`ID`),
    UNIQUE KEY `ICAO_CODE` (`ICAO_CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;