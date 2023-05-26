-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema MyShop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema MyShop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `MyShop` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `MyShop` ;

-- -----------------------------------------------------
-- Table `MyShop`.`Accounts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MyShop`.`Accounts` (
  `Username` VARCHAR(20) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Fullname` VARCHAR(45) NULL DEFAULT NULL,
  `Email` VARCHAR(45) NULL DEFAULT NULL,
  `Photo` VARCHAR(45) NULL DEFAULT NULL,
  `Activated` BIT(2) NULL DEFAULT NULL,
  `Admin` BIT(2) NULL DEFAULT NULL,
  PRIMARY KEY (`Username`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `MyShop`.`Categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MyShop`.`Categories` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`Id`)
)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `MyShop`.`OrderDetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MyShop`.`OrderDetails` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `OrderId` INT NULL DEFAULT NULL,
  `ProductId` INT NULL DEFAULT NULL,
  `Price` INT NULL DEFAULT NULL,
  `Quanity` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Id`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `MyShop`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MyShop`.`Orders` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Username` VARCHAR(45) NULL DEFAULT NULL,
  `CreatDate` DATETIME NULL DEFAULT NULL,
  `Address` VARCHAR(200) NULL DEFAULT NULL,
  PRIMARY KEY (`Id`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `MyShop`.`Products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MyShop`.`Products` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL DEFAULT NULL,
  `Image` VARCHAR(45) NULL DEFAULT NULL,
  `Price` INT NULL DEFAULT NULL,
  `CreateDate` DATETIME NULL DEFAULT NULL,
  `Available` INT NULL DEFAULT NULL,
  `CateforyId` INT NULL DEFAULT NULL,
  PRIMARY KEY (`Id`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SET SQL_MODE=@
