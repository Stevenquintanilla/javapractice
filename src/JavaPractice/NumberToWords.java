package javapractice;

public class NumberToWords {
    public static void numberToWords(int number){
        int originalDigit = getDigitCount(number);
        number = reverse(number);
        int reverseDigit = getDigitCount(number);
        int digitDifference = Math.abs(originalDigit - reverseDigit);

        if(number < 0){
            System.out.println("Invalid Value");
        } else if(number == 0){
            System.out.println("Zero");
        } else{
            while(number != 0) {
                int rightDigit = number % 10;
                switch (rightDigit) {
                    case 0: System.out.println("Zero");
                        break;
                    case 1: System.out.println("One");
                        break;
                    case 2: System.out.println("Two");
                        break;
                    case 3: System.out.println("Three");
                        break;
                    case 4: System.out.println("Four");
                        break;
                    case 5: System.out.println("Five");
                        break;
                    case 6: System.out.println("Six");
                        break;
                    case 7: System.out.println("Seven");
                        break;
                    case 8: System.out.println("Eight");
                        break;
                    case 9: System.out.println("Nine");
                        break;
                }
                number = number / 10;
            }
            for(int i = 1; i <= digitDifference; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        while(number != 0) {
            int rightDigit = number % 10;
            reverse = reverse * 10 + rightDigit;
            number = number / 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        } else if(number == 0){
            return 1;
        }
        int digitCount = 0;
        while(number != 0) {
            number = number / 10;
            digitCount++;
        }

        return digitCount;
    }
}





