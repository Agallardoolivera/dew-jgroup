SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `jgroup` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
SHOW WARNINGS;
USE `jgroup`;

-- -----------------------------------------------------
-- Table `jgroup`.`Articulo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`Articulo` (
  `Co_Articulo` INT NOT NULL ,
  `No_Articulo` VARCHAR(45) NULL ,
  `UM` VARCHAR(45) NULL ,
  PRIMARY KEY (`Co_Articulo`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`LineaNegocio`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`LineaNegocio` (
  `Co_Negocio` INT NOT NULL ,
  `Tx_Descripcion` VARCHAR(45) NULL ,
  PRIMARY KEY (`Co_Negocio`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`LineaArticulo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`LineaArticulo` (
  `Co_Linea` VARCHAR(45) NULL ,
  `LineaNegocio_Co_Negocio` INT NOT NULL ,
  `Articulo_Co_Articulo` INT NOT NULL ,
  PRIMARY KEY (`LineaNegocio_Co_Negocio`, `Articulo_Co_Articulo`) ,
  INDEX `fk_LineaArticulo_LineaNegocio1` (`LineaNegocio_Co_Negocio` ASC) ,
  INDEX `fk_LineaArticulo_Articulo1` (`Articulo_Co_Articulo` ASC) ,
  CONSTRAINT `fk_LineaArticulo_LineaNegocio1`
    FOREIGN KEY (`LineaNegocio_Co_Negocio` )
    REFERENCES `jgroup`.`LineaNegocio` (`Co_Negocio` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_LineaArticulo_Articulo1`
    FOREIGN KEY (`Articulo_Co_Articulo` )
    REFERENCES `jgroup`.`Articulo` (`Co_Articulo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`Proveedor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`Proveedor` (
  `Co_Proveedor` INT NOT NULL ,
  `Nu_RucProveedor` INT NULL ,
  `No_RazonSocialProveedor` VARCHAR(45) NULL ,
  `Tx_CorreoProveedor` VARCHAR(45) NULL ,
  `Tx_ClaveAccesoProveedor` VARCHAR(45) NULL ,
  PRIMARY KEY (`Co_Proveedor`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`ProveedorLinea`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`ProveedorLinea` (
  `Co_Linea` VARCHAR(45) NULL ,
  `LineaNegocio_Co_Negocio` INT NOT NULL ,
  `Proveedor_Co_Proveedor` INT NOT NULL ,
  PRIMARY KEY (`LineaNegocio_Co_Negocio`, `Proveedor_Co_Proveedor`) ,
  INDEX `fk_ProveedorLinea_LineaNegocio1` (`LineaNegocio_Co_Negocio` ASC) ,
  INDEX `fk_ProveedorLinea_Proveedor1` (`Proveedor_Co_Proveedor` ASC) ,
  CONSTRAINT `fk_ProveedorLinea_LineaNegocio1`
    FOREIGN KEY (`LineaNegocio_Co_Negocio` )
    REFERENCES `jgroup`.`LineaNegocio` (`Co_Negocio` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProveedorLinea_Proveedor1`
    FOREIGN KEY (`Proveedor_Co_Proveedor` )
    REFERENCES `jgroup`.`Proveedor` (`Co_Proveedor` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`Usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`Usuario` (
  `Co_Usuario` INT NOT NULL ,
  `No_Usuario` VARCHAR(45) NULL ,
  `Tx_ClaveUsuario` VARCHAR(45) NULL ,
  `Tx_AreaUsuario` VARCHAR(45) NULL ,
  PRIMARY KEY (`Co_Usuario`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`OrdenCompra`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`OrdenCompra` (
  `Nu_OrdenCompra` INT NOT NULL ,
  `Nu_Cotizacion` INT NULL ,
  `Ss_SubTotal` DOUBLE NULL ,
  `Tx_CondicionPago` VARCHAR(45) NULL ,
  `Fe_Entrega` DATE NULL ,
  `Tx_Observacion` VARCHAR(45) NULL ,
  PRIMARY KEY (`Nu_OrdenCompra`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`Invitacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`Invitacion` (
  `Nu_Invitacion` INT NOT NULL ,
  `Fe_Invitacion` DATE NULL ,
  `Tx_GeneradorUsuario` VARCHAR(45) NULL ,
  `Tx_Descripcion` VARCHAR(45) NULL ,
  `Usuario_Co_Usuario` INT NOT NULL ,
  `OrdenCompra_Nu_OrdenCompra` INT NULL ,
  PRIMARY KEY (`Nu_Invitacion`) ,
  INDEX `fk_Invitacion_Usuario1` (`Usuario_Co_Usuario` ASC) ,
  INDEX `fk_Invitacion_OrdenCompra1` (`OrdenCompra_Nu_OrdenCompra` ASC) ,
  CONSTRAINT `fk_Invitacion_Usuario1`
    FOREIGN KEY (`Usuario_Co_Usuario` )
    REFERENCES `jgroup`.`Usuario` (`Co_Usuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Invitacion_OrdenCompra1`
    FOREIGN KEY (`OrdenCompra_Nu_OrdenCompra` )
    REFERENCES `jgroup`.`OrdenCompra` (`Nu_OrdenCompra` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`Cotizacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`Cotizacion` (
  `Nu_Invitacion` INT NULL ,
  `Fe_Cotizacion` DATE NULL ,
  `Tx_ResponsableProveedor` VARCHAR(45) NULL ,
  `Tx_EstadoProveedor` VARCHAR(45) NULL ,
  `Nu_PuntajeObtenido` INT NULL ,
  `Tx_Ganadora` VARCHAR(45) NULL ,
  `Invitacion_Nu_Invitacion` INT NOT NULL ,
  `Nu_Cotizacion` INT NOT NULL ,
  `Proveedor_Co_Proveedor` INT NOT NULL ,
  INDEX `fk_Cotizacion_Invitacion1` (`Invitacion_Nu_Invitacion` ASC) ,
  PRIMARY KEY (`Nu_Cotizacion`) ,
  INDEX `fk_Cotizacion_Proveedor1` (`Proveedor_Co_Proveedor` ASC) ,
  CONSTRAINT `fk_Cotizacion_Invitacion1`
    FOREIGN KEY (`Invitacion_Nu_Invitacion` )
    REFERENCES `jgroup`.`Invitacion` (`Nu_Invitacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cotizacion_Proveedor1`
    FOREIGN KEY (`Proveedor_Co_Proveedor` )
    REFERENCES `jgroup`.`Proveedor` (`Co_Proveedor` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`DetalleCotizacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`DetalleCotizacion` (
  `Co_Invitacion` VARCHAR(45) NULL ,
  `Nu_Cantidad` INT NULL ,
  `Ss_PrecioUnitario` DOUBLE NULL ,
  `Cotizacion_Nu_Cotizacion` INT NOT NULL ,
  `Articulo_Co_Articulo` INT NOT NULL ,
  PRIMARY KEY (`Cotizacion_Nu_Cotizacion`, `Articulo_Co_Articulo`) ,
  INDEX `fk_DetalleCotizacion_Cotizacion1` (`Cotizacion_Nu_Cotizacion` ASC) ,
  INDEX `fk_DetalleCotizacion_Articulo1` (`Articulo_Co_Articulo` ASC) ,
  CONSTRAINT `fk_DetalleCotizacion_Cotizacion1`
    FOREIGN KEY (`Cotizacion_Nu_Cotizacion` )
    REFERENCES `jgroup`.`Cotizacion` (`Nu_Cotizacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DetalleCotizacion_Articulo1`
    FOREIGN KEY (`Articulo_Co_Articulo` )
    REFERENCES `jgroup`.`Articulo` (`Co_Articulo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`CriterioEvaluacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`CriterioEvaluacion` (
  `Co_Criterio` INT NOT NULL ,
  `Tx_DescCriterioEvaluacion` VARCHAR(45) NULL ,
  `Nu_Puntaje` DOUBLE NULL ,
  `Tipo_Dato` VARCHAR(45) NULL ,
  PRIMARY KEY (`Co_Criterio`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`CriterioCotizacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`CriterioCotizacion` (
  `Nu_ValorCotizacion` INT NULL ,
  `CriterioEvaluacion_Co_Criterio` INT NOT NULL ,
  `Cotizacion_Nu_Cotizacion` INT NOT NULL ,
  PRIMARY KEY (`CriterioEvaluacion_Co_Criterio`, `Cotizacion_Nu_Cotizacion`) ,
  INDEX `fk_CriterioCotizacion_CriterioEvaluacion1` (`CriterioEvaluacion_Co_Criterio` ASC) ,
  INDEX `fk_CriterioCotizacion_Cotizacion1` (`Cotizacion_Nu_Cotizacion` ASC) ,
  CONSTRAINT `fk_CriterioCotizacion_CriterioEvaluacion1`
    FOREIGN KEY (`CriterioEvaluacion_Co_Criterio` )
    REFERENCES `jgroup`.`CriterioEvaluacion` (`Co_Criterio` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CriterioCotizacion_Cotizacion1`
    FOREIGN KEY (`Cotizacion_Nu_Cotizacion` )
    REFERENCES `jgroup`.`Cotizacion` (`Nu_Cotizacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`DetalleOC`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`DetalleOC` (
  `Nu_Item` INT NULL ,
  `Co_Articulo` VARCHAR(45) NULL ,
  `Ss_PrecioArticulo` DOUBLE NULL ,
  `OrdenCompra_Nu_OrdenCompra` INT NOT NULL ,
  `Articulo_Co_Articulo` INT NOT NULL ,
  PRIMARY KEY (`OrdenCompra_Nu_OrdenCompra`, `Articulo_Co_Articulo`) ,
  INDEX `fk_DetalleOC_OrdenCompra1` (`OrdenCompra_Nu_OrdenCompra` ASC) ,
  INDEX `fk_DetalleOC_Articulo1` (`Articulo_Co_Articulo` ASC) ,
  CONSTRAINT `fk_DetalleOC_OrdenCompra1`
    FOREIGN KEY (`OrdenCompra_Nu_OrdenCompra` )
    REFERENCES `jgroup`.`OrdenCompra` (`Nu_OrdenCompra` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DetalleOC_Articulo1`
    FOREIGN KEY (`Articulo_Co_Articulo` )
    REFERENCES `jgroup`.`Articulo` (`Co_Articulo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`DetalleInvitacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`DetalleInvitacion` (
  `Nu_Item` INT NULL ,
  `Co_DetalleInvitacion` VARCHAR(45) NULL ,
  `Nu_Cantidad` INT NULL ,
  `Tx_Observacion` VARCHAR(45) NULL ,
  `Invitacion_Nu_Invitacion` INT NOT NULL ,
  `Articulo_Co_Articulo` INT NOT NULL ,
  PRIMARY KEY (`Invitacion_Nu_Invitacion`, `Articulo_Co_Articulo`) ,
  INDEX `fk_DetalleInvitacion_Invitacion1` (`Invitacion_Nu_Invitacion` ASC) ,
  INDEX `fk_DetalleInvitacion_Articulo1` (`Articulo_Co_Articulo` ASC) ,
  CONSTRAINT `fk_DetalleInvitacion_Invitacion1`
    FOREIGN KEY (`Invitacion_Nu_Invitacion` )
    REFERENCES `jgroup`.`Invitacion` (`Nu_Invitacion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DetalleInvitacion_Articulo1`
    FOREIGN KEY (`Articulo_Co_Articulo` )
    REFERENCES `jgroup`.`Articulo` (`Co_Articulo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `jgroup`.`Areas`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jgroup`.`Areas` (
  `Co_Area` INT NOT NULL ,
  `No_Area` VARCHAR(45) NULL ,
  `Usuario_Co_Usuario` INT NOT NULL ,
  PRIMARY KEY (`Co_Area`) ,
  INDEX `fk_Areas_Usuario` (`Usuario_Co_Usuario` ASC) ,
  CONSTRAINT `fk_Areas_Usuario`
    FOREIGN KEY (`Usuario_Co_Usuario` )
    REFERENCES `jgroup`.`Usuario` (`Co_Usuario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
