package simple_numbers;

import java.util.Scanner;

//PROGRAM TO REVERSE A NUMBER
public class ReverseDigits {
    public static void main(String[] args) {
        int temp, rem, reversedNum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = num;
        while (temp>0){
            rem = temp%10;
            reversedNum=reversedNum*10+rem;
            temp /= 10;
        }

        System.out.printf("The reversed number of %d is: %d",num,reversedNum);
    }
}
