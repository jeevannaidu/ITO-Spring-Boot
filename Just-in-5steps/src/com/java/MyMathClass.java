package com.java;

public class MyMathClass {
	
    public int sum(int[] nums){
        int sum=0;
        for(int i:nums){
            sum= sum+i;
        }
        return sum;
    }
}
