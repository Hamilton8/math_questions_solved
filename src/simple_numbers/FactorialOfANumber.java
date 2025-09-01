package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND THE FACTORIAL OF A NUMBER
public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        int fact = 1;
        for (int i = num; i > 0 ; i--) {
            fact*=i;
        }
        System.out.printf("The factorial number of %d is: %d",num,fact);
    }
}
