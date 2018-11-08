use sqlpractice

Drop table AgentPolicy

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

VALUES(1,1,2),
					(1,3,1),
					(2,3,1),
					(2,1,1),
					(2,4,1),
					(2,5,1),
					(4,1,2),
					(4,3,1),
					(5,1,2),
					(5,2,1)

select * from AgentPolicy

select Agent.AgentId,FirstName,LastName,City,SSN,IsSplitAgent
FROM AGENT,AGENTPOLICY
WHERE Agent.AgentId=AgentPolicy.AgentId

-- ANSI STANDARD
select Agent.AgentId,FirstName,LastName,City,SSN,IsSplitAgent
FROM AGENT INNER JOIN
AGENTPOLICY
ON Agent.AgentId=AgentPolicy.AgentId

-- above query with alias

select A.AgentId,FirstName,LastName,City,SSN,IsSplitAgent
FROM AGENT A
 INNER JOIN
AGENTPOLICY AP
ON A.AgentId=A.AgentId

SELECT
P.PolicyID,
AppNumber,
ModalPremium,
PaymentModeID,
ISSplitAgent
FROM POLICY P
INNER JOIN
AGENTPOLICY AP
ON P.PolicyID=AP.PolicyID

-- left join
select A.AgentId,FirstName,LastName,City,SSN,IsSplitAgent
FROM AGENT A
 LEFT JOIN
AGENTPOLICY AP
ON A.AgentId=A.AgentId

-- joining 3 tables

select
A.AgentID,FirstName,LastName,City,P.PolicyID,AppNumber,
ModalPremium,
PaymentModeID,
ISSplitAgent,SSN,IsSplitAgent
FROM 
Agent A
INNER JOIN
AGENTPOLICY AP
ON A.AgentID=A.AgentID
INNER JOIN
POLICY P
 ON P.PolicyID=AP.PolicyID
 
 -- left join
 
 select
A.AgentID,FirstName,LastName,City,P.PolicyID,AppNumber,
ModalPremium,
PaymentModeID,
ISSplitAgent,SSN,IsSplitAgent
FROM 
Agent A
LEFT JOIN
AGENTPOLICY AP
ON A.AgentID=A.AgentID
 LEFT JOIN
POLICY P
 ON P.PolicyID=AP.PolicyID
 
 -- rigth join
 
 select
A.AgentID,FirstName,LastName,City,P.PolicyID,AppNumber,
ModalPremium,
PaymentModeID,
ISSplitAgent,SSN,IsSplitAgent
FROM 
Agent A
RIGHT JOIN
AGENTPOLICY AP
ON A.AgentID=A.AgentID
 RIGHT JOIN
POLICY P
 ON P.PolicyID=AP.PolicyID
 
select AgentID,FirstName,LastName,City,SSN FROM AGENT

select PolicyID,AppNumber,ModalPremium,AnnualPremium,PaymentModeID from POLICY

SELECT AD.AGENTID,AD.FIRSTNAME,
 select * from agent cross join agentpolicy
select * from policy cross join agentpolicy

select max(AnnualPremium) from policy 

select Appnumber from policy
where annualpremium=
(select max(AnnualPremium) from policy)

select appnumber,annualpremium from policy where annualpremium=
(SELECT MAX(AnnualPremium) From policy WHERE AnnualPremium < ( SELECT Max(AnnualPremium) FROM policy)) 

select MAX(AnnualPremium) from policy
WHERE AnnualPremium <> (select MAX(AnnualPremium) from policy )

select AnnualPremium
from policy p1
where 5-1=
(select distinct count(*) from policy p2 where p2.AnnualPremium>p1.AnnualPremium)

select * from agent where agentid  <> all(select agentid from agentpolicy)


