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

Theory and Practical
#Dual Table
It is a tabele having only one column.
can be used for testing and for dummy variables.

select 2*10+10 from dual;
//will return a column in dual having 20
__________
|2*10+10 |
|--------|
|20      |
|        |
|________|

#Concatenation operator(||)
Hi||first_name
Result: Hifirst_name