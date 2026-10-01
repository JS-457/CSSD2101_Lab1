1. Scope and Contributions (2 minutes)

We were required to use IntelliJ, Maven, Javadocs, and Github for the application of the lab. We are represented as two members for this Lab 1, being Sayed Shah and Mohsen Abkenar (review the text file for more information).
Most of the changes to the code were primarily for the Book Class to implement exceptions, BookstoreAPI to implement the primary functions,
implemented a try and catch statement VERY recently for Main function and created a Main2 function to test out Task 1, 3, and 4. I specifically used the lab1 solution for
solving and understanding these functions:
- inventoryValueCents
- removeByIsbn
- filterPriceAtMost, for the seperation
- averagePrice, regarding the BigDecimal conversion
- 

2. Design and Code (8 minutes)
I will go over each part of the code based on the respective tasks, with extra information wherever it is necessary.
Based on what was mentioned in task (1):
- Normalization was tested in book 1 with a Book object that included an invalid ISBN value.
- Invalid adjacent years was done with an out-of-range year value.
- Blank text was caught via the existing exceptions for the text function, Empty and Null had their own 
- For price, something to catch would be if its value is less than 0.
With an admittedly last minute try-catch sequence, the error was caught and resumed the program.
For the null text catch, I made a new catch sequence for NullPointerException.

What we recognized is that 

Task 2 required us to 
- 
-
-
-


3. Behaviour and Failures

4. Limitations
