package com.spring.mokito.Spring.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.spring.mockito.BusinessService;
import com.spring.mockito.DataService1;

public class BusinessStubTest {
	
	@Test
	void test() {
		BusinessService businessService = new BusinessService(new DataServiceStub());
		int result = businessService.findTheGreatestAmongAll();
		assertEquals(8, result);		
	}
}

class DataServiceStub implements DataService1{

	@Override
	public int[] retreiveAllData() {
		return new int[] {2,4,6,8};
	}
	
}
