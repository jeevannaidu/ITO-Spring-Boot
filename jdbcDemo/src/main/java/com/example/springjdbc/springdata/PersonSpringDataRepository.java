package com.example.springjdbc.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjdbc.entity.Person;

public interface PersonSpringDataRepository extends
JpaRepository<Person, Integer>{

}
