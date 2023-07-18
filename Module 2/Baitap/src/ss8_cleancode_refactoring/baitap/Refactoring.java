package ss8_Cleancode_Refactoring.baitap;

public class Refactoring {

    private static final int LOVE = 0;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstScore, int secondScore) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (firstScore == secondScore) {
            switch (firstScore) {
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

        if (firstScore >= 4 || secondScore >= 4) {
            int minusResult = firstScore - secondScore;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage first player");
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage second player ");
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for first player");
            } else {
                score = new StringBuilder("Win for second player");
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstScore;
                else {
                    score.append("-");
                    tempScore = secondScore;
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
