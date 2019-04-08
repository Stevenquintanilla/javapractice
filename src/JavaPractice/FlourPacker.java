package JavaPractice;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigCountTotal = bigCount * 5;
        int sum = bigCountTotal + smallCount;

        if(goal % 5 == 0 && bigCountTotal == goal){
            return true;
        } else if(bigCountTotal != goal && smallCount < goal % 5) {
            return false;
        }

        if(sum < goal) {
            return false;
        } else {
            return true;
        }

    }
}