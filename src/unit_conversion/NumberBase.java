package unit_conversion;

import special_numbers.Maths;

import java.util.Scanner;

public class NumberBase {
    public static void main(String[] args) {
        int num,temp,rem,result=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose one of the option below\n1.Binary\n2.Octal\n3.Decimal\n4.Hexadecimal");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter the binary number:");
                num = input.nextInt();
                int count =  Maths.getCountOfDigits(num);

                System.out.println("1.Binary to Decimal\n2.Binary to Octal\n3.Binary to Hexadecimal");
                option = input.nextInt();
                switch (option){
                    case 1:
                        temp = num;
                        for(int i=0; i<count; i++){
                            rem = temp%10;
                            result += (int) (rem*Math.pow(2,i));
                            temp/=10;
                        }
                        System.out.printf("The binary number %d id equivalent to the decimal number %d",num,result);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }
}
