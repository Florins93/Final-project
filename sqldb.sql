-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tripsproject
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (1,'biserica_neagra','2011-05-11 00:00:00','2011-05-14 00:00:00','bbb',_binary 'ph1',_binary 'ph2');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (2,'braila','2018-10-10 00:00:00','2018-10-20 00:00:00','aaa',_binary 'ph1',_binary 'ph2');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (3,'brasov','2000-01-01 00:00:00','2000-02-02 00:00:00','ccc',_binary 'bv1',_binary 'bv2');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (4,'brasov','2019-02-10 00:00:00','2019-02-18 00:00:00','coresi',_binary 'coresi1',_binary 'coresi2');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (5,'noroc',NULL,NULL,'',_binary '',_binary '');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (6,'noroc',NULL,NULL,'',_binary 'captive-portal-network-diagram-1.jpg',_binary 'large.jpg');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (7,'braila',NULL,NULL,'',_binary 'CUII.png',_binary 'CUI.png');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (8,'noroc',NULL,NULL,'cum a  ramas ultima oara',_binary 'btn.png',_binary 'CUII.png');
INSERT INTO `location` (`id`, `location_name`, `date_from`, `date_to`, `impression`, `photo1`, `photo2`) VALUES (9,'braila','2019-05-05 00:00:00','2019-05-10 00:00:00','dvfdfgdfdf',_binary 'captive-portal-gateway-1.gif',_binary 'fereasca.png');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `userlocation`
--

LOCK TABLES `userlocation` WRITE;
/*!40000 ALTER TABLE `userlocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `userlocation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `userprofile`
--

LOCK TABLES `userprofile` WRITE;
/*!40000 ALTER TABLE `userprofile` DISABLE KEYS */;
INSERT INTO `userprofile` (`id`, `firstname`, `lastname`, `username`, `city`, `password`, `address`, `phone`, `password_confirm`, `role`) VALUES (1,'sava','florin','Florin','GALATI','$2a$10$gNJOXxz5YUPOLojvIy/7EuFicOMxoSjRH9bI9u1G10reAnGpVOYpG','Strada Domneasca nr 155, Galati','729128767','qwertyuiop','user');
INSERT INTO `userprofile` (`id`, `firstname`, `lastname`, `username`, `city`, `password`, `address`, `phone`, `password_confirm`, `role`) VALUES (3,'ionuttt','dogaru','ionuttt','edcvfr','$2a$10$uBO70LZUy6BrlJokHkRPoumcEZrpHjvrSeHVx7d4IKAIVR4UnIWmy','qazxsw','753159','qwertyuiop','user');
INSERT INTO `userprofile` (`id`, `firstname`, `lastname`, `username`, `city`, `password`, `address`, `phone`, `password_confirm`, `role`) VALUES (5,'savasava','florin','florin1500','uiop','qwertyuiop','qwerty','158963','qwertyuiop','user');
INSERT INTO `userprofile` (`id`, `firstname`, `lastname`, `username`, `city`, `password`, `address`, `phone`, `password_confirm`, `role`) VALUES (10,'savaluc','florin','luckylucky','GALATI','$2a$10$.4beIWKTvaBv882ALxxrXuIA8PuGEEkK/rwxueRYOAtlfusqBqYLW','Strada Domneasca nr 155, Galati','729128768','$2a$10$3oUY3BFiulh6TGNNLHnd2.UkayFd9stFhKVh6/tY343f1PstXA.3S','user');
INSERT INTO `userprofile` (`id`, `firstname`, `lastname`, `username`, `city`, `password`, `address`, `phone`, `password_confirm`, `role`) VALUES (11,'aaaaaaaa','bbb','aaaaaaaa','aaaaaaaa','aaaaaaaa','aaaaaaaa','aaaaaaaa',NULL,'user');
/*!40000 ALTER TABLE `userprofile` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-22 18:11:56
