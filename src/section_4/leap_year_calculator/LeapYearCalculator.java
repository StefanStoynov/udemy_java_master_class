package section_4.leap_year_calculator;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (year % 100 % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
