package JavaPractice;

public class StringPalindrome {

    public static boolean isPalindrome(int number) {

        String converted = number + "";
        int startPos = 0;
        int endPos = converted.length() - 1;

        while (startPos < endPos) {
            String startLetter = converted.substring(startPos, startPos + 1);
            String endLetter = converted.substring(endPos, endPos + 1);
            if (startLetter != endLetter) {
                return false;
            }

            startPos++;
            endPos--;
        }

        return true;

    }
}