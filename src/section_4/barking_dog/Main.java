package section_4.barking_dog;

public class Main {
    public static void main(String[] args) {
        BarkingDog barkingDog = new BarkingDog();
        System.out.println(barkingDog.shouldWakeUp(true, 1));
        System.out.println(barkingDog.shouldWakeUp(false, 6));
        System.out.println(barkingDog.shouldWakeUp(true, 8));
        System.out.println(barkingDog.shouldWakeUp(true, -1));
    }
}
