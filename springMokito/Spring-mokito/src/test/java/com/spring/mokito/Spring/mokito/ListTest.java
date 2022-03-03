package com.spring.mokito.Spring.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	
	@Test
	void test_multipleReturns() {
		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("Something");
		assertEquals("SomeString", list.get(2));
		
	}

}
