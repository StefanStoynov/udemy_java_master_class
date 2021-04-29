package section_5.greatest_common_divisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        if (first == second) {
            return first;
        }

        int lowliestNumber = Math.min(first, second);
        int biggestNumber = Math.max(first, second);

        int result = 0;

        for (int i = lowliestNumber; i > 1 ; i--) {
            if (biggestNumber % i == 0 && lowliestNumber % i == 0){
                result = i;
                break;
            }
        }

        return result;
    }
}
