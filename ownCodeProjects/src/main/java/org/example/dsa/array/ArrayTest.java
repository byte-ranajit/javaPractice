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
	
	public static int searchInsertion(int [] arr, int key){
		int low = 0;
		int high = arr.length - 1;
		while ( low <= high ){
		int mid = low + (high - low) / 2;
		if ( arr[mid] == key) {
			return mid;
		}
		
		if ( arr[mid] < key){
			low = mid + 1;
		} else {
			high = mid - 1;
		}
		}
		
		return low;
	}

    public static int binarySearchUsingRecurrsion(int arr[], int low , int high , int key){

        if ( low > high){
            return -1;
        }
        int mid = low + (high - low )/ 2;
        if ( arr[mid] == key){
            return mid;
        }

        if (arr[mid] < key){
            return binarySearchUsingRecurrsion(arr, mid + 1, high, key);
        }
        return binarySearchUsingRecurrsion(arr, low, mid - 1, key);
    }
}

class driverClas{

    public static void main(String[] args) {

	int [] arr = {12,20,30,40,50,60,70,80,90,100};
    int low = 0;
    int high = arr.length - 1;
    int target = 90;
    int foundNumber = ArrayTest.binarySearchUsingRecurrsion(arr, low, high, target);
    int searchIndext = ArrayTest.searchInsertion(arr, target);
        System.out.println(foundNumber);
        System.out.println(searchIndext);
    }
    
}
