CREATE DATABASE FTP88;
USE FTP88;

DROP TABLE EMPLOYEE_DETAILS

CREATE TABLE EMPLOYEE_DETAILS
(
	EMP_ID INT PRIMARY KEY,
    EMP_FULLNAME VARCHAR(30),
    EMP_EMAILID VARCHAR(30),
    EMP_MOBILENO VARCHAR(30),
    EMP_JOINDATE DATE,
    EMP_DEPT VARCHAR(30),
    EMP_LEAVEBAL INT,
    EMP_MGRID INT,
    FOREIGN KEY(EMP_MGRID) REFERENCES EMPLOYEE_DETAILS(EMP_ID)
)
;


CREATE TABLE LEAVE_DETAILS
(   LEA_EMPID INT,
	LEA_ID INT PRIMARY KEY AUTO_INCREMENT,
	LEA_STARTDATE DATE,
    LEA_ENDDATE DATE,
    LEA_TYPE ENUM ('EL','ML','SL'),
    LEA_STATUS ENUM('PENDING','APPROVED','DENIED'),
    LEA_REASONS VARCHAR(30),
    LEA_APPLIEDON DATE,
    LEA_MGRCOMMENT VARCHAR(30),
    FOREIGN KEY(LEA_EMPID) REFERENCES EMPLOYEE_DETAILS(EMP_ID)
);


INSERT INTO  EMPLOYEE_DETAILS (EMP_ID,EMP_FULLNAME,EMP_EMAILID,EMP_MOBILENO,EMP_JOINDATE,
            EMP_DEPT,EMP_LEAVEBAL,EMP_MGRID)
        VALUES
        (1000,'VAIBHAV TAWARE','VAIBHAVT2@HEXAWARE.COM',9876543210,'2018-10-04','JAVA',10,NULL),
		(2000,'KAUSHAL SINGH','KAUSHALKUMARS@HEXAWARE.COM',9979421498,'2018-10-10','SQL',30,1000),
		(3000,'DHANYA GOUDAR','DHANYA@HEXAWARE.COM',9876543410,'2018-10-15','TESTING',6,1000),
		(4000,'GAZALA','GAZALAT@HEXAWARE.COM',8856421498,'2018-10-13','JAVA',20,2000),
        (5000,'VAIBHAV SINGH','VAIBHAVSINGH@HEXAWARE.COM',7879427898,'2018-10-04','DOTNET',5,3000)



SELECT * FROM EMPLOYEE_DETAILS;


