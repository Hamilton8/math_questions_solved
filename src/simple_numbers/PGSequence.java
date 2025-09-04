package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND A NUMBER IN A PG SEQUENCE
public class PGSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first term");
        int first = input.nextInt();

        System.out.println("Enter the common ratio:");
        int ratio = input.nextInt();

        System.out.println("Enter the position:");
        int pos = input.nextInt();

        int an = (int) (first*Math.pow(ratio,pos-1));

        System.out.printf("The number at the position %d is: %d",pos,an);
    }
}
