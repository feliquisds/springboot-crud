package com.crud.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.crud.model.Professor;

@Repository

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
