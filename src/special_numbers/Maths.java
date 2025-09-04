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
}
