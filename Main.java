import java.util.Scanner;
/**
 * Write a program that will have the user enter in a positive integer. It will then print the numbers from 1 to that number on a single line with commas in between them.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//output the message
		System.out.println("Please enter a positive integer");
		//get input from user
		int positiveInt = input.nextInt();
		//set the value for the outputing message as 1 less than the inputed value
		int mainNumber = positiveInt - 1;
		//initialize the count value as 0
		int count=0;
		//only works while count is less than mainnumber
		while (count < mainNumber){
			//increases count value as an increment of 1
			count = count + 1;
			//output the count value with a coma
			System.out.print(count + ", ");
		}
		//output the final number with no coma
		System.out.println(positiveInt);
	}
}

