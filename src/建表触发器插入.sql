USE supermarket;
CREATE TABLE Provider
(
ProvideId INT(8) PRIMARY KEY,
ProvideName CHAR(30),
Contact CHAR(30),
Phone INT(11),
ProvideAdd CHAR(30),
Account INT(20),
Providerank INT(2)
)


CREATE TABLE Employee
(
EmId INT(8) PRIMARY KEY,
EmName CHAR(5),
Sex CHAR(2),
Age INT(3),
IdCard INT(18),
Phone INT(11),
HireDate DATE,
Post CHAR(2)
)


CREATE TABLE UserLog
(
LogId INT(8) PRIMARY KEY,
LogName CHAR(10),
LogPassword CHAR(20),
LogLimit INT(2),
FOREIGN KEY(LogId) REFERENCES Employee(EmId)
)



CREATE TABLE Product
(
ProId INT(8) PRIMARY KEY,
ProName CHAR(30),
ProShelf CHAR(2),
ProPrice NUMERIC(10,2),
ProSize CHAR(10),
ProCatagory CHAR(10),
SalesDay INT(8),
ProvideId INT(8),
SafeStock INT(4),
FOREIGN KEY(ProvideId) REFERENCES Provider(ProvideId)
)

CREATE TABLE PutIn
(
ImpBill INT(10),
ProId INT(8),
ProvideId INT(8),
ProDate DATE,
Num INT(4),
ImpPrice NUMERIC(10,2),
ImpDate DATE,
ExpDate DATE,
Operator CHAR(10),
PRIMARY KEY(ProId,ImpBill),
FOREIGN KEY(ProId) REFERENCES Product(ProId),
FOREIGN KEY(ProvideId) REFERENCES Provider(ProvideId)
)

CREATE TABLE Stock
(
ProId INT(8),
ProDate DATE,
StoreNum INT(4),
PRIMARY KEY(ProId,ProDate),
FOREIGN KEY(ProId) REFERENCES PutIn(ProId)
)


CREATE TABLE ChangePrice
(
ProId INT(8),
OldImpPrice NUMERIC(10,2),
NewImpPrice NUMERIC(10,2),
OldSalePrice NUMERIC(10,2),
NewSalePrice NUMERIC(10,2),
AlterTime DATE,
PRIMARY KEY(ProId)

)


CREATE TABLE SaleRecord
(
SaleNo INT(8),
ProId INT(8),
ProDate DATE,
SaleDate DATE,
SaleNum INT(4),
ModeOfPay INT (2),
PRIMARY KEY(ProId,SaleNo,ProDate),
FOREIGN KEY(ProId,ProDate)REFERENCES Stock(ProId,ProDate)
)


CREATE TABLE Sales
(
ProId INT(8),
ProDate DATE,
Promotion CHAR(12),
SaleDate DATE,
PRIMARY KEY(ProId,ProDate),
FOREIGN KEY(ProId,ProDate) REFERENCES Stock(ProId,ProDate)
)

CREATE TABLE ReturnPro
(
ReturnId INT(8),
SaleId INT(8),
ProId INT(8),
ProDate DATE,
ReturnNum INT(4),
PRIMARY KEY(ReturnId,SaleId,ProId,ProDate),
FOREIGN KEY(ProId,ProDate) REFERENCES salerecord(ProId,ProDate)
)

CREATE TABLE RemindIn
(
ProId INT(8) PRIMARY KEY,
InNum INT(11),
RemDate DATE
)


DELIMITER $$
CREATE
    TRIGGER ` test`.`adds` AFTER INSERT
    ON ` test`.`putin`
    FOR EACH ROW BEGIN
      SET  @spid=new.ProId;
      SET  @scrq=new.ProDate;
      SET  @rksl=new.Num;
      INSERT stock SET StoreNum= @rksl,ProDate=@scrq,ProId=@spid ; 
    END$$
DELIMITER ;


