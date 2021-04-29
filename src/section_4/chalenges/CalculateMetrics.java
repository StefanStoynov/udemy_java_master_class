package section_4.chalenges;

public class CalculateMetrics {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,13));
        System.out.println(calcFeetAndInchesToCentimeters(-157));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        double featsToCm = feet * 30.48;
        double inchesToCm = inches * 2.54;

        return featsToCm + inchesToCm;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }

        int feet = (int)inches / 12;
        int remainingInches = (int)inches % 12;

       return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
