package section_4.barking_dog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 8 && hourOfDay >= 0 && barking){
            return true;
        }else if (hourOfDay == 23 && barking){
            return true;
        }else{
            return false;
        }
    }
}
