package JavaPractice;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;
        int r = 0 ;
        while (number != 0){
            r = number % 10;
            if((r % 2) == 0){
                sum += r;
            }

            number = number /10;
        }

        return sum;
    }
}