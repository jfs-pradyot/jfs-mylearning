# Oracle Data Types

## Built in Data Types
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
