use sqlpractice
Create Table EmpMgr
(
   Empno INT,
   Name varchar(30),
   Loc varchar(30),
   MgrNo INT,
   Primary Key(Empno)
)


INSERT INTO EmpMgr(Empno,Name,Loc,MgrNo)
values(1,'Anshuman','Mumbai',null),
(2,'Richa','Chennai',1),
(3,'Rashmi','Pune',1),
(4,'Dhanya','Chennai',2),
(5,'Shyam','Chennai',3),
(6,'Vaishnavi','Chennai',2),
(7,'Puja','Mumbai',3),
(8,'Vaibhav','Pune',2),
(9,'Lakshmi','Bangalore',1), 
(10,'Gajala','Mumbai',3)


select * from EmpMgr

select e1.empno,e2.empno,e1.name,e2.name
from EmpMgr e1
inner join EmpMgr e2
on e1.empno=e2.empno

select e1.empno,e2.empno,e1.name,e2.name
from EmpMgr e1
left join EmpMgr e2
on e1.empno=e2.empno

select e1.empno,e2.empno,
case when e1.name is null then 'no manager' else e1.name end 'manager' ,
e2.name,
case e1.name 
when 'Anshuman' then 'mumbai'
when 'Richa' then 'newyork'
when 'Rashmi' then 'Pune'
else 'chennai'
end 'city'
from EmpMgr e1
right join EmpMgr e2
ON e1.empno=e2.MgrNo
order by E1.empno

