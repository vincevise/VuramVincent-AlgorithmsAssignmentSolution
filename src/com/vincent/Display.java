package com.vincent;

public class Display {
    void DisplayRise(double[] arr, boolean[] compare){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (compare[i]){
                count++;
            }

        }

        System.out.println("Total no of companies whose stock price rose today : " + count);

    }

     void DisplayDown(double[] arr, boolean[] compare){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (compare[i]==false){

                count++;
            }

        }

         System.out.println("Total no of companies whose stock price declined today : " + count);

    }



}
