CREATE TABLE `categoria` (
	`codigo` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	PRIMARY KEY (`codigo`) USING BTREE
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;
