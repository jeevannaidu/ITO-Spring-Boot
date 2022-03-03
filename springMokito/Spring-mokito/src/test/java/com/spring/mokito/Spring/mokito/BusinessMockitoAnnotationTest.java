package com.spring.mokito.Spring.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import com.spring.mockito.BusinessService;
import com.spring.mockito.DataService1;

@RunWith(MockitoJUnitRunner.class)
public class BusinessMockitoAnnotationTest {
	
	@Mock
	DataService1 mockDataService;
	
	@InjectMocks
	BusinessService service;
	
	@Test
	void testFindTheGreatestAmongAll() {
		when(mockDataService.retreiveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(1, service.findTheGreatestAmongAll());
	}

}
