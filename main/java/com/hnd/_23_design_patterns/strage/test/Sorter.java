package com.hnd._23_design_patterns.strage.test;

import java.util.Arrays;

public class Sorter <T> {

    public void sort(Comparble[] compartors){
        for(int i = 0;i<compartors.length;i++){
            for(int j = 0 ; j<compartors.length-i-1;j++){
                if(compartors[j].compareTo(compartors[j+1])==1){
                    swap(compartors,j,j+1);
                }
            }

        }
        System.out.println(Arrays.toString(compartors));

    }
    public void swap(Comparble[] compartors, int i , int j){
        Comparble temp = compartors[j] ;
        compartors[j] =compartors[i];
        compartors[i] = temp;
    }

}
