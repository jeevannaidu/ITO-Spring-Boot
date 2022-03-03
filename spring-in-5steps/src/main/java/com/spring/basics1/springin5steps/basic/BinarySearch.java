package com.spring.basics1.springin5steps.basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class BinarySearch {
//    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SortAlgorithm bubbleSort;

    public int search(int[] nums,int num){
        int[] result = bubbleSort.sort(nums);
        return 1;
    }

//    @PostConstruct
//    public void  postConstruct(){
//        LOGGER.info("PostConstruct");
//    }
//
//    @PreDestroy
//    public void  preDestroy(){
//        LOGGER.info("PreDestroy");
//    }
}
