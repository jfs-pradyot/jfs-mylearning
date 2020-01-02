# Oracle Data Types

## Important Data Types
|Code|Data Type|Example|Explanation|
|-|-|-|-|
|2|	NUMBER[(precision [, scale]])|NUMBER(6,2)| Total digits=6, digits after decimal to the right=2, Ex: 1234.56|
|96	|CHAR [(size [BYTE / CHAR])]|
|1|	VARCHAR2(size [BYTE / CHAR])|-|-|
|12	|DATE|-|-|
|180	|TIMESTAMP [(fractional_seconds)]|-|-|

## NUMBER
>NUMBER[(precision [, scale])]

NUMBER(p,s): NUMBER(6,2) = 1234.45

- P(Precision): Total digits in a number.
- S(Scale): Digits after Decimal
- If input exceeds precision: error will come.
- If input in scale exceed, then no error(oracle will round up and will make scale to s).


### We can use predefined aliases


|ANSI data type|	Oracle NUMBER data type|
|-|-|
|INT|	NUMBER(38)|
|SMALLINT	|NUMBER(38)|
|NUMBER(p,s)	|NUMBER(p,s)|
|DECIMAL(p,s)|	NUMBER(p,s)|

Ex: age NUMBER(38) or age INT.
Both are same.

## FLOAT
- Subset of NUMBER data type
- contains precion and scale.
- We can define only precision.[Max value: 128]
- Oracle calculates scale
- If no precision is defined. Default value 128
- Ex: age FLOAT is same as age FLOAT(128)

## CHAR

>CHAR(length BYTE) or CHAR(length CHAR)

- fixed-length character strings.
- i.e. If we define length as 10 and use only 6.The total length will be still 10
  
- If you don’t explicitly specify BYTE or CHAR followed the length, Oracle uses the BYTE by default. Ex: column_name CHAR(20)<br> Here, 20 is in bytes.

- Default length: 1. Ex: column_name CHAR

## VARCHAR2
>CHAR(length BYTE) or CHAR(length CHAR)
 
 - Similar to char.
 - Default length type is byte
 - Has a better space usage.
 - If we define length as 10 and use only 6. The total length will be 6

## DATE

### Standard Date Format controlled by **NLS_DATE_FORMAT**
  > DD-MM-YY 

### Changing the formats of date.
  1. Selecting predefined formats.[change NLS_DATE_FORMAT]
     - If we want to change the date format to YYYY-MM-DD
     - Use, ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD';
   2. User defined date fomrat [TO_CHAR]
   - Ex: select to_char('DATE','USER_DEFINED_DATE_FORMAT') from dual
      - select to_char('sysdate','FMMonth DD, YYYY');
      - Output: Month Day, Year: January 02, 2020.
      - We can change the language of month by altering:
      - alter session set NLS_DATE_LANGUAGE = 'FRENCH';

### Storing or Obtaining DATE in ORACLE
1. TO_DATE

> TO_DATE('string','string format')

    - Takes a string as input and extracts year, month and day from it.
     - Ex: TO_DATE('S','SF')
      
       - S: String
       - SF: String Format
      
       - Explanation
    
         - TO_DATE('January 2,2020','MONTH DD,YYYY')
         - Oracle will know by the format defined that first there is month, then date, then year.
         - Thus, It knows: MONTH=Januray, DAY=2, YEAR=2020
         - Next Step: For storing: it will use its own date format which is set by default or provided by us.

    - Ex: select TO_DATE('January 02,2020','Month DD,YYYY') from daul;
      - Output: 01-JAN-20 (Default DATE format) 

2. LITERAL
    >   DATE 'yyyy-mm-dd' <br>Note: Use only this string literal format. 

    - Specifying date value as a string literal.
    - It will take the string literal and extracts year, month, date and stores in defined format.
    - to use a DATE as a literal, you must use the Gregorian calendar [yyyy-mm-dd]
### Obtaining string or char from date
   

## TIMESTAMP

- Store date and time data including year, month, day, hour, minute and second, also fractional parts of seconds.
  
- TIMESTAMP 'YYYY-MM-DD HH24:MI:SS.FF'
- TIMESTAMP '1999-12-31 23:59:59.10'

```sql
  ### Syntax
    1. TIMESTAMP(fractional_seconds_precision)
       -   fractional_seconds_precision: digits after the seconds.
     Syntax: TIMESTAMP(2) 
            1999-12-31 23:59:59.10
            TIMESTAMP(9) : max precision 9
            2020-05-28 05:34:58.323000000 AM
    2. TIMESTAMP LITERAL
        Syntax: TIMESTAMP '1999-12-31 23:59:59.10' 
```

### Formating of TIMESTAMP DATATYPE
- Formating is similar to date datatype.

1. Default TIMESTAMP Format: NLS_TIMESTAMP_FORMAT 
    >  DD-MON-RR HH.MI.SSXFF AM <br>
        03-AUG-17 11:20:30.45 AM

  
2. TO_CHAR
   
    ```TO_CHAR(logged_at, 'MONTH DD, YYYY "at" HH24:MI')```
   - Again, we can change the language of strings(MONTH , DAY) in the format by using. **NLS_DATE_LANGUAGE**
3. TO_TIMESTAMP
   
   - Take string as input and define it format.
   - Store the string literal as timestanp datatype.

### Extract TIMESTAMP components
> EXTRACT( component FROM timestamp);

    EXTRACT(year FROM logged_at) year_column
    - It extracts year to year_column.
    EXTRACT(month FROM logged_at) month_column
    It extracts month to month_column

## References Built in Data Types
|Code|Data Type|
|-|-|
|1|	VARCHAR2(size [BYTE | CHAR])|
|1|	NVARCHAR2(size)|
|2|	NUMBER[(precision [, scale]])|
|8	|LONG|
|12	|DATE|
|21	|BINARY_FLOAT|
|22	|BINARY_DOUBLE|
|23	|RAW(size)|
|24	|LONG RAW|
|69	|ROWID|
|96	|CHAR [(size [BYTE | CHAR])]|
|96	|NCHAR[(size)]|
|112	|CLOB|
|112	|NCLOB|
|113	|BLOB|
|114	|BFILE|
|180	|TIMESTAMP [(fractional_seconds)]|
|181	|TIMESTAMP [(fractional_seconds)] WITH              TIME ZONE|
|182	|INTERVAL YEAR [(year_precision)] TO MONTH|
|183	|INTERVAL DAY [(day_precision)] TO SECOND[(fractional_seconds)]|
|208	|UROWID [(size)]|
|231	|TIMESTAMP [(fractional_seconds)] WITH LOCAL TIMEZONE|
