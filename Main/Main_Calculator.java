package Main;
import Arithmetic.math_functions;
import java.util.Scanner; 
public class Main_Calculator {
	static boolean calcu = true;
	static Scanner scan = new Scanner(System.in);
      public static void main(String[] args){
    	  
    	  while(calcu == true) {
    	  int num1, num2;
    	  char choice;
    	  math_functions math = new math_functions();
    	  System.out.print("Enter first number: ");
    	  num1 = scan.nextInt();
    	  System.out.print("Enter second number: ");
    	  num2 = scan.nextInt();
    	  System.out.println();
    	  System.out.println("[A] for Addition");
    	  System.out.println("[S] for Subtraction");
    	  System.out.println("[M] for Multiplication");
    	  System.out.println("[D] for Division");
    	  System.out.print("Select Operator: ");
    	  choice = scan.next().charAt(0);
    	  
    	  switch(choice) {
    	  case 'A':
    	  case 'a':
    		  int sum = math.addition(num1, num2);
    		  System.out.println("The Sum of two numbers is " + sum);
    		  selection();
    		  break;
    	  case 'S':
    	  case 's':
    		  int sub = math.subtraction(num1, num2);
    		  System.out.println("The Difference of two numbers is "+ sub);
    		  selection();
    		  break;
    	  case 'M':
    	  case 'm':
    		  int product = math.multiplication(num1, num2);
    		  System.out.println("The Product of two numbers is "+ product);
    		  selection();
    		  break;
    	  case 'D':
    	  case 'd':
    		  float div = math.division(num1, num2);
    		  System.out.println("The Quotient of two number is " + div);
    		  selection();
    		  break;
		default:
			System.out.println("Invalid selection! The program will now exit");
			selection();
			break;
    			  
    	  }
    	  
    	  }  
    }
      static void selection() {
    	  char selection;
    	  System.out.print("Do you want to try again? [Y] for yes [N] for no: ");
    	  selection = scan.next().charAt(0);
    	  if(selection == 'Y' || selection == 'y') {
    		  System.out.println();
    		  calcu = true;
    	  }
    	  else {
    		  System.out.println("The program will now exit!");
    		  calcu = false;
    	  }
    	  
      }
        
}
