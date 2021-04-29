package section_8.minimum_element;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int findMin(int[]array){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]){
                minValue = array[i];
            }
        }
        return minValue;
    }
//count
    public static int[] readElements(int elementsNumber){
        int[] array = new int[elementsNumber];
        for (int i = 0; i < elementsNumber; i++) {
            int inputNumber = scanner.nextInt();
            scanner.nextLine();
            array[i] = inputNumber;
        }
        return array;
    }

    public static int readInteger(){
        System.out.println("Please enter a positive number\r");
        int number = scanner.nextInt();
        return number;
    }
}

