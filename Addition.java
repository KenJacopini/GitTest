// Fig. 2.7: Addition.Java
// Addition program that inputs two numbers and diplays their sum

import java.util.Scanner; // program uses class Scanner

public class Addition
{
  // main method begins execution of Java application
    public static void main(String[] args)
    {
      // create a scanner to obtain input from the window command
      Scanner input = new Scanner(System.in); 

      System.out.print("Enter name: ");
      String name =input.nextLine();

      System.out.print("Enter age: ");
      int age = input.nextInt();

     /* System.out.print("Enter first integer:"); //prompt
      int number1 = input.nextInt(); //read first number from user

      System.out.print("Enter second integer:"); // prompt
      int number2 = input.nextInt(); //read second number from user

      int sum = number1 + number2; //add numbers, then store total in sum

      int difference = number1 - number2; // subtract numbers, then store total in difference

      int multiplication = number1 * number2; //multiply numbers, then store total in multiplication

      int division = number1 / number2; //divide numbers, then store total in division

      System.out.printf("Sum is %d%n", sum); //display sum
      System.out.printf("Difference is %d%n",difference); // display difference
      System.out.printf("Multiplication is %d%n", multiplication); // display multiplication
      System.out.printf("Division is %d%n", division); // display division
      input.close();*/

      System.out.println("my name is " + name + ", I am " + age + " years old");
      //System.out.println(number1);
      //System.out.println(number2);

    } //end method main


} //end class addition
