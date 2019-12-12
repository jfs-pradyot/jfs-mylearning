###Field and columns Convention

|Field name |default column name(Oracle)|
|-|-|
|missionId|mission_id|
| missionName|mission_name|
| agency|agency|
| missionID|missionid|
**Hint** : Oracle creates column by putting '_'[underscore]
**Special Case**: *missionID* will be created as *missionid*


## Transaction Manager with Spring

#### @Transactional
    
####    Steps:
**Step 1:**<br>

Define the methods which contains transactions with the annotation and we can remove transaction statements.

**Step 2:**
<br>In the configuration file, define the transactionmanager class bean and map it to the sessionfactory beans.

    
 

    





