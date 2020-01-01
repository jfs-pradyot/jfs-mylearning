# Joins
- allow you to query data from two or more related tables.

## Why the name joins?
- JOIN (obtain the desired )the required columns from the tables by applying some condition on the tables.
- Forms a result set and return it.

# Study of a join.
### Components of a join

![Components if join](joins.png)

## Working
```sql 
select t1.column2, t2.column1
from table1 t1
join_type table2 t2 on join_predicate
```

- The query returns a result set by combining column values of both tables T1 and T2 based on the join predicate.
- Compares each row of t1 with t2 to find all rows that satisfies the join_predicate.
- **Obtains the pair of rows that satisfies join predicate. 
- **This pair of rows will have column values based on the type of join used.
- Extract the required columns value from the pair of rows obtained.
- Provide it in a resultset


# Types of Joins

##  Self Join
- can join a table to itself to query hierarchical data.
- can use inner join, left join, or right join.

## Inner Join
Returns values only when match occurs.
- Join_predicate is satsified-> return values for the rows from both the tables.
- Join_predicate is not satsified-> does not return values for the rows.[not even the null]

## Left Join
Always returns value for the row coming from the left table.
- Join_predicate is satsified-> return values for the rows from both the tables.
- Join_predicate is not satsified-> returns values of rows only from left table, for the right table returns null.

## Right Join
Always returns value for the row coming from the right table.
- Join_predicate is satsified-> return values for the rows from both the tables.
- Join_predicate is not satsified-> returns values of rows only from right table, for the left table returns null.

## Full Outer Join or Full Join
Combination of inner, left and right outer join

- Join predicate is satisfied=> perform inner join and returns the rows.
- Join predicate is not satisfied=> take the remaining records and 
  - perform left outer join
  - perform right outer join

## Cross Join
- Does not depend upon any join_predicate condition.
- No comparison just combines and returns rows.
- Total no. of rows returned = cartesian product
- If table1 contains m rows and table2 contains n rows.
- It simply takes cartesian product of rows(combines rows of both the tables) and returns m x n rows.
- Mainly used for testing purposes when a large amount data is required.
  
## Self Join
- Join is performed on the columns of same table
- Performed mainly to obtain hierarchical data.
- perfomed with the help of inner join or left join.

Explanation:
Take account of employee manager situation

![](G:\coding\Oracle\globalex\Theory\self_join.png)
 


