public class Warmups {

    public static void displayHighScorePosition(String playerName, int playerScorePosition){
        System.out.println(playerName + " managed to get into position " + playerScorePosition + " on the high " +
                "score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 0;

        if (playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500 &&  playerScore < 1000) {
            position = 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }

    public static void main(String[] args) {
        String playerName = "Steven";
        int StevenScore = 500;

        displayHighScorePosition(playerName, calculateHighScorePosition(StevenScore));
    }
}
