package section_5.all_factors;

public class AllFactors {
    public static void printFactors (int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }
}
