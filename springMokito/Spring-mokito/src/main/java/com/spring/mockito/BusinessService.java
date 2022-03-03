package com.spring.mockito;

public class BusinessService {
	
	public DataService1 dataService;

	public BusinessService(DataService1 dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findTheGreatestAmongAll() {
		
		int[] retrieve = dataService.retreiveAllData();
		int greatest = Integer.MIN_VALUE;
		for(int i : retrieve) {
			if(i>greatest)
				greatest = i;
		}
		return greatest;
	}

}
