package section_8.sorted_array;

import java.util.Scanner;

public class SortedArray {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayLength = input.nextInt();
        int[] inputArray = getIntegers(arrayLength);
        int[] sortedArray = sortIntegers(inputArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int arrayLength) {
        int[] result = new int[arrayLength];
        System.out.println("Enter "+ arrayLength + " integers values:\r");
        for (int i = 0; i < arrayLength; i++) {
            result[i] = input.nextInt();
        }

        return result;
    }

    public static int[] sortIntegers(int array[]) {
        int[] sortedArray = new int[array.length];
    
        for (int i = 0; i < array.length; i++) {
            sortedArray [i] = array [i];
        }

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;

            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+ i + " contents " + array[i]);
        }
    }
}
