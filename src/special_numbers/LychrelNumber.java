package special_numbers;

import java.util.Scanner;

/*Lychrel number is a natural number
that is not known to form a palindrome
through the iterative process of repeatedly
reversing its digits and adding the result*/
public class LychrelNumber {
    public static void main(String[] args) {
        int sum;
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int reversed = Maths.reverseNumber(num);
        sum = num+reversed;
        if (!Maths.isPalindrome(sum)){
            System.out.printf("The number %d is a Lychrel number",num);
        }else{
            System.out.printf("The number %d is not a Lychrel number",num);
        }
    }
}
