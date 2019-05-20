package javapractice;

public class TimeIsAFlatCircle {

    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 && (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid input");
        } else {
            int hours = minutes / 60;
            int remainMinutes = minutes % 60;
            System.out.println(hours + "h " + remainMinutes + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int totalSeconds) {
        if(totalSeconds < 0){
            System.out.println("Invalid input");
        } else {
            int minutes = totalSeconds / 60;
            int remainingSeconds = totalSeconds % 60;
            getDurationString(minutes, remainingSeconds);
        }
    }

        public static void main(String[] args) {
            getDurationString(1000);
    }
}
