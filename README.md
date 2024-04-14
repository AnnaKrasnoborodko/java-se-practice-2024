# java-se-practice-2024
Source - https://globallogic.udemy.com/course/java-the-complete-java-developer-course 

Positive, Negative or Zero
Write a method called checkNumber with an int parameter number.
The method should not return any value, and it needs to print out:
•	"positive" if the parameter number is > 0
•	"negative" if the parameter number is < 0
•	"zero" if the parameter number is equal to 0
NOTE: The checkNumber method needs to be defined as public static like we have been doing so far in the course.

Speed Converter
1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
Examples of input/output:
•	toMilesPerHour(1.5); → should return value 1
•	toMilesPerHour(10.25); → should return value 6
•	toMilesPerHour(-5.6); → should return value -1
•	toMilesPerHour(25.42); → should return value 16
•	toMilesPerHour(75.114); → should return value 47
Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
Then it needs to print a message in the format "XX km/h = YY mi/h".
XX represents the original value kilometersPerHour.
YY represents the rounded milesPerHour from the kilometersPerHour parameter.
If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
Examples of input/output:
•	printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
•	printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
•	printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
•	printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
•	printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.
How to use the method round and how it works?
The Math.round() is a built-in math method which returns the closest long to the argument. The result is rounded to an integer by adding 1/2, taking the floor of the result after adding 1/2, and typecasting the result to type long. The method returns the value of the argument rounded to the nearest int value.

MegaBytes Converter
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.
For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
EXAMPLE INPUT/OUTPUT
•	printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
•	printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
•	printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"

Barking Dog
We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.
Examples of input/output:
•	shouldWakeUp (true, 1); → should return true
•	shouldWakeUp (false, 2); → should return false since the dog is not barking.
•	shouldWakeUp (true, 8); → should return false, since it's not before 8.
•	shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.

Leap Year Calculator
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
To determine whether a year is a leap year, follow these steps: 
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.
Examples of input/output:
•	isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
•	isLeapYear(1600); → should return true since 1600 is a leap year
•	isLeapYear(2017); → should return false since 2017 is not a leap year
•	isLeapYear(2000);  → should return true because 2000 is a leap year 

DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
EXAMPLES OF INPUT/OUTPUT:
•	areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
•	areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
•	areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
•	areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

Equal Sum Checker
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
EXAMPLES OF INPUT/OUTPUT:
•	hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
•	hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
•	hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0

Teen Number Checker
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
EXAMPLES OF INPUT/OUTPUT:
•	hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
•	hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
•	hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
EXAMPLES OF INPUT/OUTPUT:
•	isTeen(9);  should return false since 9 is in not range 13 - 19
•	isTeen(13);  should return true since 13 is in range 13 - 19

Area Calculator
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value please check the tips below.
Examples of input/output:
•	area(5.0); should return 78.53975
•	area(-1);  should return -1 since the parameter is negative
•	area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
•	area(-1.0, 4.0);  should return -1 since first the parameter is negative
TIP: The formula for calculating the area of a rectangle is x * y.
TIP: The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI

Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.      
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".  
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
EXAMPLES OF INPUT/OUTPUT:
•	printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
•	printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
•	printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"

Equality Printer
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"     
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".
EXAMPLES OF INPUT/OUTPUT:
•	printEqual(1, 1, 1); should print text All numbers are equal
•	printEqual(1, 1, 2); should print text Neither all are equal or different
•	printEqual(-1, -1, -1); should print text Invalid Value
•	printEqual(1, 2, 3); should print text All numbers are different

Playing Cat
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.
EXAMPLES OF INPUT/OUTPUT:
•	isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 
•	isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
•	isCatPlaying(false, 35); should return true since temperature is in range 25 - 35 

Number In Word
Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.   

Number Of Days In Month
Write a method isLeapYear with a parameter of type int named year. 
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Examples of input/output:
•	isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
•	isLeapYear(1600); → should return true since 1600 is a leap year
•	isLeapYear(2017); → should return false since 2017 is not a leap year
•	isLeapYear(2000); → should return true because 2000 is a leap year 
NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.
Write another method getDaysInMonth with two parameters month and year.  Both of type int.

If parameter month is < 1 or > 12 return -1. 
If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.
Examples of input/output:
•	getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
•	getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
•	getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
•	getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
•	getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

Sum Odd
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

Check that number is > 0, if it is not return false.
If number is odd return true, otherwise return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

The method should use a for loop to sum all odd numbers in that range including the end and return the sum.

It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

If those conditions are not satisfied return -1 from the method to indicate invalid input.
Example input/output:
•	sumOdd(1, 100); → should return 2500
•	sumOdd(-1, 100); → should return -1
•	sumOdd(100, 100); → should return 0
•	sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
•	sumOdd(100, -100); → should return -1
•	sumOdd(100, 1000); → should return 247500

Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false. 

Check the tips below for more info about palindromes.
Example Input/Output
•	isPalindrome(-1221); → should return true
•	isPalindrome(707); → should return true
•	isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number. 

