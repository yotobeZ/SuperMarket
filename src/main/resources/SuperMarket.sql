/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2018-07-02 02:30:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for changeprice
-- ----------------------------
DROP TABLE IF EXISTS `changeprice`;
CREATE TABLE `changeprice` (
  `ProId` int(8) NOT NULL DEFAULT '0',
  `OldImpPrice` decimal(10,2) DEFAULT NULL,
  `NewImpPrice` decimal(10,2) DEFAULT NULL,
  `OldSalePrice` decimal(10,2) DEFAULT NULL,
  `NewSalePrice` decimal(10,2) DEFAULT NULL,
  `AlterTime` date DEFAULT NULL,
  PRIMARY KEY (`ProId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of changeprice
-- ----------------------------

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EmId` int(8) NOT NULL,
  `EmName` char(5) DEFAULT NULL,
  `Sex` char(2) DEFAULT NULL,
  `Age` int(3) DEFAULT NULL,
  `IdCard` int(18) DEFAULT NULL,
  `Phone` int(11) DEFAULT NULL,
  `HireDate` date DEFAULT NULL,
  `Post` char(2) DEFAULT NULL,
  PRIMARY KEY (`EmId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '店长', '女', '36', '42000', '18755', '2006-03-22', '0');
INSERT INTO `employee` VALUES ('2', '收银员', '男', '35', '23000', '18696', '2010-02-20', '1');
INSERT INTO `employee` VALUES ('3', '库管员', '男', '28', '47000', '13636', '2016-11-20', '2');
INSERT INTO `employee` VALUES ('4', '信息员', '男', '26', '31000', '18666', '2017-12-10', '3');
INSERT INTO `employee` VALUES ('5', '理货员', '女', '30', '15000', '18666', '2014-12-10', '4');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ProId` int(8) NOT NULL,
  `ProName` char(30) DEFAULT NULL,
  `ProShelf` char(2) DEFAULT NULL,
  `ProPrice` decimal(10,2) DEFAULT NULL,
  `ProSize` char(10) DEFAULT NULL,
  `ProCatagory` char(10) DEFAULT NULL,
  `SalesDay` int(8) DEFAULT NULL,
  `ProvideId` int(8) DEFAULT NULL,
  `SafeStock` int(4) DEFAULT NULL,
  PRIMARY KEY (`ProId`),
  KEY `ProvideId` (`ProvideId`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`ProvideId`) REFERENCES `provider` (`ProvideId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '草莓', '1#', '2.00', '50g', '水果', '1', '1', '20');
INSERT INTO `product` VALUES ('2', '苹果', '1#', '4.50', '200g', '水果', '10', '1', '10');
INSERT INTO `product` VALUES ('3', '牛奶', '2#', '6.00', '200ml', '饮料', '60', '2', '30');
INSERT INTO `product` VALUES ('4', '橙汁', '2#', '3.50', '500ml', '饮料', '30', '2', '10');
INSERT INTO `product` VALUES ('5', '话梅', '3#', '4.50', '100g', '零食', '10', '3', '10');
INSERT INTO `product` VALUES ('6', '果脯', '3#', '4.50', '100g', '零食', '10', '3', '10');

-- ----------------------------
-- Table structure for provider
-- ----------------------------
DROP TABLE IF EXISTS `provider`;
CREATE TABLE `provider` (
  `ProvideId` int(8) NOT NULL,
  `ProvideName` char(30) DEFAULT NULL,
  `Contact` char(30) DEFAULT NULL,
  `Phone` int(11) DEFAULT NULL,
  `ProvideAdd` char(30) DEFAULT NULL,
  `Account` int(20) DEFAULT NULL,
  `Providerank` int(2) DEFAULT NULL,
  PRIMARY KEY (`ProvideId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of provider
-- ----------------------------
INSERT INTO `provider` VALUES ('1', '水果商', '王五', '13474', '昌吉', '6226', '1');
INSERT INTO `provider` VALUES ('2', '饮料商', '张三', '13765', '南一环', '6226', '1');
INSERT INTO `provider` VALUES ('3', '果干商', '李四', '18781', '小港', '6226', '1');

-- ----------------------------
-- Table structure for putin
-- ----------------------------
DROP TABLE IF EXISTS `putin`;
CREATE TABLE `putin` (
  `ImpBill` int(10) NOT NULL DEFAULT '0',
  `ProId` int(8) NOT NULL DEFAULT '0',
  `ProvideId` int(8) DEFAULT NULL,
  `ProDate` date DEFAULT NULL,
  `Num` int(4) DEFAULT NULL,
  `ImpPrice` decimal(10,2) DEFAULT NULL,
  `ImpDate` date DEFAULT NULL,
  `ExpDate` date DEFAULT NULL,
  `Operator` char(10) DEFAULT NULL,
  PRIMARY KEY (`ProId`,`ImpBill`),
  KEY `ProvideId` (`ProvideId`),
  CONSTRAINT `putin_ibfk_1` FOREIGN KEY (`ProId`) REFERENCES `product` (`ProId`),
  CONSTRAINT `putin_ibfk_2` FOREIGN KEY (`ProvideId`) REFERENCES `provider` (`ProvideId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of putin
-- ----------------------------
INSERT INTO `putin` VALUES ('1', '1', '1', '2018-02-02', '200', '1.00', '2018-02-02', '2018-02-20', '库管员');
INSERT INTO `putin` VALUES ('2', '2', '1', '2018-02-02', '300', '3.00', '2018-02-02', '2018-02-28', '库管员');
INSERT INTO `putin` VALUES ('3', '3', '2', '2018-03-02', '200', '4.00', '2018-03-08', '2018-09-20', '库管员');
INSERT INTO `putin` VALUES ('4', '4', '2', '2018-03-02', '200', '2.50', '2018-03-02', '2018-09-20', '库管员');
INSERT INTO `putin` VALUES ('5', '5', '3', '2018-05-11', '300', '3.00', '2018-05-20', '2019-02-20', '库管员');
INSERT INTO `putin` VALUES ('6', '6', '3', '2018-05-11', '300', '3.00', '2018-05-20', '2019-02-20', '库管员');

-- ----------------------------
-- Table structure for remindin
-- ----------------------------
DROP TABLE IF EXISTS `remindin`;
CREATE TABLE `remindin` (
  `ProId` int(8) NOT NULL,
  `InNum` int(11) DEFAULT NULL,
  `RemDate` date DEFAULT NULL,
  PRIMARY KEY (`ProId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of remindin
-- ----------------------------

-- ----------------------------
-- Table structure for returnpro
-- ----------------------------
DROP TABLE IF EXISTS `returnpro`;
CREATE TABLE `returnpro` (
  `ReturnId` int(8) NOT NULL DEFAULT '0',
  `SaleId` int(8) NOT NULL DEFAULT '0',
  `ProId` int(8) NOT NULL DEFAULT '0',
  `ProDate` date NOT NULL DEFAULT '0000-00-00',
  `ReturnNum` int(4) DEFAULT NULL,
  PRIMARY KEY (`ReturnId`,`SaleId`,`ProId`,`ProDate`),
  KEY `ProId` (`ProId`,`ProDate`),
  CONSTRAINT `returnpro_ibfk_1` FOREIGN KEY (`ProId`, `ProDate`) REFERENCES `salerecord` (`ProId`, `ProDate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of returnpro
-- ----------------------------

-- ----------------------------
-- Table structure for salerecord
-- ----------------------------
DROP TABLE IF EXISTS `salerecord`;
CREATE TABLE `salerecord` (
  `SaleNo` int(8) NOT NULL DEFAULT '0',
  `ProId` int(8) NOT NULL DEFAULT '0',
  `ProDate` date NOT NULL DEFAULT '0000-00-00',
  `SaleDate` date DEFAULT NULL,
  `SaleNum` int(4) DEFAULT NULL,
  `ModeOfPay` int(2) DEFAULT NULL,
  PRIMARY KEY (`ProId`,`SaleNo`,`ProDate`),
  KEY `ProId` (`ProId`,`ProDate`),
  CONSTRAINT `salerecord_ibfk_1` FOREIGN KEY (`ProId`, `ProDate`) REFERENCES `stock` (`ProId`, `ProDate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salerecord
-- ----------------------------
INSERT INTO `salerecord` VALUES ('1', '1', '2018-02-02', '2018-02-20', '10', '0');
INSERT INTO `salerecord` VALUES ('2', '2', '2018-02-02', '2018-02-04', '30', '1');
INSERT INTO `salerecord` VALUES ('3', '3', '2018-03-02', '2018-09-20', '20', '0');
INSERT INTO `salerecord` VALUES ('4', '4', '2018-03-02', '2018-09-20', '20', '2');
INSERT INTO `salerecord` VALUES ('5', '5', '2018-05-11', '2019-02-20', '15', '1');
INSERT INTO `salerecord` VALUES ('6', '6', '2018-05-11', '2019-02-20', '10', '1');

-- ----------------------------
-- Table structure for sales
-- ----------------------------
DROP TABLE IF EXISTS `sales`;
CREATE TABLE `sales` (
  `ProId` int(8) NOT NULL DEFAULT '0',
  `ProDate` date NOT NULL DEFAULT '0000-00-00',
  `Promotion` char(12) DEFAULT NULL,
  `SaleDate` date DEFAULT NULL,
  PRIMARY KEY (`ProId`,`ProDate`),
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`ProId`, `ProDate`) REFERENCES `stock` (`ProId`, `ProDate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sales
-- ----------------------------

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `ProId` int(8) NOT NULL DEFAULT '0',
  `ProDate` date NOT NULL DEFAULT '0000-00-00',
  `StoreNum` int(4) DEFAULT NULL,
  PRIMARY KEY (`ProId`,`ProDate`),
  CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`ProId`) REFERENCES `putin` (`ProId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('1', '2018-02-02', '190');
INSERT INTO `stock` VALUES ('2', '2018-02-02', '270');
INSERT INTO `stock` VALUES ('3', '2018-03-02', '180');
INSERT INTO `stock` VALUES ('4', '2018-03-02', '180');
INSERT INTO `stock` VALUES ('5', '2018-05-11', '285');
INSERT INTO `stock` VALUES ('6', '2018-05-11', '290');

-- ----------------------------
-- Table structure for userlog
-- ----------------------------
DROP TABLE IF EXISTS `userlog`;
CREATE TABLE `userlog` (
  `LogId` int(8) NOT NULL,
  `LogName` char(10) DEFAULT NULL,
  `LogPassword` char(20) DEFAULT NULL,
  `LogLimit` int(2) DEFAULT NULL,
  PRIMARY KEY (`LogId`),
  CONSTRAINT `userlog_ibfk_1` FOREIGN KEY (`LogId`) REFERENCES `employee` (`EmId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userlog
-- ----------------------------
INSERT INTO `userlog` VALUES ('1', '店长', '000', '0');
INSERT INTO `userlog` VALUES ('2', 'sy', '000', '1');
INSERT INTO `userlog` VALUES ('3', '库管员', '000', '2');
INSERT INTO `userlog` VALUES ('4', '信息员', '000', '3');
INSERT INTO `userlog` VALUES ('5', '理货员', '000', '4');
DROP TRIGGER IF EXISTS `adds`;
DELIMITER ;;
CREATE TRIGGER `adds` AFTER INSERT ON `putin` FOR EACH ROW BEGIN
      SET  @spid=new.ProId;
      SET  @scrq=new.ProDate;
      SET  @rksl=new.Num;
      INSERT stock SET StoreNum= @rksl,ProDate=@scrq,ProId=@spid ; 
    END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `return`;
DELIMITER ;;
CREATE TRIGGER `return` AFTER INSERT ON `returnpro` FOR EACH ROW BEGIN
      SET  @spid=new.ProId;
      SET  @scrq=new.ProDate;
      SET  @thsl=new.ReturnNum;
      UPDATE stock SET StoreNum=StoreNum+@thsl WHERE ProDate=@scrq AND ProId=@spid ; 
    END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `sale`;
DELIMITER ;;
CREATE TRIGGER `sale` AFTER INSERT ON `salerecord` FOR EACH ROW BEGIN
      SET  @spid=new.ProId;
      SET  @scrq=new.ProDate;
      SET  @xssl=new.SaleNum;
      UPDATE stock SET StoreNum=StoreNum-@xssl WHERE ProDate=@scrq AND ProId=@spid ; 
    END
;;
DELIMITER ;
