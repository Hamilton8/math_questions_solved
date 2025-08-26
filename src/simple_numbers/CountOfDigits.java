package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND COUNT OF DIGITS IN A NUMBER
public class CountOfDigits {
    public static void main(String[] args) {
        int temp,count =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = num;
        while (temp>0){
            temp /= 10;
            count++;
        }
        System.out.printf("The count of digits of %d is: %d",num,count);
    }
}
