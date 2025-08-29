package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND THE SECOND SMALLEST DIGIT IN A NUMBER
public class SecondSmallestDigit {
    public static void main(String[] args) {
        int rem,temp,smallest=10,secondSmallest=10;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        temp=num;
        while(temp>0){
            rem=temp%10;
            if (rem<smallest){
                secondSmallest = smallest;
                smallest=rem;
            }

            if (rem>smallest && rem<secondSmallest){
                secondSmallest = rem;
            }
            temp/=10;
        }

        if (secondSmallest==10){
            System.out.printf("The number %d has no second smallest digit",num);
        }else {
            System.out.printf("The second smallest digit of %d is %d",num,secondSmallest);
        }
    }
}
