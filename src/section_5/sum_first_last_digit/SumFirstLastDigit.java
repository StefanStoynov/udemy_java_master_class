package section_5.sum_first_last_digit;

public class SumFirstLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        
        int lessSignificantNumber = number % 10;
        number /= 10;

        if (number == 0) {
            lessSignificantNumber += lessSignificantNumber;
        }

        while (number > 0) {
            int nextNumber = number % 10;
            number /= 10;
            if (number == 0) {

                lessSignificantNumber += nextNumber;
            }

        }
        return lessSignificantNumber;
    }
}
