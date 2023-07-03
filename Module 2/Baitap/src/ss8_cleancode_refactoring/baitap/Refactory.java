package ss8_cleancode_refactoring.baitap;

public class Refactory {

    private static final int LOVE = 0;
    private static final int FIFTEENSCORE = 0;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (firstPlayerScore == secondPlayerScore) {
            switch (firstPlayerScore) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;
            }
        }

         if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage first player");
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage second player ");
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for first player");
            } else {
                score = new StringBuilder("Win for second player");
            }
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerScore;
                else {
                    score.append("-");
                    tempScore = secondPlayerScore;
                }
                switch (tempScore) {
                    case LOVE:
                        score.append("Love");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
