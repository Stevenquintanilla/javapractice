package JavaPractice;

public class RoundNumber {

    private static double round(double value, int precision){
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}