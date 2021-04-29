package section_4.equality_printer;

public class EqualityPrinter {
    public static void printEqual(int param_one, int param_two, int param_tree){
        if (param_one < 0 || param_two < 0 || param_tree < 0){
            System.out.println("Invalid Value");
            return;
        }

        int [] numbers = {param_one, param_two, param_tree};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]){
                    result ++;
                }

            }
        }

        switch (result){
            case 0:
                System.out.println("All numbers are different");
                break;
            case 1:
                System.out.println("Neither all are equal or different");
                break;
            case 3:
                System.out.println("All numbers are equal");
                break;
        }
    }
}
