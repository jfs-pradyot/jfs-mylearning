--union: combine specified columns from both the tables and return only distinct
(select first_name from employees
union 
select contacts.first_name from contacts) order by first_name;


--Union ALL: combine tables and return all(including duplicates)
(select first_name from employees
union all
select contacts.first_name from contacts) order by first_name;

--intersect: To check which are the duplcate records of specifed column in both table
(select first_name from employees
intersect
select contacts.first_name from contacts) order by first_name;

--minus: remove the duplicae records
--minus simply subtracts one table from other, in doing so common records and substracted and we only get distinct rows.
-- Like union
select count(*) 
(select first_name from employees
minus
select contacts.first_name from contacts) t1;

