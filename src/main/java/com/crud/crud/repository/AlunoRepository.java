package com.crud.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.crud.model.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    
}
