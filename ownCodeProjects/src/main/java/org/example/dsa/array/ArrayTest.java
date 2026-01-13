package org.example.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

    public static boolean linearSearch(int [] arr, int key){
        for (int j : arr) {
            if (key == j) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int [] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while ( low <= high ){
            int mid = ( low + high ) / 2;
            if (arr[mid] == key){
                return true;
            }
            if(arr[mid] < high){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static int sumOfArrayElements(int[] arr){
        int sum = 0;
        for (int i = 0; i <= arr.length; i++){
            sum += i;
        }
        return sum;
    }

    public static void JavaCollectionDemo(){

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++){
            list.add(i);
        }

        System.out.println(list);

        list.remove(4);

        System.out.println(list);

        for(int  i : list){
            System.out.print(i + " ");
        }
    }
}

class driverClas{

    public static void main(String[] args) {

        ArrayTest.JavaCollectionDemo();

    }
    
}
