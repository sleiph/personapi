package br.dio.personapi.repositories;

import br.dio.personapi.entities.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