The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.
Example input/output
•	sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
•	sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
•	sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
•	sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
•	sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.

Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number. 

The method should return the sum of the even digits within the number. 

If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
•	getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
•	getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
•	getEvenDigitSum(-22); → should return -1 since the number is negative

Shared Digit
Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
•	hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
•	hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
•	hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

Last Digit Checker
Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
EXAMPLE INPUT/OUTPUT:
•	hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
•	hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
•	hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
EXAMPLE INPUT/OUTPUT
•	isValid(10); → should return true since 10 is within the range of 10-1000
•	isValid(468); → should return true since 468 is within the range of 10-1000
•	isValid(1051); → should return false since 1051 is not within the range of 10-1000

All Factors
Write a method named printFactors with one parameter of type int named number. 
If number is < 1, the method should print "Invalid Value".
The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
EXAMPLE INPUT/OUTPUT:
•	printFactors(6); → should print 1 2 3 6
•	printFactors(32); → should print 1 2 4 8 16 32
•	printFactors(10); → should print 1 2 5 10
•	printFactors(-1); → should print "Invalid Value" since number is < 1
HINT: Use a while or for loop.
NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.
For example, the printout for printFactors(10); can be:
•	1
•	2
•	5
•	10

Greatest Common Divisor
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
EXAMPLE INPUT/OUTPUT:
•	getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
•	getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
•	getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
•	getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
Perfect Number
What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take the number 6: 
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. 
Therefore, 6 is a perfect number (as well as the first perfect number).
Write a method named isPerfectNumber with one parameter of type int named number. 
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.
EXAMPLE INPUT/OUTPUT:
•	isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
•	isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
•	isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
•	isPerfectNumber(-1); should return false since the number is < 1

Number To Words
Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

To print the number as words, follow these steps:
1.	Extract the last digit of the given number using the remainder operator. 
2.	Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3.	Remove the last digit from the number.
4.	Repeat Steps 2 through 4 until the number is 0.
The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
Use the method reverse within the method numberToWords in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount. 

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
Example Input/Output - getDigitCount method
•	getDigitCount(0); should return 1 since there is only 1 digit
•	getDigitCount(123); should return 3
•	getDigitCount(-12); should return -1 since the parameter is negative
•	getDigitCount(5200); should return 4 since there are 4 digits in the number
Example Input/Output - reverse method
•	reverse(-121); should  return -121
•	reverse(1212); should return  2121
•	reverse(1234); should return 4321
•	reverse(100); should return 1
Example Input/Output - numberToWords method
•	numberToWords(123); should print "One Two Three".
•	numberToWords(1010); should print "One Zero One Zero".
•	numberToWords(1000); should print "One Zero Zero Zero".
•	numberToWords(-12); should print "Invalid Value" since the parameter is negative.
HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number. 

Flour Pack Problem
Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. 
The parameter bigCount represents the count of big flour bags (5 kilos each).
The parameter smallCount represents the count of small flour bags (1 kilo each).
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
If any of the parameters are negative, return false.
EXAMPLE INPUT/OUTPUT:
•	canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
•	canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
•	canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
•	canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
•	canPack (-3, 2, 12); should return false since bigCount is negative.

Largest Prime
Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
EXAMPLE INPUT/OUTPUT:
•	getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
•	getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
•	getLargestPrime (0); should return -1 since 0 does not have any prime numbers
•	getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
•	getLargestPrime (-1); should return -1 since the parameter is negative

Input Calculator
Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
EXAMPLES OF INPUT/OUTPUT:
EXAMPLE 1:
INPUT:
•	1
•	2
•	3
•	4
•	5
•	a
OUTPUT
SUM = 15 AVG = 3
EXAMPLE 2:
INPUT:
hello
OUTPUT:
SUM = 0 AVG = 0

Paint Job
Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
1. Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.
The second parameter should be named height of type double. This parameter represents the height of the wall.
The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.
The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.
Examples of input/output: 
•	getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
•	getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
•	getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).
This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.
Examples of input/output: 
•	getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
•	getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
•	getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.
Examples of input/output: 
•	getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
•	getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
•	getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
Do your best to help Bob  .

Sum Calculator
Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
•	Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
•	Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
•	Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
•	Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
•	Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
•	Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
•	Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
•	Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
TEST EXAMPLE
TEST CODE:
•	SimpleCalculator calculator = new SimpleCalculator();
•	calculator.setFirstNumber(5.0);
•	calculator.setSecondNumber(4);
•	System.out.println("add= " + calculator.getAdditionResult());
•	System.out.println("subtract= " + calculator.getSubtractionResult());
•	calculator.setFirstNumber(5.25);
•	calculator.setSecondNumber(0);
•	System.out.println("multiply= " + calculator.getMultiplicationResult());
•	System.out.println("divide= " + calculator.getDivisionResult());
OUTPUT
•	add= 9.0
•	subtract= 1.0
•	multiply= 0.0
•	divide= 0.0
TIPS:
•	add= 9.0 is printed because 5.0 + 4 is 9.0
•	subtract= 1.0 is printed because 5.0 - 4 is 1.0
•	multiply= 0.0 is printed because 5.25 * 0 is 0.0
•	divide= 0.0 is printed because secondNumber is set to 0

