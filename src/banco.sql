-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema trabalhoIngressos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema trabalhoIngressos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `trabalhoIngressos` DEFAULT CHARACTER SET utf8 ;
USE `trabalhoIngressos` ;

-- -----------------------------------------------------
-- Table `trabalhoIngressos`.`filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalhoIngressos`.`filme` (
  `idFilme` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '',
  `titulo` VARCHAR(45) NOT NULL COMMENT '',
  `classificacao` VARCHAR(45) NOT NULL COMMENT '',
  `diretor` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`idFilme`)  COMMENT '',
  UNIQUE INDEX `id_UNIQUE` (`idFilme` ASC)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `trabalhoIngressos`.`sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalhoIngressos`.`sala` (
  `idSala` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `numero` INT(11) NOT NULL COMMENT '',
  `qtdeLugares` INT(11) NOT NULL COMMENT '',
  `valor` INT(11) NOT NULL COMMENT '',
  `quatroD` TINYINT(1) NOT NULL COMMENT '',
  `filme_idFilme` INT(10) UNSIGNED NOT NULL COMMENT '',
  PRIMARY KEY (`idSala`)  COMMENT '',
  UNIQUE INDEX `idSala_UNIQUE` (`idSala` ASC)  COMMENT '',
  INDEX `fk_sala_filme1_idx` (`filme_idFilme` ASC)  COMMENT '',
  CONSTRAINT `fk_sala_filme1`
    FOREIGN KEY (`filme_idFilme`)
    REFERENCES `trabalhoIngressos`.`filme` (`idFilme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `trabalhoIngressos`.`sessao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalhoIngressos`.`sessao` (
  `idSessao` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '',
  `horario` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '',
  `sala_idSala` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`idSessao`)  COMMENT '',
  UNIQUE INDEX `idsessao_UNIQUE` (`idSessao` ASC)  COMMENT '',
  INDEX `fk_sessao_sala1_idx` (`sala_idSala` ASC)  COMMENT '',
  CONSTRAINT `fk_sessao_sala1`
    FOREIGN KEY (`sala_idSala`)
    REFERENCES `trabalhoIngressos`.`sala` (`idSala`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `trabalhoIngressos`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalhoIngressos`.`usuario` (
  `idUsuario` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '',
  `cpf` INT(11) NOT NULL COMMENT '',
  `email` VARCHAR(80) NOT NULL COMMENT '',
  `nome` VARCHAR(45) NOT NULL COMMENT '',
  `senha` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`idUsuario`)  COMMENT '',
  UNIQUE INDEX `id_UNIQUE` (`idUsuario` ASC)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `trabalhoIngressos`.`ingresso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalhoIngressos`.`ingresso` (
  `usuario_idUsuario` INT(10) UNSIGNED NOT NULL COMMENT '',
  `sessao_idSessao` INT(10) UNSIGNED NOT NULL COMMENT '',
  `data` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`usuario_idUsuario`, `sessao_idSessao`)  COMMENT '',
  INDEX `fk_ingresso_usuario1_idx` (`usuario_idUsuario` ASC)  COMMENT '',
  INDEX `fk_ingresso_sessao1_idx` (`sessao_idSessao` ASC)  COMMENT '',
  CONSTRAINT `fk_ingresso_sessao1`
    FOREIGN KEY (`sessao_idSessao`)
    REFERENCES `trabalhoIngressos`.`sessao` (`idSessao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ingresso_usuario1`
    FOREIGN KEY (`usuario_idUsuario`)
    REFERENCES `trabalhoIngressos`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
