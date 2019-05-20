package javapractice;

public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double inputOne, double inputTwo){
        if ((int) (inputOne * 1000) == (int) (inputTwo *1000)){
            return true;
        } else {
            return false;
        }
    }

}