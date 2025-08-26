package simple_numbers;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        int temp,greater=0,reminder;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = num;
        while(temp>0){
            reminder = temp%10;
            if (reminder>greater){
                greater = reminder;
            }
            temp/=10;
        }
        System.out.printf("The largest digit of %d is: %d",num,greater);
    }
}
