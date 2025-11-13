import java.util.Scanner;

public class Task1{

    public static double addition(double a, double b) {
        return a + b;
    
    }
      public static double subtraction(double a, double b) {
        return a - b;
      }
      public static double multiplication(double a, double b) {
        return a * b;
      }
      public static double divide (double a , double b ){
         if (b==0){
            System.out.println("Error: Division by zero is not possible");
             return Double.NaN;
         }

         return a / b;
      }
    

 
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean continuousCalculating = true;
   System.out.println( " welcome to calculator,use it freely according to your need " );
    while(continuousCalculating){
        System.out.println(" Welcome to calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    
    int choice ;
    System.out.println( "Choose an operator as a number between 1 to  4");
     if(scanner.hasNextInt()){
        choice  = scanner.nextInt();
     }
      else{
        System.out.println("Invalid input. Please enter a number between 1 and 5.");
        scanner.next(); // Clear the invalid input
        continue;
      }
 if(choice == 5){
    continuousCalculating = false;
    System.out.println(" Thanks for  using calculator ");
    continue ;
 }

  if(choice < 1 || choice > 5){
    System.out.println("Invalid choice. Please select a number between 1 and 5.");
    continue;
   
  }
 double  num1 , num2 ;
System.out.print("Enter the first number: ");
if(scanner.hasNextDouble()){
    num1 = scanner.nextDouble();
} else 
{
    System.out.println("Invalid input. Please enter a valid number.");
    scanner.next(); // Clear the invalid input
    continue;
}
System.out.print("Enter the Second  number: ");
 if(scanner.hasNextDouble()){
    num2 = scanner.nextDouble();
 } else {
    System.out.println("Invalid input. Please enter a valid number.");
    scanner.next(); // Clear the invalid input
    continue;
 }

double result  = -1; 
boolean validresult = true ;

    switch (choice) {
        case 1:
             result = addition(num1, num2);
            break;
        case 2:
            result = subtraction(num1, num2);
            break;
        case 3:
            result = multiplication(num1, num2);
            break;
        case 4:
            result = divide( num1, num2);
            if(Double.isNaN(result)){
                System.out.println("Calculation can be performed because of deivision by Zero is not possible ");
                validresult = false;
            }
             break ;            
}
if(validresult){
    System.out.println("The result is: " + result);
    
    System.out.println( );
    System.out.println( );
   

}

 }
 scanner.close();

 System.out.println( "thanks for using calculator ");
}
}
