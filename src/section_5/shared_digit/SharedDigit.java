package section_5.shared_digit;

public class SharedDigit {
    public static boolean hasSharedDigit(int num_one, int num_two) {
      
        if (num_one < 11 || num_one > 99 || num_two < 11 || num_two > 99) {
            return false;
        }
        
        int tempTwo = num_two;
        while (num_one > 0) {
            int currentOne = num_one % 10;
            while (tempTwo > 0) {
                int currentTwo = tempTwo % 10;
                if (currentOne == currentTwo) {
                    return true;
                }
                tempTwo /= 10;
            }
            num_one /= 10;
            tempTwo = num_two;
        }
        return false;
    }

}
