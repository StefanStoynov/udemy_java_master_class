package section_4.teen_number_checker;

public class TeenNumberChecker {
    public static boolean hasTeen (int years_param_one, int years_param_two, int years_param_tree){
        int [] years = {years_param_one, years_param_two, years_param_tree};

        for (int year : years) {
            if (year >= 13 && year <= 19){
                return true;
            }
        }
        return false;
    }
    public static boolean isTeen (int years){
        if (years >= 13 && years <= 19){
            return true;
        }
        return false;
    }
}
