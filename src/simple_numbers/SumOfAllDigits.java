package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND THE SUM OF ALL DIGITS IN A NUMBER
public class SumOfAllDigits {
    public static void main(String[] args) {
        int temp,rem, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = num;
        while(temp>0){
            rem = temp%10;
            sum+=rem;
            temp/=10;
        }
        System.out.printf("The sum of all digits of %d is: %d",num,sum);
    }
}
