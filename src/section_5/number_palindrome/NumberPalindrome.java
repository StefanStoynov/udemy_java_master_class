package section_5.number_palindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        String[] numberArr = Integer.toString(Math.abs(number)).split("");

        boolean isPalindrome = false;

        for (int i = 0; i < numberArr.length / 2; i++) {
            if (numberArr[i].equals(numberArr[numberArr.length - 1 - i])) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
