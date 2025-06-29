package com.crud.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.model.Aluno;
import com.crud.crud.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/save")
    public Aluno save(@RequestBody Aluno a) {
        Aluno novo_aluno = alunoService.save(a);
        return novo_aluno;
    }

    @GetMapping("/findAll")
    public List<Aluno> findAll() {
        return (List<Aluno>) alunoService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        alunoService.deleteById(id);
    }
}
