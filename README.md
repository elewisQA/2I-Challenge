# 2I Coding Challenge

This repo contains code relating to a coding challenge set by 2I as part of a job application process.

## The Brief
Provide code that iterates in multiples of 7 up to 100,  
then in multiples of 8 up to 200,  
then in multiples of 9 up to 300.  
  
This is to be completed by 12 noon on 12/03/21

## Solution
### Usage
1. Open the project in some Java capable IDE - I used Eclipse.
2. Run 'Main.java' located in `src/main/java` 
3. Input is done through a simple console scanner, reading the next integer entered, so simply enter the number of the option you wish to use and hit the return key.
  
### Functionality:
A function called 'multiples' is parsed an two integer values, the first is used as the number to increment in multiples of, the second is the number to iterate up to.  
i.e: calling `multiples(7, 100)` achieves the first desired goal of iterating up to 100 in multiples of 7.  
  
A string-builder is used to store the output, adding commas to ensure results are printed on one line rather than scrolling down the console.

The different menu options call on very basic functions that print out what goal they are achieving, followed by an appropriate call to the 'multiples' function.  
This was done so I didn't have to make repeat print statements or calls to the function for the different options given to the user.  
  
The menu selection is done using integer input through the console as mentioned, which is cycled through using a switch case.