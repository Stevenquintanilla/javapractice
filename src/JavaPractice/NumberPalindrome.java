package javapractice;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int originalNum = number;
        int r = 0;
        int s = 0;

        while (number != 0){
            r = number % 10;
            s = s * 10 + r;
            number = number / 10;
        }

        if(s == originalNum){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        isPalindrome(11);
    }
}