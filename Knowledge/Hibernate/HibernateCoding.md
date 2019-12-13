### Field and columns Convention

|Field name |default column name(Oracle)|
|-|-|
|missionId|mission_id|
| missionName|mission_name|
| agency|agency|
| missionID|missionid|
**Hint** : Oracle creates column by putting '_'[underscore]
**Special Case**: *missionID* will be created as *missionid*


## Transaction Manager with Spring
**What?:** <br>Takes care fo transactions: beginTransaction and commitTransaction
#### @Transactional
    
####    Steps:
**Step 1:**<br>

Define the methods which contains transactions with the annotation and we can remove transaction statements.

**Step 2:**
<br>In the configuration file, define the transactionmanager class bean and map it to the sessionfactory beans.

```java
<bean id="myTransactionManager
class="org.springframework....'>
<property name="sessionFactory" ref=sessionFactory><!-- refers to sessionFactory Bean-->

<tx:annotation-driventransaction-manager="myTransactionManager"/>
```


## Connection Pooling
What?: Takes care of session opening.

Why?: To reduce number of session(connections)

### Scenario: 3 requests are coming at once
- We need to create 3 new connections for each request.
- But suppose,If there is a surge(no of connections increases abruptly ex- 1-100): *we need to create 100s of connections at once(Affects performance*.
- We can always keep say 100 connections open: *but it will affect the cost performance*.
 

`So, we keep a pool of connections, whenever request comes, they go to connection pools and are instantiated and when work is done deinstantiated, thus igonring creation and deletion of connection each time.`

**Programmatically**:
It creates the sessionFactory for us and opens the session.
Thus, while working on the request we just need to perform getsession and perform operations.

```java
Syntax:
Session curreentSession=sessionFactory.getSession();
```


    
 

    





