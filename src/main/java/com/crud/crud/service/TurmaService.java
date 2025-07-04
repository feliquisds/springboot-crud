package com.crud.crud.service;

import com.crud.crud.model.Turma;
import com.crud.crud.repository.TurmaRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

    private final TurmaRepository turmaRepository;

    @Autowired
    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public Turma save(Turma turma) {
        return turmaRepository.save(turma);
    }

    public Iterable<Turma> findAll() {
        return turmaRepository.findAll();
    }

    public Optional<Turma> findById(long id) {
        return turmaRepository.findById(id);
    }

    public void deleteById(long id) {
        turmaRepository.deleteById(id);
    }

    
}
