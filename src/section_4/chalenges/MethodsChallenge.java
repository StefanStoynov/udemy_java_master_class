package section_4.chalenges;

public class MethodsChallenge {
    public static void main(String[] args) {
        int playerReturn = 50;
        String playerName = "Stefan";
        int position = calculateHighReturnPosition(playerReturn);
        displayHighReturnPosition(playerName, position);
    }

    public static void displayHighReturnPosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high return table");
    }

    public static int calculateHighReturnPosition(int playerreturn) {

        if (playerreturn >= 1000) {
            return 1;
        } else if (playerreturn >= 500) {
            return 2;
        } else if (playerreturn >= 100) {
            return 3;
        }
        return 4;
    }
}
