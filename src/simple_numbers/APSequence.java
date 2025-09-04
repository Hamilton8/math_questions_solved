package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND A NUMBER IN AN AP SEQUENCE
public class APSequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,first,diff,num,pos,an;
        System.out.println("1. Find a number given a position\n2. Find a position given a number");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter the first term:");
                first= input.nextInt();

                System.out.println("Enter the common difference:");
                diff = input.nextInt();

                System.out.println("Enter the position:");
                pos = input.nextInt();
                num = first+(pos-1)*diff;
                System.out.printf("The number in the position %d is: %d",pos,num);
                break;
            case 2:
                System.out.println("Enter the first term:");
                first = input.nextInt();

                System.out.println("Enter the common difference:");
                diff = input.nextInt();

                System.out.println("Enter the number:");
                num = input.nextInt();

                pos = (num-first+diff)/diff;

                System.out.printf("The position of the number %d is: %d",num,pos);
                break;
            default:
                System.out.println("Enter only one of the valid options");
                break;
        }
    }
}
