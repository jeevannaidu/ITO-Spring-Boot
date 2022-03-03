package com.spring.basics1.springin5steps.basic;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] nums) {
        return nums;
    }
}
