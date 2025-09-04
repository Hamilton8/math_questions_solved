package special_numbers;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int temp,rem,sum=0,fact;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp=num;
        while (temp>0){
            rem =temp%10;
            fact =1;
            for (int i = rem; i>1; i--){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }

        if (sum==num){
            System.out.printf("The number %d is a strong number",num);
        }else{
            System.out.printf("The number %d is not a strong number",num);
        }
    }
}
