package JavaPractice;

import java.util.Scanner;

public class RemainderCalculator {

    public static int remCalc(int x, int y){
        return x % y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first value(x)");
            int x = scanner.nextInt();
            System.out.println("Enter the second value(y)");
            int y = scanner.nextInt();

            System.out.println("Result of " + x + "(x) % " + y + "(y) = " + remCalc(x, y));
        }
    }
}
