package section_8.reverse_array;

import java.util.Arrays;

public class ReverseArray {
//    public static void main(String[] args) {
//        int[]arr = new int[]{1,2,3,4,5};
//        reverse(arr);
//    }
    private static void reverse(int[] array) {
        System.out.print("Array = " +Arrays.toString(array));
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[array.length -1 -i];
                array[array.length -1 -i] = temp;
        }

        System.out.println("Reversed array = "+ Arrays.toString(array));
    }

}


