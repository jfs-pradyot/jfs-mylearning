create table employee_test (
id number primary key,
name varchar(20) not null,
salary NUMBER(8,2) NOT NULL,
department VARCHAR(20));

insert into employee_test (id,name,salary,department) values ('1','Peter','10000','IT');
insert into employee_test (id,name,salary,department) values ('3','Jackson','50000','IT');
insert into employee_test (id,name,salary,department) values ('2','Marshal','30000','Finance');
insert into employee_test (id,name,salary,department) values ('5','George','14000','IT');
insert into employee_test (id,name,salary,department) values ('8','Jerry','16000','Finance');
insert into employee_test (id,name,salary,department) values ('10','Larry','23000','Marketing');
insert into employee_test (id,name,salary,department) values ('6','Elaine','15000','IT');
insert into employee_test (id,name,salary,department) values ('7','Monica','18000','Finance');
insert into employee_test (id,name,salary,department) values ('4','Suzan','12000','Finance');
insert into employee_test (id,name,salary,department) values ('9','Kramer','10000','Marketing');
insert into employee_test (id,name,salary,department) values ('11','Peter','10000','Marketing');
insert into employee_test (id,name,salary,department) values ('12','Peter','10000','IT');

--grouping by department
select department from employee_test group by department; 
--max salary in each group
select MAX(salary) "Maximum",department from employee_test group by department;


--checking if duplicate name records exist
select  name,
 count(*) from employee_test 
 group by 
 name having count(*) > 1;

--displaying duplicate records for name
select t1.* from 
employee_test t1
inner join  (
select name, count(*) 
from employee_test 
group by name 
having count(*) > 1) t2
on
t1.name=t2.name;


--checking if duplicate name and department records exist
select name , department, count(*) 
from employee_test 
group by name,department;

--displaying duplicate records where name and department are same
select t1.* from 
employee_test t1
inner join
(select name , department, count(*) 
from employee_test 
group by name,department having count(*)> 1 ) t2
on t1.name=t2.name
and t1.department=t2.department
order by t1.name;








