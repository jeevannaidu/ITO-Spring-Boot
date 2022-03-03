package com.spring.basics1.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] nums) {
        System.out.println("Bubble Sort");
        return nums;
    }
}
