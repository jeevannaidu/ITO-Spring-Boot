package com.example.springjdbc.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.springjdbc.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findByid(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public  Person update(Person person) {
		return entityManager.merge(person);
	}
	

	public void deleteById(int id){
		Person person = findByid(id);
		entityManager.remove(person);
	}
}
