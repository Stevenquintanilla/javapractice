package javapractice;

public class FeetAndInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        double feetToCenti = feet * 30.48;
        double inchesToCenti = inches * 2.54;
        double result = feetToCenti + inchesToCenti;
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double totalInches){
        if(totalInches < 0){
            return -1;
        }
        int inchesToFeet = (int) totalInches / 12;
        int remainingInches = (int) totalInches % 12;
        return calcFeetAndInchesToCentimeters(inchesToFeet, remainingInches);
    }

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(12);
        if (centimeters == -1){
            System.out.println("Invalid Parameters");
        } else {
            System.out.println("Total centimeters : " + centimeters);
        }
    }
}