Person
Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
•	Method named getFirstName without any parameters, it needs to return the value of the firstName field.
•	Method named getLastName without any parameters, it needs to return the value of the lastName field.
•	Method named getAge without any parameters, it needs to return the value of the age field.
•	Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
•	Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
•	Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
•	Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
•	Method named getFullName without any parameters, it needs to return the full name of the person.
•	In case both firstName and lastName fields are empty, Strings return an empty String.
•	In case lastName is an empty String, return firstName.
•	In case firstName is an empty String, return lastName.
To check if s String is empty, use the method isEmpty from the String class. For example,firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.
TEST EXAMPLE
TEST CODE:
•	Person person = new Person();
•	person.setFirstName("");   // firstName is set to empty string
•	person.setLastName("");    // lastName is set to empty string
•	person.setAge(10);
•	System.out.println("fullName= " + person.getFullName());
•	System.out.println("teen= " + person.isTeen());
•	person.setFirstName("John");    // firstName is set to John
•	person.setAge(18);
•	System.out.println("fullName= " + person.getFullName());
•	System.out.println("teen= " + person.isTeen());
•	person.setLastName("Smith");    // lastName is set to Smith
•	System.out.println("fullName= " + person.getFullName());
OUTPUT
•	fullName=
•	teen= false
•	fullName= John
•	teen= true
•	fullName= John Smith

Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
•	Method named getWidth without any parameters, it needs to return the value of width field.
•	Method named getHeight without any parameters, it needs to return the value of height field.
•	Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
•	Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
•	Method named getArea without any parameters, it needs to return the area of the wall.
TEST EXAMPLE
→ TEST CODE:
•	1 Wall wall = new Wall(5,4);
•	2 System.out.println("area= " + wall.getArea());
•	3
•	4 wall.setHeight(-1.5);
•	5 System.out.println("width= " + wall.getWidth());
•	6 System.out.println("height= " + wall.getHeight());
•	7 System.out.println("area= " + wall.getArea());
→ OUTPUT:
•	area= 20.0
•	width= 5.0
•	height= 0.0
•	area= 0.0

Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.
Write the following methods (instance methods):
•	Method named getX without any parameters, it needs to return the value of x field.
•	Method named getY without any parameters, it needs to return the value of y field.
•	Method named setX with one parameter of type int, it needs to set the value of the x field.
•	Method named setY with one parameter of type int, it needs to set the value of the y field.
•	Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
•	Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
•	Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.
TEST EXAMPLE
→ TEST CODE:
•	Point first = new Point(6, 5);
•	Point second = new Point(3, 1);
•	System.out.println("distance(0,0)= " + first.distance());
•	System.out.println("distance(second)= " + first.distance(second));
•	System.out.println("distance(2,2)= " + first.distance(2, 2));
•	Point point = new Point();
•	System.out.println("distance()= " + point.distance());
OUTPUT
•	distance(0,0)= 7.810249675906654
•	distance(second)= 5.0
•	distance(2,2)= 5.0
•	distance()= 0.0

Carpet Cost Calculator
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.
1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
•	Method named getArea without any parameters, it needs to return the calculated area (width * length).
2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
In case the cost parameter is less than 0 it needs to set the cost field value to 0.
Write the following methods (instance methods):
•	Method named getCost without any parameters, it needs to return the value of cost field
3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
Write the following methods (instance methods):
•	Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
TEST EXAMPLE
→ TEST CODE:
•	Carpet carpet = new Carpet(3.5);
•	Floor floor = new Floor(2.75, 4.0);
•	Calculator calculator = new Calculator(floor, carpet);
•	System.out.println("total= " + calculator.getTotalCost());
•	carpet = new Carpet(1.5);
•	floor = new Floor(5.4, 4.5);
•	calculator = new Calculator(floor, carpet);
•	System.out.println("total= " + calculator.getTotalCost());
→ OUTPUT
•	total= 38.5
•	total= 36.45
Complex Operations
A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number. For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double. It represents the Complex Number.
The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
Write the following methods (instance methods):
•	Method named getReal without any parameters, it needs to return the value of real field.
•	Method named getImaginary without any parameters, it needs to return the value of imaginary field.
•	Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
•	Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
•	Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
•	Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.
TEST EXAMPLE
→ TEST CODE:
•	ComplexNumber one = new ComplexNumber(1.0, 1.0);
•	ComplexNumber number = new ComplexNumber(2.5, -1.5);
•	one.add(1,1);
•	System.out.println("one.real= " + one.getReal());
•	System.out.println("one.imaginary= " + one.getImaginary());
•	one.subtract(number);
•	System.out.println("one.real= " + one.getReal());
•	System.out.println("one.imaginary= " + one.getImaginary());
•	number.subtract(one);
•	System.out.println("number.real= " + number.getReal());
•	System.out.println("number.imaginary= " + number.getImaginary());
→ OUTPUT
•	one.real= 2.0
•	one.imaginary= 2.0
•	one.real= -0.5
•	one.imaginary= 3.5
•	number.real= 3.0
•	number.imaginary= -5.0

