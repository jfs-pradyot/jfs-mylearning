select max(list_price)from products;

-- inline view(subquery present in from clause)
-- allows unlimited subqueries within subqueries at this place
select * from 
(select * from products where products.product_id  > 20);

--subquery in where clause(nested subquery)
--allows 255 chain of subqueries at this place
select * from products where list_price = 
(select max(list_price) from products );

select sysdate from dual;
