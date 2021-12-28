package com.vincent;

public class BinarySearchImpl {


     void BinarySearch(double[] arr, double target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = end - (end - start)/2;

            if (arr[mid] == target){
                System.out.println("Stock of value " + target + " is present");
                return;
            }

            if (arr[mid] > target){
                end = mid -1;
            }

            if (arr[mid] < target){
                start = mid  + 1;
            }
        }
        System.out.println("Value not found");
    }
}
