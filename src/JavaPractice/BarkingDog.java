package JavaPractice;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean sparkyBarks, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if (sparkyBarks == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }
}