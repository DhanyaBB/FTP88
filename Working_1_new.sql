drop table Agent 

Create Table Agent
(
	AgentID INT AUTO_INCREMENT,
	FirstName varchar(30), 
   MI varchar(1),
   LastName varchar(30),
   FullName varchar(80),
   Gender varchar(10),
    Dob date,
    SSN varchar(30),
    MaritalStatus INT,
    Address1 varchar(30),
    Address2 varchar(30),
    City varchar(30),
    State varchar(30),
    ZipCode varchar(30),
    Country varchar(30),
    Primary Key(AgentID)
  )

  

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values('Sunitha','P','Premjee','Female','1988-02-01','434-55-3323',
1,'5th Avenue','Near Church','Parlin','NJ','434554','USA'),
('Pranitha','R','Reddy','Female','1986-01-02','324-55-2344',
1,'8th Mile','Sterling Heights','Detroit','MI','442345','USA'), 			
('Shavetha','D','Datta','Female','1980-03-08','643-34-4443',
0,'Dwaraka Nagar','5th Phase','NewDelhi','UP','438533','INDIA'),
('Shanthi','T','Tangvel','Female','1983-09-12','644-23-4534',
1,'Near Food Court','2nd Phase','Chicago','MI','483845','USA'),
('ashraf','V','Vahora','Male','1983-09-10','435-22-5212',
1,'8th Avenue','Church Road','Maywood','NJ','78434','USA') ,
('Ramesh','L','Gole','Male','1981-12-12','643-34-7373',
0,'5th Phase','Sterling Heights','Detroit','MI','477843','USA'),
('Lavanya','S','K','FeMale','1988-12-12','335-44-2344',
0,'LIG B87','ASRAO NR','SECBAD','AP','500062','INDIA'),
('Murali','S','Krishna','Male','1986-09-03',
'234-44-2335',1,'RK HOstel','Ameerpet','HYDBAD','AP',
'500042','INDIA'),
('Raj','S','kumar','Male','1987-12-12',
'345-23-4211',0,'MadhaPur','Nr Cyber Towers','HYDBAD','AP',
'509244','INDIA'),
('Srimukha','S','Manchu','FeMale','1986-12-12',
'231-44-2335',0,'NRS','Madhapur','HYDBAD','AP',
'500042','INDIA'),
('Lalitha','S','B','FeMale','1987-11-12',
'341-23-4211',0,'KondaPur','Nr Stadium','HYDBAD','AP',
'509244','INDIA'),
('Rakesh','K','Chowdary','Male',
'1986-01-12','123-23-2444',1,'8th Mile','Church Road','Detroit',
'MI','484555','USA'),
('Rama','U','Rao','Male',
'1983-01-12','223-43-1444',1,'5th Mile','Ford Street','Chicago',
'NY','2484555','USA'),
('Madhuri','S','M','FeMale',
'1989-12-12','423-33-2444',1,'Beach Street','Univ Road','NewYork',
'CT','5484555','USA'),
('Prafulla','U','Rao','FeMale',
'1987-01-02','523-22-2644',1,'8th Mile','IBM Road','Detroit',
'MI','484555','USA'),
('Prasanna','P','Kumar','Male',
'1980-03-09','423-23-1444',1,'ASRAO NR','Good Luck Cafe','SECBAD',
'AP','500 062','INDIA') 

use sqlpractice

<<<<<<< HEAD
select * from Agent
select maritalstatus from Agent 

=======
select * from Agent 
show databases;
show tables;
desc agent;
SELECT AgentID, FirstName, LastName,City,SSN from AGENT;
select  * from agent where agentid = 5;
select * from agent where city ='detroit';
select * from agent where maritalstatus =0;
select * from agent where agentid between 1 and 5;
select * from agent where agentid not between 1 and 5;
select * from agent where firstname like 'p%';
select * from agent where agentid in (1,2,3);
select * from agent where firstname in ('pranitha','madhuri');   
select agentid,firstname, lastname, city, state from agent order by city;
select agentid,firstname, lastname, city, state from agent order by city, firstname;    
select               
>>>>>>> dc91ddc9337642b4c85b933ab81b9ba8a47a851a
