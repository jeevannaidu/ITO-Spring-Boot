package com.spring.basics1.springin5steps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class SomeExternalService {
    @Value("${external.service.url}")
    private String url;

    public String returnServiceValue(){
        return url;
    }
}
