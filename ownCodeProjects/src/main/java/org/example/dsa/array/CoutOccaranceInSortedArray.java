package org.example.dsa.array;

public class CoutOccaranceInSortedArray {

    public static int countOccarance(int [] arr, int target){
        int firstCount = firstCoutnOccarance(arr, target);
        if (firstCount == -1){
            return 0;
        }
        int lastCount = lastCountOccarance(arr, target);

        return firstCount + lastCount - 1;
    }

    private static int firstCoutnOccarance(int[] arr, int target){
        int ans = -1, left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if ( arr[mid] == target){
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    private static int lastCountOccarance(int[] arr, int target){
        int ans = -1, left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if ( arr[mid] == target){
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int [] findFirstAndLastInsertion(int [] arr, int target){
        int firstElement = firstInsertion(arr, target);
        int lastElement = lastInsertion(arr, target);
        return new int[] {firstElement, lastElement};
    }
    private static int firstInsertion(int[] arr, int target){
        int ans = -1, left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if ( arr[mid] == target){
                ans = mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    private static int lastInsertion(int[] arr, int target){
        int ans = -1, left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if ( arr[mid] == target){
                ans = mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
