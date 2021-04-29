package section_4.equal_sum_cheker;

public class Main {
    public static void main(String[] args) {
        EqualSumChecker checker = new EqualSumChecker();
        boolean res = checker.hasEqualSum(1,1,1);
        boolean res2 = checker.hasEqualSum(1,1,2);
        boolean res3 = checker.hasEqualSum(1,-1,0);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
