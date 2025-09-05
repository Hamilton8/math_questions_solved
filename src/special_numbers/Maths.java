package special_numbers;

public class Maths {

    public static int getCountOfDigits(int temp){
        int count = 0;
        while(temp>0){
            temp/=10;
            count++;
        }
        return count;
    }

    public static int reverseNumber(int num){
        int rem,reversed=0;
        while (num>0){
            rem=num%10;
            reversed = reversed*10+rem;
            num/=10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num){
        return reverseNumber(num) == num;
    }
}
