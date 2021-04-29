package section_4.decimal_comparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double value_one, double value_two) {
        if (value_one > 0 && value_two < 0 || value_one < 0 && value_two > 0) {
            return false;
        }
        String stringValueOne = String.valueOf(Math.abs(value_one));
        String stringValueTwo = String.valueOf(Math.abs(value_two));

        String[] arrOne = stringValueOne.split("");
        String[] arrTwo = stringValueTwo.split("");

        //could be extracted in separated method, but constraints of the task forbids this!
        if (arrOne.length >= arrTwo.length) {
            if (arrTwo.length > 4) {
                for (int i = 0; i <= 4; i++) {
                    if (!arrTwo[i].equals(arrOne[i])) {
                        return false;
                    }
                }
            } else {
                for (int i = 0; i < arrTwo.length; i++) {
                    if (!arrTwo[i].equals(arrOne[i])) {
                        return false;
                    }
                }
            }
        } else {
            if (arrOne.length > 4) {
                for (int i = 0; i <= 4; i++) {
                    if (!arrOne[i].equals(arrTwo[i])) {
                        return false;
                    }
                }
            } else {
                for (int i = 0; i < arrOne.length; i++) {
                    if (!arrOne[i].equals(arrTwo[i])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
