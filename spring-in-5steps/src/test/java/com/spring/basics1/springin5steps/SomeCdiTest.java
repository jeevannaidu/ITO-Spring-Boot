package com.spring.basics1.springin5steps;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.spring.basics1.springin5steps.cdi.SomeCdiBusiness;
import com.spring.basics1.springin5steps.cdi.SomeCdiDao;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiTest {
	
	@Mock
	SomeCdiDao daoMock;
	
	@InjectMocks
	SomeCdiBusiness  someCdi;
	
	@Test
	public void test1() {
		//when daoMock.get() method is called return int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int []{});
		assertEquals(Integer.MIN_VALUE, someCdi.findGreatest());
	}
	
	@Test
	public void test2() {
		//when daoMock.get() method is called return int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int []{2,4});
		assertEquals(4, someCdi.findGreatest());
	}
}
