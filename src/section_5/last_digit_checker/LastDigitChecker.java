package section_5.last_digit_checker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number_one, int number_two, int number_three) {

        if (!isValid(number_one) || !isValid(number_two) || !isValid(number_three)){
            return false;
        }

        int rightMostFirst = number_one % 10;
        int rightMostSecond = number_two % 10;
        int rightMostThird = number_three % 10;

        if (rightMostFirst == rightMostSecond || rightMostFirst == rightMostThird
        || rightMostSecond == rightMostThird){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }


}