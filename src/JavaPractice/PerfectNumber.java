package JavaPractice;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int findingPerfectNumber = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                findingPerfectNumber += i;
            }
        }
        return findingPerfectNumber == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}