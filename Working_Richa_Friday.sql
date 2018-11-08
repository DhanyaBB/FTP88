create database sqlpractice;
use sqlpractice;
select curdate();
select curtime()
select addDate(curdate(),interval 1 year)
select addDate(curdate(),interval -3 month)
select addDate(curdate(),interval 100 year)

select dob,
addDate(dob,interval 10 days)
from agent

select date_format(curdate(), '%d')
select date_format(curdate(), '%c')
select date_format(curtime(), '%h')
select date_format(curdate(), '%m')
select date_format(curtime(), '%r')
select date_format(curdate(), '%w')
select date_format(curdate(), '%M')
select date_format(curtime(), '%Y')
select date_format(curtime(), '%s')


select date_format(datediff(curdate(),'2018-12-24'), '%a') //3rd ques



select date_format(curdate(), '%b')
select date_format(curdate(), '%d %M %Y %w')
select date_format(curdate(), '%W')

select dayofmonth(curdate())


select dayofweek(curdate())


select quarter(curdate())


select datediff(curdate(), '2062-2-2')


select last_day(curdate())
select first_day(curdate())

SELECT CONVERT(curdate(),DATEADD(MM, DATEDIFF(MM, 0, GETDATE())-1, 0))

select date_format(curdate(), '%M %Y')

select addDate('2018-11-01', interval -1 month)
select datediff(curdate(),'2018-12-24')

select addDate(curdate(), interval 5 year, interval 6 month, interval 7 day)

select case
when date_format('2018-11-01', '%w') +1

select last_day(curdate())

select adddate(last_day(curdate()),interval 1 day)

select adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)


select dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 

select adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 6-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 'First Friday', 
 
 adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 13-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 'Second Friday',
 
 adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 20-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 'Third Friday', 
 
 adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 27-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 'Fourth Friday',
 
 CASE WHEN 
 month(curdate())=
 month(adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 34-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day))  THEN 
 adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 34-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 
 else '' 
 END 'Fifth Friday'
 
 
 
 
 select 
 adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 34-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 'Fifth Friday',
 
 
 select 
 CASE WHEN 
 month(curdate())=
 month(adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 34-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day))  THEN 
 adddate(
adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)
,interval 34-dayofweek(adddate(adddate(last_day(curdate()),interval 1 day),interval -1 month)) 
 day) 
 else '' 
 END 'Fifth Friday'
 
 
 select month(curdate())
 
 
 
 
 
