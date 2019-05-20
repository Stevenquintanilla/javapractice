package javapractice;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int lastNum = number % 10;
        int firstNum = 0;
        while(number != 0) {
            if((number / 10) == 0){
                firstNum = number;
                break;
            } else {
                number = number / 10;
            }
        }

        return firstNum + lastNum;
    }
}