package section_4.equal_sum_cheker;

public class EqualSumChecker {
    public static boolean hasEqualSum (int number_one, int number_two, int sum){
      if (number_one + number_two == sum){
          return true;
      }
      return false;
    }
}
