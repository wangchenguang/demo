package com.wangchg.example.person.dao;

import com.wangchg.example.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
