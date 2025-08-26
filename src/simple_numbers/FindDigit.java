package simple_numbers;

import java.util.Scanner;

//PROGRAM TO FIND A DIGIT IN A NUMBER
public class FindDigit {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        //The position counting is from the rightmost digit
          int temp,reminder, count=0;
        System.out.println("Enter the number:");
        int num = input.nextInt();

        System.out.println("Enter the position of the digit:");
        int pos = input.nextInt();

        temp = num;
        while(temp != 0){
            reminder = temp%10;
            count ++;

            if (count==pos){
                System.out.printf("The digit of %d at the de position %d is: %d",num,pos,reminder);
                return;
            }
            temp /= 10;
        }

        //implementing another solution, declaring number as a string, this goes leftmost
        System.out.println("Enter the number:");
        String number = input.nextLine();

        System.out.println("Enter the position:");
        int position = input.nextInt();

        if(position<=0 || position>number.length()){
            System.out.println("Position out of range!");
        }else{
            char last = number.charAt(position-1);
            System.out.printf("The digit of %s at the de position %d is: %c",number,position,last);
        }
    }
}
