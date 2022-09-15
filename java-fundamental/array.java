package java_array;

import java.util.Arrays;

class ArrayBasics{
    public static void main(String[] args){
        int[] arr;
        int arr1[]; 
        arr = new int[10];
        arr1 = new int[]{1,2,3,4, Integer.MIN_VALUE};
        String[] str = {"one", "two", "three"};
        System.out.println(str[2]);
        System.out.println("Int array: " + Arrays.toString(arr1));
    }
}