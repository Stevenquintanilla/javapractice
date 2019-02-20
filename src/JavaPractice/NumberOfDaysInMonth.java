package JavaPractice;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        int numberOfDays = 0;
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }

        switch (month) {
            case 1: numberOfDays = 31;
                break;
            case 2: if(isLeapYear(year) == true){
                numberOfDays = 29;
            } else{
                numberOfDays = 28;
            }
                break;
            case 3: numberOfDays = 31;
                break;
            case 4: numberOfDays = 30;
                break;
            case 5: numberOfDays = 31;
                break;
            case 6: numberOfDays = 30;
                break;
            case 7: numberOfDays = 31;
                break;
            case 8: numberOfDays = 31;
                break;
            case 9: numberOfDays = 30;
                break;
            case 10: numberOfDays = 31;
                break;
            case 11: numberOfDays = 30;
                break;
            case 12: numberOfDays = 31;
                break;
        }
        return numberOfDays;
    }
}