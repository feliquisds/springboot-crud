package com.crud.crud.repository;

import org.springframework.data.repository.CrudRepository;
import com.crud.crud.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
