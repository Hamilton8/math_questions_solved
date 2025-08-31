package simple_numbers;

import java.util.Scanner;

//PROGRAM TO PRINT ALL THE PRIME NUMBERS SMALLER THAN A TYPED NUMBER
public class PrimesSmaller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rem;

        System.out.println("Enter the number:");
        int num = input.nextInt();
        for (int i = num; i > 0 ; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                rem = i%j;
                if (rem==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+" ");
            }
        }
    }

}