Cylinder
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.
Write the following methods (instance methods):
•	Method named getRadius without any parameters, it needs to return the value of radius field.
•	Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.
2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
•	Method named getHeight without any parameters, it needs to return the value of height field.
•	Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
TEST EXAMPLE
→ TEST CODE:
•	Circle circle = new Circle(3.75);
•	System.out.println("circle.radius= " + circle.getRadius());
•	System.out.println("circle.area= " + circle.getArea());
•	Cylinder cylinder = new Cylinder(5.55, 7.25);
•	System.out.println("cylinder.radius= " + cylinder.getRadius());
•	System.out.println("cylinder.height= " + cylinder.getHeight());
•	System.out.println("cylinder.area= " + cylinder.getArea());
•	System.out.println("cylinder.volume= " + cylinder.getVolume());
→ OUTPUT
•	circle.radius= 3.75
•	circle.area= 44.178646691106465
•	cylinder.radius= 5.55
•	cylinder.height= 7.25
•	cylinder.area= 96.76890771219959
•	cylinder.volume= 701.574580913447

Pool Area
The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.
1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0.
In case the length parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
•	Method named getWidth without any parameters, it needs to return the value of width field.
•	Method named getLength without any parameters, it needs to return the value of length field.
•	Method named getArea without any parameters, it needs to return the calculated area (width * length).
2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
•	Method named getHeight without any parameters, it needs to return the value of height field.
•	Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
TEST EXAMPLE
→ TEST CODE:
•	Rectangle rectangle = new Rectangle(5, 10);
•	System.out.println("rectangle.width= " + rectangle.getWidth());
•	System.out.println("rectangle.length= " + rectangle.getLength());
•	System.out.println("rectangle.area= " + rectangle.getArea());
•	Cuboid cuboid = new Cuboid(5,10,5);
•	System.out.println("cuboid.width= " + cuboid.getWidth());
•	System.out.println("cuboid.length= " + cuboid.getLength());
•	System.out.println("cuboid.area= " + cuboid.getArea());
•	System.out.println("cuboid.height= " + cuboid.getHeight());
•	System.out.println("cuboid.volume= " + cuboid.getVolume());
→ OUTPUT
•	rectangle.width= 5.0
•	rectangle.length= 10.0
•	rectangle.area= 50.0
•	cuboid.width= 5.0
•	cuboid.length= 10.0
•	cuboid.area= 50.0
•	cuboid.height= 5.0
•	cuboid.volume= 250.0

Composition
Directions:
This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods.
The five classes should be created as follows:
1) Create a class and name it Lamp. Inside this class should be declared three member variables: style of type String, battery of type boolean, and globRating of     type int. All variables should be marked private. A constructor needs to be created which accepts the three member variables as parameters. In addition, four methods should also be created: turnOn() has no return type and should print a message that the lamp is being turned on; getStyle() returns the lamp style; isBattery returns the value of battery; and getGlobRating() returns the globRating of the lamp.
2) Create a class and name it Bed. Five private member variables should be declared: style of type String, and pillows, height, sheets, quilt of type int. A constructor should be coded which accepts these five member variables as parameters. Also, six methods should be defined: make() has no return type and prints a message to the effect that the bed is being made; getStyle() which returns the value of style; getPillows() returns the number of pillows; getHeight() returns the height of the bed; getSheets() returns the number of sheets on the bed; and getQuilt() returns the value of quilt.
3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor, both of type int. There should also be a constructor which accepts both member variables as parameters. There are also two additional methods which should be defined: getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.
4) Create a class with the name Wall. It contains one member variable, direction, and is of type String. A constructor for Wall should accept one parameter for the member variable direction. A getter should also be defined for the direction field called getDirection().
5) Create a class with the name Bedroom. This class contains eight member variables:
name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp. The class constructor should accept all eight of the member variables as parameters, and there should also be two additional methods:
getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.
Input/Output:
Once you have completed coding your classes you should then use the following code in your main class to test your code and for correct output. This way you can be sure that your code works before pasting your five classes into the code evaluator.
•	Wall wall1 = new Wall("West");
•	Wall wall2 = new Wall("East");
•	Wall wall3 = new Wall("South");
•	Wall wall4 = new Wall("North");
•	 
•	Ceiling ceiling = new Ceiling(12, 55);
•	 
•	Bed bed = new Bed("Modern", 4, 3, 2, 1);
•	 
•	Lamp lamp = new Lamp("Classic", false, 75);
•	 
•	Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
•	bedRoom.makeBed();
•	 
•	bedRoom.getLamp().turnOn();
Tips:
Remember that after testing you will not put your main method into the code evaluator. You will only paste in your five classes you have created in the exercise.
To be sure that the correct output is generated so your code passes the evaluation, use the following statements in your code:
1) System.out.print("Bedroom -> Making bed | "); should be used in the makeBed() method of the Bedroom class;
2) System.out.print("Bed -> Making | "); should be used in the make() method of the Bed class; and
3) System.out.println("Lamp -> Turning on"); should be used in the turnOn() method of the Lamp class.

