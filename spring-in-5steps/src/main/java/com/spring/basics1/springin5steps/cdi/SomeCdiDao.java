package com.spring.basics1.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {
	
	public int[] getData() {
		return new int[] {2,4,6,8};
	}
	
}
