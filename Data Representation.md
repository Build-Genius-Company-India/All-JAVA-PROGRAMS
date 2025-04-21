# DATA REPRESENTATIONS
number system - number systems ae the ways of repreensenting numbers with a finite set of distinct symbols . 
Number systems are of two types 

- non positional number systems 
eg. vi , vii , xi, ix,viii etc.
- positional mubers systems 
eg 256, 12 , 152 , 2442, etc
 
postional number systems are of four kinds 
- binary == 0,1
- octal ==0 to 7 
- decimal 0 to 9
- hexadecimal == 0 to 9 and A to E

## Binary number system -
uses 0 and 1 only has base 2.

## OCTAL number system 
uses 0 to 7 and has base of 8 .

## Decimal number system 
uses 0 to 9 and has base as 10 

## hexadecimal number system - 
uses 0 to 9 and A to E
( A = 10 , B =11 , C = 12 , D =13 , E =14 ) 

### binary representation of octal numbers 

![Octal-to-Binary](https://github.com/user-attachments/assets/69c6487b-bf20-4075-be18-cdd2c266da78)

### binary representations of hexadecimal numbers

![v4-460px-Convert-Binary-to-Hexadecimal-Step-12-Version-2](https://github.com/user-attachments/assets/828ee414-3684-42d7-8115-fb19474360cf)

binary - octal   
make groups of 3 bits from back and write its corresponding octal digits .

binary - hexadecimal   
make groups of 4 bits from back and write its corresponding hexadecimal digits.

octal to binary   
write the binary equivalent of each digit in 3 bits and then combine them together to get the answer .

hexadecimal - binary   
write the binary equivalent of each digit in 4 bits and then combine them to get the answer .
NOTE - octal to hexadecimal and vice versa is not directly possible , so we have to convert to binary first and then to the target number system .

decimal - binary   
divide each digit by 2 and keep on saving the remainders and finally with the last left digit in the first combine them in bottom to up up series , after using prime factorisation method of division

decimal to octal   
divide each digit by 8 and keep saving the remainders and finally with the last factor left in the first , combine them in bottom to up series .

decimal - hexadecimal  
divide each digit by 16 and keep saving the remainders and finally with the last factor left in the first , combine them in bottom to up series .

decimal fraction - binary   
same for numerical part + multiply the real part with base and keep saving the numerical part and them combine them in top to bottom series . [3-4 reps]

decimal fraction - octal   
same for numerical part + multiply the real part with base keep saving the numerical part and then combine them in top to bottom series . [3-4 reps ]

decimal fraction - hexadecimal   
same for numerical part + multiply the real part with base keep saving the numerical part and then combine them in top to bottom series . [3-4 reps ]

note- many decimal fraction cannot be exactly represented on binary , so on such cases , we carry on with the process for 4-5 times maximum iterations and then we stop . if in case , if there is a possibility of fuctional part becoming zero , then it should be solved completely .
## octal addition   
when additional value comes more than 7 , then you have to add two .
### seven's complement - 
subtract each and every digit of octal number.
### 8's complement 
sevens complement + 1 is equivalent to 8's complement .

## octal addition
steps 
1- add corresponding digit of both numbers from lsb and msb .
2- if sum is <=7 , write the same value as resultant sum value. if sum is >7 , convert the result into octal .[hold the second digit as sum and send first digit as carry ]
3- continue the process till all numbers are added .
### borrow method
borrow of 1 means borrow of 8.
### sign bit magnitude 
- if case of the sign bit representation , the -ve numbers are represented by 1 as the sign bit whereas the positive numbers are represented by 0 as the sign bit .
- sign bit is always the msb which is generally seperated by comma.
## two types of complement
### 1- 1's complement
ones complement of a binary number can be taken by converting 0s and 1s to 1s and 0s respectively or by substracting each and every digit by 1 .
### 2. 2's complement   
its equal to  ones complement +1 .

## overflow condition :
incase , when both the value are negative , increase the number of bits to avoid overflow condition . find out the 1s complement of both the values . add the extra bit generated to the resultant . convert the resultant into 1s complement . 
# Data Representation
## 1- ascii code - 
american standard code for information interchange .it is a 7 bit or 8 bit  code which is capable of representing 128 or 256 differernt characteres . it is used in most micro and mini computers .
## 2- ebcdic - 
extended binary coded decimal interchange code . it is 8 bit code capable of representing 256 characters . it is used in ivm , mainframe computers .
## 3- iscii code - 
indian standard code for information interchange . it is a 8 bit code capable of representing 256 characters . it is generally used to represent code for indian scripts . for eg - gurumukhi , devangri , gujrati ,bengali , etc .



-it is better to burn everyday than to ignite at once .-- vishnu pratham
