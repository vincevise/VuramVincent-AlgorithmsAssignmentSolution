package com.greatlearning.Display;

public class Display {
    public void DisplayRise(double[] arr, boolean[] compare){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (compare[i]){
                count++;
            }

        }

        System.out.println("Total no of companies whose stock price rose today : " + count);

    }

     public void DisplayDown(double[] arr, boolean[] compare){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (compare[i]==false){

                count++;
            }

        }

         System.out.println("Total no of companies whose stock price declined today : " + count);

    }



}
