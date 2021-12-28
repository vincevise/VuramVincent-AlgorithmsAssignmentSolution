package com.vincent;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of companies");
        int NO_OF_COMPANIES = scan.nextInt();
        // creating an array of stock prices
        double[] arr = new double[NO_OF_COMPANIES];
        // creating an array of boolean value so that it can take input from users whether the price increased or decreased.
        boolean[] compare = new boolean[NO_OF_COMPANIES];

        for (int i = 0; i < NO_OF_COMPANIES; i++) {

            System.out.println("enter the stock price of the company " + (i+1));
            arr[i] = scan.nextDouble();
            System.out.println("Whether company's stock price rose today compare to yesterday? (true/false)");
            compare[i] = scan.nextBoolean();

        }
        int choice;
        do {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Enter the operation that you want to perform");
            System.out.println("1. Display the companies stock prices in ascending order");
            System.out.println("2. Display the companies stock prices in descending order");
            System.out.println("3. Display the total no. of companies for which stock price rose today");
            System.out.println("4. Display the total no. of companies for which stock prices declined today");
            System.out.println("5. Search a specific stock price");
            System.out.println("0. to Exit");
            System.out.println("-------------------------------------------------------------------------------");

            // accessing the display class for preforming 3 and 4 operation
            Display display = new Display();
            MergeSortImpl mergeSort = new MergeSortImpl();

            choice = scan.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Stock prices in ascending order are :");
                    mergeSort.mergeSort(arr,0,arr.length-1);
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                }

                case 2:{
                    System.out.println("Stock prices in descending order are :");
                    mergeSort.mergeSort(arr,0,arr.length-1);
                    for (int j = arr.length - 1; j >= 0; j--) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    break;
                }

                case 3:{
                    display.DisplayRise(arr,compare);
                    break;
                }

                case 4:{
                    display.DisplayDown(arr,compare);
                    break;
                }

                case 5:{
                    // Binary Search implementation to search an element in the prices array
                    System.out.println("enter the key value");
                    BinarySearchImpl binarySearch = new BinarySearchImpl();
                    double stockPrice = scan.nextDouble();
                    binarySearch.BinarySearch(arr,stockPrice);
                    break;

                }

                case 0:{
                    System.out.println("Exited successfully");
                    return;
                }

                default:{
                    System.out.println("Enter the correct number between 0-6");
                }
            }

        }
        while(choice !=0);
        System.out.println("Exited successfully");
    }
}