Encapsulation
Directions:
In this exercise you will create one class and name it Printer. This class will have two member variables of type int, tonerLevel and pagesPrinted, and one of type boolean called duplex. All three fields will have private access. The constructor will accept two of these variables, tonerLevel and duplex, as parameters following these rules:
•	tonerLevel must be greater than -1 but less than or equal to 100. If it does not meet these conditions then it should be initialized to -1.
•	duplex should be initialized to the value of the parameter.
In addition, pagesPrinted should be initialized to 0.
Three other methods need to be defined in this way:
1.	addToner will accept one parameter, tonerAmount of type int. First off, tonerAmount should be greater than 0 and less than or equal to 100. If this condition is met a second test must be included to test whether tonerLevel plus tonerAmount is greater than 100. If so, the method should return -1. If not then tonerLevel should have the incoming tonerAmount added to it and the new tonerLevel should then be returned by the method. Also, if the initial condition test fails, then the method should return -1.
2.	printPages will accept one parameter, pages of type int. A variable called pagesToPrint should be created and initialized to the value of the incoming parameter.   A conditional check should be performed on whether the Printer class field, duplex, is either "true" or "false". If "true" then a calculation must be performed to determine the number of pages needed to print the job double sided. The pagesToPrint value is then added to the class field pagesPrinted, but the value of pagesToPrint should be returned by the method.
3.	getPagesPrinted has no parameters and merely returns the value of the member variable pagesPrinted.
Example input:
•	Printer printer = new Printer(50, true);
•	System.out.println(printer.addToner(50));
•	System.out.println("initial page count = " +printer.getPagesPrinted());
•	int pagesPrinted = printer.printPages(4);
•	System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
•	pagesPrinted = printer.printPages(2);
•	System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
Example output:
•	100
•	initial page count = 0
•	Printing in duplex mode
•	Pages printed was 2 new total print count for printer = 2
•	Printing in duplex mode
•	Pages printed was 1 new total print count for printer = 3
Tips:
1.	Remember to only paste the code from Printer class into the exercise evaluator. The Main class does not need to be pasted in.
2.	You can include a message in the printPages method which informs the user that the printer is printing in duplex mode if duplex is equal to "true" if you want.
3.	When calculating pagesToPrint if duplex is equal to "true" remember that there are two operators which can help you with this. The division "/" operator divides a number and returns only the quotient without any remainder. And the modulo "%" operator divides the number and returns only the remainder, whether 0 or otherwise.

Polymorphism
Description:
For this exercise you will create four classes of vehicles. The first class should be named Car. This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
The first class contains four member variables, or fields, with these names and conditions:
•	engine of type boolean
•	cylinders of type int
•	name of type String
•	wheels of type int
All four member variables should have private access.
The constructor should accept two parameters, cylinders and name. Also, all of these cars have an engine and four wheels. So the other two fields should be set to default values.
In addition, there are five other methods These methods should be defined as described below:
1.	startEngine accepts no parameters and returns a message which says that the car's engine is starting.
2.	accelerate accepts no parameters and returns a message that says the car is accelerating.
3.	brake accepts no parameters and returns a message stating the car is braking.
The messages these methods return should somewhere contain the name of the class, Car.
Two getter methods should also be defined here for the member variables cylinders and name. All methods have public access.
The other three classes mentioned above are sub-classes of Car. These classes have no member variables and the constructor for each will call the parent constructor for object instantiation. Each of these classes will override the three parent methods startEngine, accelerate, and brake. The return messages for these methods should somewhere contain the name of the class to which the methods belong.
Example input:
•	Car car = new Car(8, "Base car");
•	System.out.println(car.startEngine());
•	System.out.println(car.accelerate());
•	System.out.println(car.brake());
•	 
•	Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
•	System.out.println(mitsubishi.startEngine());
•	System.out.println(mitsubishi.accelerate());
•	System.out.println(mitsubishi.brake());
•	 
•	Ford ford = new Ford(6, "Ford Falcon");
•	System.out.println(ford.startEngine());
•	System.out.println(ford.accelerate());
•	System.out.println(ford.brake());
•	 
•	Holden holden = new Holden(6, "Holden Commodore");
•	System.out.println(holden.startEngine());
•	System.out.println(holden.accelerate());
•	System.out.println(holden.brake());
Example output:
•	Car -> startEngine()
•	Car -> accelerate()
•	Car -> brake()
•	Mitsubishi -> startEngine()
•	Mitsubishi -> accelerate()
•	Mitsubishi -> brake()
•	Ford -> startEngine()
•	Ford -> accelerate()
•	Ford -> brake()
•	Holden -> startEngine()
•	Holden -> accelerate()
•	Holden -> brake()

