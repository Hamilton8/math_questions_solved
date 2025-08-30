package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND OUT WHETHER A NUMBER IS PALINDROME OR NOT
public class PalindromeNumber {
    public static void main(String[] args) {
        int temp,rem,reversed=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = num;
        while(temp>0){
            rem=temp%10;
           reversed = reversed*10+rem;
           temp/=10;
        }
        if (reversed==num){
            System.out.printf("The number %d is palindrome",num);
        }else {
            System.out.printf("The number %d is not palindrome!",num);
        }
    }
}
