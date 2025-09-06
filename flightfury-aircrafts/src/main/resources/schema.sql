CREATE TABLE `AIRCRAFTS` (
                             `ID` int NOT NULL AUTO_INCREMENT,
                             `ICAO_CODE` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
                             `MANUFACTURER` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
                             `MANUFACTURER_ID` varchar(24) COLLATE utf8mb4_general_ci NOT NULL,
                             `MODEL_FAA` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
                             `MODEL_BADA` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
                             `PHYSICAL_CLASS_ENGINE` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
                             `NUM_ENGINES` int DEFAULT NULL,
                             `LENGTH` double DEFAULT NULL,
                             `HEIGHT` double DEFAULT NULL,
                             `WINGSPAN` double DEFAULT NULL,
                             `MAX_SPEED` int DEFAULT NULL,
                             `WEIGHT` int DEFAULT NULL,
                             `IMAGE_URL` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
                             PRIMARY KEY (`ID`),
                             UNIQUE KEY `ICAO_CODE` (`ICAO_CODE`),
                             KEY `manufacturer_index` (`MANUFACTURER_ID`,`MANUFACTURER`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci