package com.crud.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.repository.ProfessorRepository;
import com.crud.crud.model.Professor;

@Service
public class ProfessorService {

    @Autowired
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public Iterable<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(long id) {
        return professorRepository.findById(id);
    }

      public void deleteById(long id) {
        professorRepository.deleteById(id);
    }
}
