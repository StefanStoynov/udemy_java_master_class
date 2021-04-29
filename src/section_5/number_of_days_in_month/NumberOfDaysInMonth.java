package section_5.number_of_days_in_month;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        //validate year parameter
        if (year < 1 || year > 9999) {
            return false;
        }

        //check is it leap year
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

    public static int getDaysInMonth(int month, int year) {
        //validation of parameters
        if (month > 12 || month < 1 || year > 9999 || year < 1) {
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        int result = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 2:
                if (isLeapYear) {
                    result = 29;
                } else {
                    result = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
        }

        return result;
    }
}
