package section_4.chalenges;

public class SecondsAndMinutes {
    public static void main(String[] args) {
       String result =  getDurationString(65,45);
        System.out.println(result);
        String result1 =  getDurationString(3661);
        System.out.println(result1);
    }
    private static String getDurationString(int minutes, int seconds){
        //validation
        if ( minutes < 0 && seconds <0 || seconds > 59){
            return "Invalid value";
        }

        // calculation
        int hours = minutes/60;
        int minutesLeft = minutes % 60;

         // return result
        return hours + "h " + minutesLeft + "m " + seconds + "s";
    }

    private static String getDurationString( int seconds){
        // validation
        if (seconds < 0){
            return "Invalid value";
        }

       // calculation
        int minutes = seconds / 60;
        int secondsLeft = seconds % 60;

        // return result using method overloading.
        return getDurationString( minutes, secondsLeft);

    }
}
