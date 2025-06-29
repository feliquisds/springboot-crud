package com.crud.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.repository.AlunoRepository;
import com.crud.crud.model.Aluno;

@Service
public class AlunoService {
    @Autowired
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Iterable<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(long id) {
        return alunoRepository.findById(id);
    }

    public void deleteById(long id) {
        alunoRepository.deleteById(id);
    }
}
