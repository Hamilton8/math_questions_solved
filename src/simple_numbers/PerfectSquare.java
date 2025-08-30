package simple_numbers;

import java.util.Scanner;

//PROGRAM TO TEST WHETHER A NUMBER IS A PERFECT SQUARE OR NOT
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        int sqrt = (int) Math.sqrt(num);

        if (num==sqrt*sqrt){
            System.out.printf("The number %d is a perfect square",num);
        }else{
            System.out.printf("The number %d is not a perfect square",num);
        }
    }
}
