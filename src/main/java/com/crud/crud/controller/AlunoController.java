package com.crud.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.model.Aluno;
import com.crud.crud.service.AlunoService;

@RestController
public class AlunoController {

    @Autowired
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/aluno/save")
    public Aluno save(@RequestBody Aluno a) {
        Aluno novo_aluno = alunoService.save(a);
        return novo_aluno;
    }

    @GetMapping("/aluno/findAll")
    public List<Aluno> findAll() {
        return (List<Aluno>) alunoService.findAll();
    }
}
