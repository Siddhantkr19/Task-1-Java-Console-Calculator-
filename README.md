**Java Console Calculator (Task1)**

This project is a simple, menu-driven calculator application built in Java. It runs entirely within the console/terminal and allows users to perform basic arithmetic operations repeatedly.

 **Features**

Continuous Operation: Uses a while loop for multiple calculations.

Modular Design: Dedicated static methods for addition, subtraction, multiplication, and divide.

Error Prevention: Includes a check to handle Division by Zero gracefully.

Clear Menu: Guides the user through the process with a simple numbered menu.

**Requirements**

Java Development Kit (JDK): Version 8 or higher.



**How to Run**

1. Setup

Save the code as Task1.java.

2. Compile & Execute

Open your terminal in the project directory and run the following commands sequentially:

javac Task1.java
java Task1


**How to Use**

Run the application and select an operation (1-4) from the displayed menu.

Enter the two requested numerical inputs when prompted.

The result will be displayed, and the application will automatically loop back to the menu for the next calculation.

Select option 5 (Exit) to quit the application.

**Code Structure**

The core logic is contained within the Task1 class:

 **Method**   ------------------  **Purpose**            

addition(a, b)------------------------Returns a + b

subtraction(a, b)---------------------Returns a - b

multiplication(a, b)------------------Returns a * b.

divide(a, b)--------------------------Returns a / b.         
