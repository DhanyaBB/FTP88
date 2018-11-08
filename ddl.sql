create database classroom

use classroom

drop table empoly

create table empoly 
(empno int,
 name varchar(30) not null,
 dob date not null, 
 dept varchar(30), 
 desig varchar(30),
 salary int ,
 primary key(empno))
 
 insert into empoly values
 (1,'shyam','1996-10-20','fullstack','developer',66222),
(2,'vaibhav','1995-12-22','fullstack','expert',99322),
 (3,'Anshuman','1994-10-12','sql','dba',88233)
 
 select * from empoly
 
 create table emp
 ( empno int auto_increment,name varchar(30),
 dept varchar(40),
 desig varchar(40),
 basic int,
 primary key(empno)
 )
 
 insert into emp(name,dept,desig,basic)
 values ('kiran kumar kailasam','java','developer',42233),
('Vishnu Vardhan Reddy','dotnet','programmer',42133),
('Ram Kishan','java','developer',82233),
('Kareem','dotnet','programmer',52234),
('Sheik Sulthan Mohammad','dotnet','developer',42555),
('Vaibhav Singh','java','Manager',82552),
('Rashmi Jadhav','Sql','DBA',42345),
('Vishnu Priya','Sql','Expert',56662)

Create Table lEAVEdETAILS
(
   LeavID INT AUTO_INCREMENT,
   Empno INT REFERENCES Emp(Empno), 
   pRIMARY KEY(lEAViD),
   lAVAIL INT,LTAKEN INT
)
INSERT INTO lEAVEDETAILS(EMPNO,LAVAIL,LTAKEN)
VALUES(1,2,3),
	   (3,2,3),
	  (4,3,3),
      (5,2,2),
      (1,3,2),
      (3,3,0),
      (4,3,5) 
select * from lEAVEDETAILS

drop table agent if exists
 
 create table agent 
 ( 
 agentid int auto_increment,
 firstname varchar(30),
 MI varchar(1),
 lastname varchar(30),
 fullname varchar(30),
 gender varchar(30),
 dob date,
 ssn varchar(30),
 maritalstatus int,
 address1 varchar(30),
 address2 varchar(30),
 city varchar(30),
 state varchar(30),
 zipcode varchar(30),
 country varchar(30),
 primary key(agentid)
 )
 Create Table Policy
(
  PolicyID int AUTO_INCREMENT,
  AppNumber varchar(30),
  AppDate date,
  PolicyNumber varchar(30),
  AnnualPremium numeric(9,2),
  PaymentModeID int CHECK(PaymentModeID IN(1,2,3)),
  ModalPremium numeric(9,2),
  constraint pk_policy_policyID primary key(PolicyID)
)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A001','2010-1-12','C001',12000,2,2000),
('A002','2010-12-12','C002',20000,1,12000),
('A003','2010-12-12','C003',150000,1,20000),
('A004','2005-01-02','P001',22000,1,1000),
('A005','2009-09-03','S231',122000,2,22000),
('A006','2010-02-12','A131',232000,2,21000),
('A007','2007-09-11','P231',212000,2,23000),
('A008','2009-11-12','S231',122000,2,22000),
('A009','2009-10-10','I231',192000,1,24000)	

create table AgentPolicy
(
   AgentID INT REFERENCES Agent(AgentID),
   PolicyID INT REFERENCES Policy(PolicyID),
   IsSplitAgent INT,
   constraint pk_agp primary Key(AgentID,PolicyID)
)

truncate table AgentPolicy

select * from AgentPolicy

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(1,1,2),(1,3,1),(2,3,1),(2,1,1),
(2,4,1),(2,5,1),(4,1,2),(4,3,1),(5,1,2),(5,2,1)

create table student
(
sno int primary key,
name varchar(30),
sub1 int, 
sub2 int,
sub3 int,
total int,
aveg float
)	

insert into student(sno,name,sub1,sub2,sub3)
values(1,'alka',78,56,78),
(2,'shyam',99,46,79),
(3,'pooja',84,76,85),
(4,'gazala',44,84,99)

select * from student
-- update
update student
set
total=sub1+sub2+sub3,
aveg=(sub1+sub2+sub3)/3