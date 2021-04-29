package section_5.flour_pack_problem;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountKilos = bigCount * 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (goal / 5 == 0) {
            if (goal > bigCountKilos + smallCount) {
                return false;
            }
            if (goal > smallCount) {
                return false;
            }
        } else if (goal > bigCountKilos + smallCount) {
            return false;
        } else if (goal < bigCountKilos + smallCount) {
            int left = goal / 5;
            if (goal > left * 5 + smallCount) {
                return false;
            }
        }
        return true;

    }
}
