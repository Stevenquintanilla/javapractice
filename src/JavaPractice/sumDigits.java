package JavaPractice;

public class sumDigits {

    public static int sumDigits(int num) {
        if(num < 10){
            return -1;
        }

        int sum = 0;
        while(num > 0){
            int add = num % 10;
            sum = sum + add;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int results = sumDigits(312);
        System.out.println(results);
    }
}
