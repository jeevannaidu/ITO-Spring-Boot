package com.unit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.java.MyMathClass;

class MyMathTest {
	MyMathClass my = new MyMathClass();
	
	@Test
	public void sumWith3Number() {
		assertEquals(6,my.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sumWith1Number() {
		assertEquals(1,my.sum(new int[] {1}));
	}
}
