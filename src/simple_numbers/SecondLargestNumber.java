package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND THE SECOND-LARGEST DIGIT IN A NUMBER
//rem-remainder
public class SecondLargestNumber {
    public static void main(String[] args) {
        int temp, rem,secondLargest=-1,largest=-1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        temp = Math.abs(num);
        while(temp>0){
            rem = temp%10;
            if(rem>largest){
                secondLargest = largest;
                largest = rem;
            }

            if (rem<largest && rem>secondLargest){
                secondLargest = rem;
            }
            temp /= 10;
        }

        if (secondLargest==-1){
            System.out.printf("The number %d has no second largest digit",num);
        }else {
            System.out.printf("The second largest digit of %d is: %d", num,secondLargest);
        }

    }
}
