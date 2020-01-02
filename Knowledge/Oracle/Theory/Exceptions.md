## Syntax and implementation
-  When exception occurs in the executable section, the execution of the current block stops and control transfers to the exception-handling section.
```sql
BEGIN
    -- executable section
    ...
    -- exception-handling section(exception occurs)
    EXCEPTION 
        WHEN exception_1 THEN 
            -- exception_handler1
        WHEN exception_2 THEN 
            -- exception_handler1
        WHEN OTHERS THEN
            -- other_exception_handler
END;
```

## Categories of Exceptions
1. Internally defined
   - Errors which arise from the Oracle Database environment
   - They do not have names but codes.
   - Ex: ORA-27102 (out of memory)
2. Predefined 
   - Internally define exception which has a name defined by oracle. 
   - Errors which occur during the execution of the program
   - Ex: NO_DATA_FOUND, TOO_MANY_ROWS
3. User-defined
   - Raised explicitly.
   - Custom exception defined by users

|Category|	Definer|	Has Error Code|	Has Name|	Raised Implicitly|	Raised Explicitly| Examples|
|-|-|-|-|-|-|-|
|Internally defined|	Runtime system|	Always|	Only if you assign one|	Yes|	Optionally|-|
|Predefined	|Runtime system|	Always|	Always|	Yes|	Optionally|-|
|User-defined|	User|	Only if you assign one|	Always|	No|	Always|-|


## Exception Propogation

### Steps
1. PL/SQL looks for an exception handler in the current block(anonymous block, procedure, function)
2. If no handler found, propogates the exception to enclosing block of current block.
3. If no handler is found there also, it propagates it to its enclosing block.
4. Process continues till no enclosing block is left.
5. Then, the application that executed the outermost PL/SQL block handles it.
6. If that is also not able to handles it, the execution stops.

![exception_propogation](https://user-images.githubusercontent.com/58257140/71684914-db9fb580-2dbc-11ea-9689-9eadb8adc685.png)


## Raise Exception
- Used to explicitly raise(throw an exception)
  - Raise a user-defined exception.
  - Raise an internally defined exception.
  - Reraising the current exception.

### Raising User defined Exceptions
1. Daclare the exception

```sql
DECLARE
    exception_name EXCEPTION;
    PRAGMA EXCEPTION_INIT (exception_name, error_number) --we need to define the error number associated with it.
```
1. Raise the exception

```sql
RAISE exception_name
```
Example
```sql
DECLARE
    e_credit_too_high EXCEPTION;
    PRAGMA exception_init( e_credit_too_high, -20001 );
    BEGIN
        RAISE e_credit_too_high;
    
END;
/
```

## RAISE_APPLICATION_ERROR PROCEDURE

Oracle has a predefined procedure that can be used to raise user-defined error directly instead of declaring exceptions explicitly and raising them.
> raise_application_error(
    error_number, 
    message 
    [, {TRUE | FALSE}]
);

- It takes 3 parameters.
  1. error_number: error code which we want to show, negative integer, ranges from -20999 to -20000
  2. message: represents error message which we want to show. Its length is up to 2048 bytes
  3. TRUE or FALSE
     1. TRUE:error is added to the stack of previous errors.
     2. FALSE: error replaces all previous errors.

- Effects when it is raised
  1. Reverses all changes made to the OUT or IN OUT parameters.
  2. Changes made to the global data structure such as packaged variables, and database objects like tables will not be rolled back.
  3. Therefore, you must explicitly execute the ROLLBACK statement

Example:
```sql

--sql code of declaration
BEGIN
-- Other sql code

-- raise an exception if the credit limit is exceeded
    IF l_customer_credit > l_credit_limit THEN
        raise_application_error(-20111,'Credit Limit Exceeded');
    END IF;
END;
/
```