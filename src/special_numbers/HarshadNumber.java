package special_numbers;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        int temp, rem, sum = 0;
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        temp = num;
        while(temp>0){
            rem = temp %10;
            sum+=rem;
            temp/=10;
        }
        if (num%sum == 0){
            System.out.printf("The number %d is harshad number",num);
        }else {
            System.out.printf("The number %d is not harshad number",num);
        }
    }
}
