package java_array;

import java.util.Arrays;

class ArrayBasics1{
    public static void main(String[] args){
        int arr1[]; 
        arr1 = new int[]{1,2,3,4, Integer.MIN_VALUE};
        //Copy array
        int[] arr1_copy = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Int array: " + Arrays.toString(arr1_copy));

        // Copy range of array
        // copyOfRange(ref, position, positionOfEndElements)
        int[] arr1_rangeCopy = Arrays.copyOfRange(arr1, 1, 5);
        System.out.println("Int array: " + Arrays.toString(arr1_rangeCopy));
    }
}