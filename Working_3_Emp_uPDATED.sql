Drop Table Emp

Create Table Emp
(
    Empno int AUTO_INCREMENT,
    Name varchar(50), 
    Dept varchar(30),
    Desig varchar(30),
    Basic INT,
    primary key(Empno)
)



Insert into Emp(Name,Dept,Desig,Basic) values
('kiran kumar kailasam','java','developer',42233),
('Vishnu Vardhan Reddy','dotnet','programmer',42133),
('Ram Kishan','java','developer',82233),
('Kareem','dotnet','programmer',52234),
('Sheik Sulthan Mohammad','dotnet','developer',42555),
('Vaibhav Singh','java','Manager',82552),
('Rashmi Jadhav','Sql','DBA',42345),
('Vishnu Priya','Sql','Expert',56662)

select * from Emp 

drop table LeavedETAILS

use sqlpractice

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

SELECT MAX(basic) From emp WHERE basic < ( SELECT Max(basic) FROM emp)   //1
   
select name,basic from emp where basic=
(SELECT MAX(basic) From emp WHERE basic < ( SELECT Max(basic) FROM emp)) //2

select name,basic
from emp e1
where 5-1=
(select distinct count(*) from emp e2 where e2.basic>e1.basic)//3



select e.empno,name,dept,
case when lavail is null then 'no leave' else ld.lavail end 'status'
from emp e
left join leavedetails ld
on e.empno=ld.empno //4

select * from emp where empno <> all(select empno from leavedetails) //5

select e.dept,
case e.dept 
when 'java' then 'newyork'
when 'Dotnet' then 'washington'
else 'hollywood'
end 'deptt'
from emp e //6

select basic,dept,
case dept
when 'java' then basic+1500
when 'dotnet' then basic+1800
else basic+1000
end 'cd'
from emp

SELECT ED.Name
FROm
(select name,
length(name)-length(replace(name,' ','')) SP
 from Emp) ED
 WHERE ED.Sp=2 //8
 
 SELECT ED.Name
FROm
(select name,
length(name)-length(replace(name,' ','')) SP
 from Emp) ED
 WHERE ED.Sp=1 //9

