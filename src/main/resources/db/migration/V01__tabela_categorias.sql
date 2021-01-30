CREATE TABLE IF NOT EXISTS `categoria` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


INSERT INTO `categoria` (`codigo`, `nome`) VALUES
	(1, 'Lazer'),
	(2, 'Alimentação'),
	(3, 'Supermercado'),
	(4, 'Farmácia'),
	(5, 'Outros');
