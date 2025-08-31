package simple_numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int rem,count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        for (int i = 1; i <= num ; i++) {
            rem=num%i;
            if (rem==0){
                count++;
            }
        }

        if(count==2){
            System.out.printf("The number %d is a prime number",num);
        }else {
            System.out.printf("The number %d is not a prime number",num);
        }
    }
}
