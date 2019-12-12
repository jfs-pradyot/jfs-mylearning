--Mission Table

create table mission(
missionid varchar2(25) Primary Key,
missionname varchar2(25),
spacecraft varchar2(25),
agency varchar(25),
status varchar(30));

insert into mission values('M12','Mars','Rover','NASA','Success');
select * from mission;
drop table mission;
--Mission Table

--Astronaut Table
CREATE TABLE ASTRONAUT
   (	ASTRONAUT_ID VARCHAR2(255 CHAR), 
	ASTRONAUT_COUNTRY VARCHAR2(255 CHAR), 
	ASTRONAUT_GENDER VARCHAR2(255 CHAR), 
	ASTRONAUT_NAME VARCHAR2(255 CHAR)
   );
insert into astronaut values('A01','India','Male','Rakesh');

select * from astronaut;

drop table astronaut;

--Astronaut Table

--Employee Table
create table employees(
employee_id NUMBER(6) PRIMARY KEY, last_name varchar2(25)
);

insert into employees values('1','verma');
select * from employees;

--Order Table
CREATE TABLE Orders (
    OrderID NUMBER(6) PRIMARY KEY NOT NULL,
    shipped_date DATE NOT NULL,
    employee_id number(6));
    
    drop table orders;
commit;

ALTER TABLE Orders
ADD CONSTRAINT FK_PersonOrder
FOREIGN KEY (employee_id) REFERENCES employees (employee_id)
      ON DELETE CASCADE;

select * from orders;

commit;



insert into orders values('1','2',date '2019-08-28');

