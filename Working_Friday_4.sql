select dayofweek(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month))    
    
select adddate(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month),interval 6-dayofweek(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month))   DAY) 'First Friday',

adddate(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month),interval 13-dayofweek(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month))   DAY) 'Second Friday',
    
adddate(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month),interval 20-dayofweek(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month))   DAY) 'Third Friday',
    
adddate(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month),interval 27-dayofweek(adddate(
adddate(last_day(curdate()),interval 1 Day)
	,interval -1 month))   DAY) 'Fourth Friday'    
