package section_8.minimum_element;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MinimumElement min = new MinimumElement();
        int number = min.readInteger();
        int []numbers = min.readElements(number);
        System.out.println(min.findMin(numbers));
    }
}
