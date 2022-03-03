package com.spring.basics1.springin5steps;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.basics1.springin5steps.basic.BinarySearch;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5stepsBasicApplication.class)
public class BinarySearchTest {
	@Autowired
	BinarySearch binarySearch;
	
	@Test
	public void test() {
		assertEquals(1, binarySearch.search(new int[] {}, 0));
	}

}