DELIMITER $$
CREATE
    TRIGGER `test`.`sale` AFTER INSERT
    ON `test`.`salerecord`
    FOR EACH ROW BEGIN
      SET  @spid=new.ProId;
      SET  @scrq=new.ProDate;
      SET  @xssl=new.SaleNum;
      UPDATE stock SET StoreNum=StoreNum-@xssl WHERE ProDate=@scrq AND ProId=@spid ; 
    END$$
DELIMITER ;


DELIMITER $$
CREATE
    TRIGGER `test`.`return` AFTER INSERT
    ON `test`.`returnpro`
    FOR EACH ROW BEGIN
      SET  @spid=new.ProId;
      SET  @scrq=new.ProDate;
      SET  @thsl=new.ReturnNum;
      UPDATE stock SET StoreNum=StoreNum+@thsl WHERE ProDate=@scrq AND ProId=@spid ; 
    END$$
DELIMITER ;



INSERT INTO product VALUES ("1","草莓","1#","2.0","50g","水果","1","1","20")
INSERT INTO product VALUES ("2","苹果","1#","4.5","200g","水果","10","1","10")
INSERT INTO product VALUES ("3","牛奶","2#","6.0","200ml","饮料","60","2","30")
INSERT INTO product VALUES ("4","橙汁","2#","3.5","500ml","饮料","30","2","10")
INSERT INTO product VALUES ("5","话梅","3#","4.5","100g","零食","10","3","10")
INSERT INTO product VALUES ("6","果脯","3#","4.5","100g","零食","10","3","10")



INSERT INTO provider VALUES ("1","水果商","王五","13474","昌吉","6226","1")
INSERT INTO provider VALUES ("2","饮料商","张三","13765","南一环","6226","1")
INSERT INTO provider VALUES ("3","果干商","李四","18781","小港","6226","1")


INSERT INTO employee VALUES ("1","店长","女","36","42000","18755","2006-03-22","0")
INSERT INTO employee VALUES ("2","收银员","男","35","23000","18696","2010-02-20","1")
INSERT INTO employee VALUES ("3","库管员","男","28","47000","13636","2016-11-20","2")
INSERT INTO employee VALUES ("4","信息员","男","26","31000","18666","2017-12-10","3")
INSERT INTO employee VALUES ("5","理货员","女","30","15000","18666","2014-12-10","4")



INSERT INTO userlog VALUES ("1","店长","42000","0")
INSERT INTO userlog VALUES ("2","收银员","23000","1")
INSERT INTO userlog VALUES ("3","库管员","47000","2")
INSERT INTO userlog VALUES ("4","信息员","31000","3")
INSERT INTO userlog VALUES ("5","理货员","15000","4")



INSERT INTO putin VALUES ("1","1","1","2018-02-02","200","1.0","2018-02-02","2018-02-20","库管员")
INSERT INTO putin VALUES ("2","2","1","2018-02-02","300","3.0","2018-02-02","2018-02-28","库管员")
INSERT INTO putin VALUES ("3","3","2","2018-03-02","200","4.0","2018-03-08","2018-09-20","库管员")
INSERT INTO putin VALUES ("4","4","2","2018-03-02","200","2.5","2018-03-02","2018-09-20","库管员")
INSERT INTO putin VALUES ("5","5","3","2018-05-11","300","3.0","2018-05-20","2019-02-20","库管员")
INSERT INTO putin VALUES ("6","6","3","2018-05-11","300","3.0","2018-05-20","2019-02-20","库管员")

INSERT INTO salerecord VALUES ("1","1","2018-02-02","2018-02-20","10","0")
INSERT INTO salerecord VALUES ("2","2","2018-02-02","2018-02-04","30","1")
INSERT INTO salerecord VALUES ("3","3","2018-03-02","2018-09-20","20","0")
INSERT INTO salerecord VALUES ("4","4","2018-03-02","2018-09-20","20","2")
INSERT INTO salerecord VALUES ("5","5","2018-05-11","2019-02-20","15","1")
INSERT INTO salerecord VALUES ("6","6","2018-05-11","2019-02-20","10","1")
