package com.mjuapps.actividemo.repository;

import com.mjuapps.actividemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author marek_j on 03.07.2018
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String name);

}
