CREATE DATABASE  IF NOT EXISTS `la_yaquesita` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `la_yaquesita`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: la_yaquesita
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gastos`
--

DROP TABLE IF EXISTS `gastos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gastos` (
  `idgastos` int(11) NOT NULL,
  `concepto` varchar(45) NOT NULL,
  `cantidad` float NOT NULL,
  PRIMARY KEY (`idgastos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastos`
--

LOCK TABLES `gastos` WRITE;
/*!40000 ALTER TABLE `gastos` DISABLE KEYS */;
/*!40000 ALTER TABLE `gastos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingredientes`
--

DROP TABLE IF EXISTS `ingredientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingredientes` (
  `idingredientes` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `abreviacion` varchar(45) NOT NULL,
  PRIMARY KEY (`idingredientes`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingredientes`
--

LOCK TABLES `ingredientes` WRITE;
/*!40000 ALTER TABLE `ingredientes` DISABLE KEYS */;
INSERT INTO `ingredientes` VALUES (1,'Salchicha','Salchicha'),(2,'Mayonesa','Mayo'),(3,'Mostaza','Most'),(4,'Catsup','Ket'),(5,'Cebolla asada','Ceb'),(6,'Frijol','Frijol'),(7,'Tomate','Tom'),(8,'Salsa jalapeño','Salsa'),(9,'Aguacate','Guac'),(10,'Queso cotija','Cotija'),(11,'Salsa Chiltepín','Valiente'),(12,'Queso de nacho','Nacho'),(13,'Salsa hawaiian','Salsa hawaiian'),(14,'Mozzarella','Mozzarella'),(15,'Güeros','Güeros'),(16,'Tocino','Tocino'),(17,'Salsa Chipotle','Chipotle');
/*!40000 ALTER TABLE `ingredientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orden`
--

DROP TABLE IF EXISTS `orden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orden` (
  `idorden` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `idusuario` int(11) NOT NULL,
  PRIMARY KEY (`idorden`),
  KEY `fk_orden_usuarios1_idx` (`idusuario`),
  CONSTRAINT `fk_orden_usuarios1` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orden`
--

LOCK TABLES `orden` WRITE;
/*!40000 ALTER TABLE `orden` DISABLE KEYS */;
INSERT INTO `orden` VALUES (16,'2021-05-28',11,1),(17,'2021-05-28',3.5,1),(18,'2021-05-28',27,1),(19,'2021-05-28',24,1),(20,'2021-05-28',22,1),(21,'2021-05-28',6,1),(22,'2021-05-28',22,1),(23,'2021-05-28',31.5,1);
/*!40000 ALTER TABLE `orden` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orden_has_platillo`
--

DROP TABLE IF EXISTS `orden_has_platillo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orden_has_platillo` (
  `orden_idorden` int(11) NOT NULL,
  `platillo_idplatillo` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `notas` varchar(255) DEFAULT NULL,
  `precio` float NOT NULL,
  `id_orden_has_platillo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_orden_has_platillo`),
  KEY `fk_orden_has_platillo_platillo1_idx` (`platillo_idplatillo`),
  KEY `fk_orden_has_platillo_orden1_idx` (`orden_idorden`),
  CONSTRAINT `fk_orden_has_platillo_orden1` FOREIGN KEY (`orden_idorden`) REFERENCES `orden` (`idorden`),
  CONSTRAINT `fk_orden_has_platillo_platillo1` FOREIGN KEY (`platillo_idplatillo`) REFERENCES `platillo` (`idplatillo`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orden_has_platillo`
--

LOCK TABLES `orden_has_platillo` WRITE;
/*!40000 ALTER TABLE `orden_has_platillo` DISABLE KEYS */;
INSERT INTO `orden_has_platillo` VALUES (16,1,2,'Yaqui	$4.5 \n	\n	CT\n',4.5,1),(16,18,1,'Té verde	$2.0 \n',2,2),(17,14,1,'Jarritos	$2.5 \n',2.5,3),(17,17,1,'Botella de agua	$1.0 \n',1,4),(18,4,1,'QuesiDogo	$5.5 \n	pan doradito\n	Salchicha\n	Mayo\n	Salsa\n',5.5,5),(18,6,1,'Keto	$5.0 \n	\n	CT\n',5,6),(18,9,3,'El valiente	$5.5 \n	\n	CT\n',5.5,7),(19,8,4,'HawaiianDogo	$6.0 \n	\n	CT\n',6,8),(20,1,2,'Yaqui	$4.5 \n	\n	CT\n',4.5,9),(20,3,2,'Golozo	$6.5 \n	\n	Salchicha\n	Ceb\n',6.5,10),(21,14,1,'Jarritos	$2.5 \n',2.5,11),(21,15,1,'Manzana y Sangría	$2.5 \n',2.5,12),(21,17,1,'Botella de agua	$1.0 \n',1,13),(22,9,4,'El valiente	$5.5 \n	\n	CT\n',5.5,14),(23,1,7,'Yaqui	$4.5 \n	\n	CT\n',4.5,15);
/*!40000 ALTER TABLE `orden_has_platillo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `platillo`
--

DROP TABLE IF EXISTS `platillo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `platillo` (
  `idplatillo` int(11) NOT NULL AUTO_INCREMENT,
  `tipoProducto` enum('EXTRA','BEBIDA','HOTDOG') NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(350) DEFAULT NULL,
  `costo` float NOT NULL,
  PRIMARY KEY (`idplatillo`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `platillo`
--

LOCK TABLES `platillo` WRITE;
/*!40000 ALTER TABLE `platillo` DISABLE KEYS */;
INSERT INTO `platillo` VALUES (1,'HOTDOG','Yaqui','Original/Clásico',4.5),(2,'HOTDOG','Cuate','Doble Salchicha',5.5),(3,'HOTDOG','Golozo','Triple Salchicha',6.5),(4,'HOTDOG','QuesiDogo','Con cama de queso mozzarella derretido',5.5),(5,'HOTDOG','ChileDogo','Chile verde tatemado relleno con salchicha, queso mozzarella envuelto en tocino',6),(6,'HOTDOG','Keto','NO pan, NO frijoles, NO carbs, en cama de queso mozarella',5),(7,'HOTDOG','CheetoDogo','Catsup, mostaza,  cebolla asada, salsa chipotle, queso de nachos, tomate, queso cotija y mayonesa',5.5),(8,'HOTDOG','HawaiianDogo','Queso mozzarella, piña, jamón, salsa agridulce, cebolla asada, tomate, queso cotija, mayonesa de piña y salsa jalapeño.',6),(9,'HOTDOG','El valiente','Mostaza, piña, jamón, salsa agridulce, cebolla asada, salsa jalapeño, salsa valiente (super picante), chile serrano, queso cotija y mayonesa, EXTRA PICANTE.',5.5),(10,'HOTDOG','ChorizoDogo','Salchicha envuelta en tocino, mayonesa, mostaza, catsup, cebolla asada, frijol, tomate, salsa jalapeño, aguacate, queso cotija y chorizo.',5.5),(11,'HOTDOG','CharroDogo','Salchicha envuelta en tocino,queso mozzarella, chorizo, tomate,cebolla asada, mayonesa, catsup, mostaza, aguacate, salsa chipotle, jamón y tocino picado, frijoles, salsa verde (SUPER PICOSA)',6),(12,'HOTDOG','TostiDogo','NO PAN, en una bolsa de tostitos, 2 salchichas envueltas en tocinos, tomates, cebolla asada, frijol, aguacate, queso de nacho, mayonesa, catsup, mostaza, queso cotija.',5.5),(13,'BEBIDA','Coca L','Coca de botella mexicana de 355 ml',3),(14,'BEBIDA','Jarritos','Toroja, Mandarina, Tamarindo, Limón, Piña y Fresa',2.5),(15,'BEBIDA','Manzana y Sangría','Botella mexicana de 355 ml',2.5),(16,'BEBIDA','Soda de lata','Coca-Cola, Fanta, Sprite, Diet Coke y Coke Zero',1.5),(17,'BEBIDA','Botella de agua','500 ml',1),(18,'BEBIDA','Té verde','Arizona',2),(19,'EXTRA','Queso de Nachos','Plato pequeño de queso de nachos',1),(20,'EXTRA','Salsa Valiente','Plato pequeño de Salsa \"Valiente\"',1),(21,'EXTRA','Charro Stuff','Costo',1),(22,'EXTRA','Güeros','Costo',1),(23,'EXTRA','Queso nachos','Costo',1),(25,'EXTRA','Chipotle','Costo',1),(26,'EXTRA','Piña','Costo',1),(27,'EXTRA','Mayonesa','No costo',0),(28,'EXTRA','Salsa jalapeño','No costo',0),(29,'EXTRA','Mostaza','No costo',0),(30,'EXTRA','Catsup','No costo',0),(31,'EXTRA','Cebolla asada','No costo',0),(32,'EXTRA','Frijol','No costo',0),(33,'EXTRA','Tomate','No costo',0),(34,'EXTRA','Aguacate','No costo',0),(35,'EXTRA','Cotija','No costo',0);
/*!40000 ALTER TABLE `platillo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `platillo_has_ingredientes`
--

DROP TABLE IF EXISTS `platillo_has_ingredientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `platillo_has_ingredientes` (
  `ingredientes_idingredientes` int(11) NOT NULL,
  `platillo_idplatillo` int(11) NOT NULL,
  `id_platillo_has_ingredientes` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_platillo_has_ingredientes`),
  KEY `fk_ingredientes_has_platillo_platillo1_idx` (`platillo_idplatillo`),
  KEY `fk_ingredientes_has_platillo_ingredientes1_idx` (`ingredientes_idingredientes`),
  CONSTRAINT `fk_ingredientes_has_platillo_ingredientes1` FOREIGN KEY (`ingredientes_idingredientes`) REFERENCES `ingredientes` (`idingredientes`),
  CONSTRAINT `fk_ingredientes_has_platillo_platillo1` FOREIGN KEY (`platillo_idplatillo`) REFERENCES `platillo` (`idplatillo`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `platillo_has_ingredientes`
--

LOCK TABLES `platillo_has_ingredientes` WRITE;
/*!40000 ALTER TABLE `platillo_has_ingredientes` DISABLE KEYS */;
INSERT INTO `platillo_has_ingredientes` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(6,1,5),(7,1,6),(8,1,7),(9,1,8),(10,1,9),(5,1,10),(16,1,11),(1,2,23),(2,2,24),(3,2,25),(4,2,26),(5,2,27),(6,2,28),(7,2,29),(8,2,30),(9,2,31),(10,2,32),(16,2,33),(1,3,34),(2,3,35),(3,3,36),(4,3,37),(5,3,38),(6,3,39),(7,3,40),(8,3,41),(9,3,42),(10,3,43),(16,3,44),(1,4,45),(2,4,46),(3,4,47),(4,4,48),(5,4,49),(6,4,50),(7,4,51),(8,4,52),(9,4,53),(10,4,54),(16,4,55),(14,4,56),(4,7,57),(3,7,58),(5,7,59),(17,7,60),(12,7,61),(7,7,62),(10,7,63),(2,7,64);
/*!40000 ALTER TABLE `platillo_has_ingredientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `contraseña` varchar(55) NOT NULL,
  `puesto` enum('CAJERO','ADMINISTRADOR') NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Joel Valenzuela','123456','ADMINISTRADOR'),(2,'Valenzuela Joel','654321','CAJERO');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28  9:53:42