Bill's Burgers
Description:
The purpose of this application is to help a company called Bill's Burgers manage the process of selling their hamburgers. And in order to match Bill's menu, you will need to create three(3) classes, Hamburger, DeluxeBurger, and HealthyBurger.
For the base Hamburger class, there will need to be four variables to represent the four basic ingredients of the hamburger, name, meat, price, and breadRollType. The price variable should be of type double, while the other three are of type String. A constructor will be needed to accept these four values as parameters when creating a new hamburger.
There will also need to be separate variables for four(4) possible additions to the hamburger. Those should be declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price. The name variables should be of type String and the price variables should be of type double.
Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to four additions to the hamburger and one(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price. Remember that a name and price must be accepted as parameters in the first four methods so that the price of the hamburger is adjusted accordingly. These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger. The first four methods do not return values, but the last method does return the total price of the hamburger of type double, which includes the base price of the hamburger plus any additional items.
For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters. Instead, the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10. The constructor can be configured in any way, as long as chips and drink are added for the total price just mentioned. In this class, the four(4) methods defined in the Hamburger class for including additional toppings must each be overridden so that a message is printed stating that no additional items can be added to a deluxe burger.
And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price. The names are type String and the prices are type double. The constructor for this class accepts two(2) parameters for meat and price. Those are set in the constructor along with an appropriate name for the type of burger.
Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price for the addition, allowing for up to two(2) addons to the basic healthy burger. And finally the itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to the type of burger along with any addons. The method also returns the total price of the healthy burger of type double.
Example input:
•	Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
•	hamburger.addHamburgerAddition1("Tomato", 0.27);
•	hamburger.addHamburgerAddition2("Lettuce", 0.75);
•	hamburger.addHamburgerAddition3("Cheese", 1.13);
•	System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
•	 
•	HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
•	healthyBurger.addHamburgerAddition1("Egg", 5.43);
•	healthyBurger.addHealthyAddition1("Lentils", 3.41);
•	System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
•	 
•	DeluxeBurger db = new DeluxeBurger();
•	db.addHamburgerAddition3("Should not do this", 50.53);
•	System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
Example output:
•	Basic hamburger on a White roll with Sausage, price is 3.56
•	Added Tomato for an extra 0.27
•	Added Lettuce for an extra 0.75
•	Added Cheese for an extra 1.13
•	Total Burger price is 5.71
•	Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
•	Added Egg for an extra 5.43
•	Added Lentils for an extra 3.41
•	Total Healthy Burger price is  14.51
•	Cannot not add additional items to a deluxe burger
•	Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54
•	Added Chips for an extra 2.75
•	Added Drink for an extra 1.81
•	Total Deluxe Burger price is 19.10

Sorted Array
Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
Implement the following methods:
getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
•	Element 0 contents 106
•	Element 1 contents 81
•	Element 2 contents 26
•	Element 3 contents 15
•	Element 4 contents 5
sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.

Minimum Element
Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.

Reverse Array
Write a method called reverse() with an int array as a parameter.
The method should not return any value. In other words, the method is allowed to modify the array parameter.
To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

Mobile Phone
Create a program that implements a simple mobile phone with the following capabilities.
1.  Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
    -  And seven methods, they are (their functions are in their names):
        -  addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
        -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
        -  findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
        -  findContact(), same as above, only it has one parameter of type String.
        -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
•	Contact List:
•	1. Bob -> 31415926
•	2. Alice -> 16180339
•	3. Tom -> 11235813
•	4. Jane -> 23571113
2. Implement the Contact class with the following attributes:
    -  Two fields, both String, one called name and the other phoneNumber.
    -  A constructor that takes two Strings, and initialises name and phoneNumber.
    -  And Three methods, they are:
        -  getName(), getter for name.
        -  getPhoneNumber(), getter for phoneNumber.
        -  createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.

Playlist
Create a program that implements a playlist of songs.
To start you off, implement the following classes:
1.  Album
    -  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.
    -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.
    -  And three methods, they are:
        -  addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean. Returns true if the song was added successfully or false otherwise.
        -  findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists, null if it doesn't exists.
        -  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.
        -  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
2.  Song
    -   It has two fields, a String called title and a double called duration.
    -  A constructor that accepts a String (title of the song) and a double (duration of the song). It initialises title and duration.
    -  And two methods, they are:
        -  getTitle(), getter for title.
        -  toString(), Songs overriding toString method. Returns a String in the following format: "title: duration"
->  SAMPLE INPUT
•	ArrayList<Album> albums = new ArrayList<>();
•	 
•	Album album = new Album("Stormbringer", "Deep Purple");
•	album.addSong("Stormbringer", 4.6);
•	album.addSong("Love don't mean a thing", 4.22);
•	album.addSong("Holy man", 4.3);
•	album.addSong("Hold on", 5.6);
•	album.addSong("Lady double dealer", 3.21);
•	album.addSong("You can't do it right", 6.23);
•	album.addSong("High ball shooter", 4.27);
•	album.addSong("The gypsy", 4.2);
•	album.addSong("Soldier of fortune", 3.13);
•	albums.add(album);
•	 
•	album = new Album("For those about to rock", "AC/DC");
•	album.addSong("For those about to rock", 5.44);
•	album.addSong("I put the finger on you", 3.25);
•	album.addSong("Lets go", 3.45);
•	album.addSong("Inject the venom", 3.33);
•	album.addSong("Snowballed", 4.51);
•	album.addSong("Evil walks", 3.45);
•	album.addSong("C.O.D.", 5.25);
•	album.addSong("Breaking the rules", 5.32);
•	album.addSong("Night of the long knives", 5.12);
•	albums.add(album);
•	 
•	LinkedList<Song> playList = new LinkedList<Song>();
•	albums.get(0).addToPlayList("You can't do it right", playList);
•	albums.get(0).addToPlayList("Holy man", playList);
•	albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
•	albums.get(0).addToPlayList(9, playList);
•	albums.get(1).addToPlayList(3, playList);
•	albums.get(1).addToPlayList(2, playList);
•	albums.get(1).addToPlayList(24, playList);  // There is no track 24

Banking
Your job is to create a simple banking application.
Implement the following classes:
1.  Bank
-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
-  And five methods, they are (their functions are in their names):
    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the branch was added successfully or false otherwise.
    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
    -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise.
    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it exists or null otherwise.
    -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise. This method prints out a list of customers.
→ TEST CODE
•	Bank bank = new Bank("National Australia Bank");
•	 
•	bank.addBranch("Adelaide");
•	 
•	bank.addCustomer("Adelaide", "Tim", 50.05);
•	bank.addCustomer("Adelaide", "Mike", 175.34);
•	bank.addCustomer("Adelaide", "Percy", 220.12);
•	 
•	bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
•	bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
•	bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
•	 
•	bank.listCustomers("Adelaide", true);
→ OUTPUT
The list of customers should be printed out in the following format if boolean parameter is true:
•	Customer details for branch Adelaide
•	Customer: Tim[1]
•	Transactions
•	[1]  Amount 50.05
•	[2]  Amount 44.22
•	[3]  Amount 12.44
•	Customer: Mike[2]
•	Transactions
•	[1]  Amount 175.34
•	[2]  Amount 1.65
•	Customer: Percy[3]
•	Transactions
•	[1]  Amount 220.12
and if false, only the customers - no transactions:
•	bank.listCustomers("Adelaide", false);
•	Customer details for branch Adelaide
•	Customer: Tim[1]
•	Customer: Mike[2]
•	Customer: Percy[3]
2.  Branch
    -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
    -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
    -  And five methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getCustomers(), getter for customers.
        -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. Returns true if the customer was added successfully or false otherwise.
        -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.
        -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the Customer if they exist, null otherwise.
3.  Customer
    -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
    -  A constructor that takes a  String (name of customer) and a double (initial transaction). It initialises name and instantiates transactions.
    -  And three methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getTransactions(), getter for transactions.
        -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.
TIP:  In Bank, use the findBranch() method in each of the other four methods to validate a branch. Do the same thing in Branch with findCustomer() - except for the two getters.
TIP:  In Customer, think about what else you need to do in the constructor when you instantiate a Customer object.
TIP:  Think about what methods you need to call from another class when implementing a method.

Abstract Class
Create an abstract class to define items that can be stored in a tree.
Implement the following:
1.  ListItem (abstract class)
    -  It has three protected fields. Two ListItems called rightLink and leftLink, and an Object called value.
    -  A constructor that takes an Object and initialises the field value with the parameter that was passed in.
    -  And seven methods:
        -  next(), setNext(), previous(), setPrevious() and compareTo() which are package-private and abstract (see child class for declaration).
        -  getValue(), takes no parameters and returns its value.
        -  setValue(), takes an Object and assigns it to value.
       
2.  Node (concrete class)
    -  It extends ListItem.
    -  It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.
    -  And five methods which are package-private:
        -  next(), takes no parameters and returns the ListItem to its right.
        -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.
        -  previous(), takes no parameters and returns the ListItem to its left.
        -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
        -  compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use value from ListItem for comparison. If this value is greater than the value that was passed in, then it should return a number greater than zero. If vice versa, then it should return a number less than zero, and zero if equal.
3.  MyLinkedList (concrete class)
    -  It implements NodeList.
    -  It has one field of type ListItem called root.
    -  A constructor that takes a ListItem and initializes the field root with the newly passed in parameter.
    -  And four methods:
        -  getRoot(), getter for root.
        -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise. If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
        -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
        -  traverse(), takes the root as an argument and does not return anything. If the root is null it prints out: The list is empty, otherwise print each value on a separate line.
4.  NodeList (interface)
    -  It has four methods:
        -  getRoot(), addItem(), removeItem() and traverse() which are package-private and abstract (see child class for declaration).
5.  SearchTree (concrete class)
    -  It implements NodeList.
    -  It has one field of type ListItem called root.
    -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
    -  And five methods:
        -  getRoot(), getter for root.
        -  addItem(), same as MyLinkedList.
        -  removeItem(), same as MyLinkedList.
        -  performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't return anything and is declared as private. Call this method from removeItem() when the item is found.
        -  traverse(), takes the root as an argument and does not return anything. It uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.
TIP:  The rules for adding an item to the linked tree are: 
          If the head of the tree is null, make the head refer to the item to be added.
          If the item to be added is less than the current item in the tree, add the item before the current item (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
          If the item to be added is greater than the current item, move onto the next item and compare again (if there is no next item, then that is where the new item belongs).
TIP:  When adding items to a Binary Search Tree, if the item to be added is less than the current item - then move to the left.
         If it is greater than the current item - then move to the right.
         The new item is added when an attempt to move in the required direction would involve following a null reference.
         Once again, duplicates are not allowed.
TIP:  Inorder = print the previous node, then the parent node, and then the next node (left -> node -> right).

Interface
Create a simple interface that allows an object to be saved to some sort of storage medium.
Implement the following:
1.  ISaveable (interface)
    -  It has two methods:
        -  write(), takes no arguments and returns a List containing objects of type String.
        -  read(), takes a List of type String and doesn't return anything.
2.  Player (class)
    -  It has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.
    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values. It initialises weapon with the default weapon "Sword".
    -  And eleven methods:
        -  Getters and setters for all four fields.
        -  write(), same as interface. Return a List of the fields in the order they appear in toString().
        -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.
        -  toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:
•	Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
3.  Monster (class)
    -  It has three fields. One String called name and Two ints called hitPoints and strength.
    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values.
    -  And six methods:
        -  Only getters for the three fields.
        -  write(), same as interface. Return a List of the fields in the order they appear in toString().
        -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.
        -  toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:
•	Monster{name='Werewolf', hitPoints=20, strength=40}
TIP:  Player and Monster need to implement ISaveable.


Playlist - Inner Class
Description:
For this exercise you will need your Album and Song classes from Coding Exercise 46: Playlist. The Playlist class will be modified to use an inner class called SongList which will replace the ArrayList that was used to hold the list of songs for an album.
The SongList class will use an ArrayList to hold the track list for the album. To do this a member variable called songs will need to be declared and a constructor will need to be implemented to initialize the field.
In addition, the inner class will need three(3) methods:
1) add - accepts a parameter of type Song. This method returns a boolean value which will be false if the song is found to already be in the songs list. If not, the song will be added to the list and a value of true will be returned.
2) findSong - accepts the title of a song as its only parameter. If the song with that title is found in the list then the song is returned from the method. If not, a value of null is returned.
3) findSong - overridden method which accepts a track number for a song. The track number is of type int. If a song is found with that track number the song is returned, otherwise null is returned.
The member variable, constructor and all methods may be marked with private access.
***IMPORTANT*** - If you are using an IDE to write this code you may have your inner class marked with private access. However, for the purposes of this code evaluation please mark the class itself public static.
Example input:
•	Album album = new Album("Stormbringer", "Deep Purple");
•	album.addSong("Stormbringer", 4.6);
•	album.addSong("Love don't mean a thing", 4.22);
•	album.addSong("Holy man", 4.3);
•	album.addSong("Hold on", 5.6);
•	album.addSong("Lady double dealer", 3.21);
•	album.addSong("You can't do it right", 6.23);
•	album.addSong("High ball shooter", 4.27);
•	album.addSong("The gypsy", 4.2);
•	album.addSong("Soldier of fortune", 3.13);
•	albums.add(album);
•	 
•	album = new Album("For those about to rock", "AC/DC");
•	album.addSong("For those about to rock", 5.44);
•	album.addSong("I put the finger on you", 3.25);
•	album.addSong("Lets go", 3.45);
•	album.addSong("Inject the venom", 3.33);
•	album.addSong("Snowballed", 4.51);
•	album.addSong("Evil walks", 3.45);
•	album.addSong("C.O.D.", 5.25);
•	album.addSong("Breaking the rules", 5.32);
•	album.addSong("Night of the long knives", 5.12);
•	albums.add(album);
•	 
•	LinkedList<Song> playList = new LinkedList<Song>();
•	albums.get(0).addToPlayList("You can't do it right", playList);
•	albums.get(0).addToPlayList("Holy man", playList);
•	albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
•	albums.get(0).addToPlayList(9, playList);
•	albums.get(1).addToPlayList(8, playList);
•	albums.get(1).addToPlayList(3, playList);
•	albums.get(1).addToPlayList(2, playList);
•	albums.get(1).addToPlayList(24, playList);  // There is no track 24
Example output:
•	The song Speed king is not in this album
•	This album does not have a track 24


•	
Po
