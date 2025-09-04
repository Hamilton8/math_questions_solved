package special_numbers;

import java.util.Scanner;

//PROGRAM TO CHECK IF A NUMBER IS A PERFECT NUMBER OR NOT
public class PerfectNumber {
    public static void main(String[] args) {
        int temp,rem,sum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        for (int i = 1; i < num; i++) {
            rem = num%i;
            if(rem==0){
                sum+=i;
            }
        }
        if (sum == num){
            System.out.printf("The number %d is a perfect number",num);
        }else{
            System.out.printf("The number %d is not a perfect number",num);
        }
    }
}
