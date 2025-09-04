package special_numbers;

import java.util.Scanner;

//PROGRAM TO CHECK WHETHER A NUMBER IS ARMSTRONG OR NOT
 public class ArmstrongNumber {
    public static void main(String[] args) {
        int count,rem,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();

        count = Maths.getCountOfDigits(num);
        int temp = num;
        while(temp>0){
            rem = temp%10;
            sum+=(int)(Math.pow(rem,count));
            temp/=10;
        }
       if(sum == num){
           System.out.printf("The number %d is armstrong",num);
       }else{
           System.out.printf("The number %d is not armstrong",num);
       }
    }
}
