package section_5.number_to_words;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int numberCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reversedNumberCount = getDigitCount(reversedNumber);


        while (reversedNumber > 0) {
            int printNum = reversedNumber % 10;
            switch (printNum) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
            reversedNumber /= 10;
        }

        int zeroCount = numberCount - reversedNumberCount;

        for (int i = 0; i < zeroCount; i++) {
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        String numToString = "";
        if (number < 0) {
            numToString = "-";
        } else if (number == 0) {
            numToString = "0";
        }
        int n = Math.abs(number);
        while (n > 0) {
            int lastDigit = n % 10;
            numToString = numToString + lastDigit;
            n /= 10;
        }

        return Integer.parseInt(numToString);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
