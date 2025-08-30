package simple_numbers;

import java.util.Scanner;

//PROGRAM TO SUM N NUMBERS
public class SumOfNNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of times you want to sum:");
        int num = input.nextInt();

        for(int i=0; i<num; i++){
            System.out.printf("Enter the %d number",(i+1));
            sum+=input.nextInt();
        }
        System.out.printf("The sum of the inputed numbers is: %d",sum);
    }
}
