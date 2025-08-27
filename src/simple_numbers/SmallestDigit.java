package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND THE SMALLEST DIGIT IN A NUMBER
public class SmallestDigit {
    public static void main(String[] args) {
        int temp,rem,smallest=9;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp = Math.abs(num);
        while (temp>0){
            rem= temp%10;
            if (rem < smallest) {
                smallest = rem;
            }

            //solution implementation using ternary operator
            //smallest = rem<smallest?rem:smallest;
            temp/=10;
        }
        System.out.printf("The smallest digit of %d is: %d",num,smallest);
    }
}
