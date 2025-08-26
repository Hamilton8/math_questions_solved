package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND THE LARGEST DIGIT
public class LargestDigit {
    public static void main(String[] args) {
        int temp,greater=0,remainder;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = num;
        while(temp>0){
            remainder = temp%10;
            if (remainder>greater){
                greater = remainder;
            }
            temp/=10;
        }
        System.out.printf("The largest digit of %d is: %d",num,greater);
    }
}
