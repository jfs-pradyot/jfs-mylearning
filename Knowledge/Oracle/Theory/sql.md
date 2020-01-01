Primary Key and Foreign Key 
Joins


Oracle
Oracle XE- Database Instance
OracleServiceXE- It runs the oracle services
https://www.oracle.com/database/technologies/xe-prior-releases.html
OracleTNSListener- like a event listener, It connects to the oracle.

User Interface
Sql Command line
Sql Developer IDE

<Some users>
hr account
sys account
system account

Roles
sysdba- it is a role defined
To connect as sysdba , use as sysdba

Not able to connect to sys user in the sql developer but able to 
connect from sql command line.
One Sol: change the password of sys(which has the role of sysdba) 
to any password, then it will work.
We can again change the password back to default(which in my case was system)
it will work again.

#Escape character
use q'[]
Varchar: oracle's database
put the string in[] q'[oracle's database]'
result: oracle's database

#describe: use to describe the structure of the table
describe table_name
or desc table_name;

# Restricting the number of rows.



#PLSQL
##Difference bw Procedure and Function
In programming, we usually use these terms interchangeably,
but in the backend(usually databases) this is not the case.
Procedure
A procedure does not return a value

Funtion 
It returns a value.

As packages in c contains many functions which we use, similarly
in plsql we use packages containing functions or procedures.

#Setting for sqldeveloper to view the outputs of plsql
SET SERVEROUTPUT ON;

#TYPE Operator
If we want a column to have the same datatype of any other datatype.
1 method is to go and look the datatype of the column and assign.
2nd method: Use %TYPE
used to take the datatype of the defined column.

myname mytable.column_name%TYPE;

#Bind Variables
Created by the sqldeveloper environment,we can access the stored value outside of the plsql block.

declare bind variable
begin the plsql
assign it a value into the plsql block
finish the plsql block

print bindvariable


#Substitution Variable
Are used to get user input at run time 
declared using &
Ex: into myname:=&mynamevalue

####DML Operations in the PLSQL

#Insert
#Update
#Delete

#Merge Statement()
merge the records from one table to another.
if present then update else insert

#To create a table from another table structure
CREATE TABLE dept AS SELECT * FROM departments;
--This will take the values also from the departments table.
If we want to take only structure, then put a condition that will never become full.[ex: 1=2]
CREATE TABLE dept AS SELECT * FROM departments;