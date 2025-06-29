package com.crud.crud.controller;

import java.util.List;
import java.util.Optional;

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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Aluno Controller")
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @Operation(summary = "Salva um aluno no banco de dados")
    @PostMapping("/save")
    public Aluno save(@RequestBody Aluno a) {
        Aluno novo_aluno = alunoService.save(a);
        return novo_aluno;
    }
    
    @Operation(summary = "Atualiza um aluno no banco de dados")
    @PostMapping("/update/{id}")
    public Aluno update(@PathVariable long id, @RequestBody Aluno a) {
        a.setID(id);
        Aluno novo_aluno = alunoService.save(a);
        return novo_aluno;
    }
    
    @Operation(summary = "Lista todos os alunos do banco de dados")
    @GetMapping("/findAll")
    public List<Aluno> findAll() {
        return (List<Aluno>) alunoService.findAll();
    }
    
    @Operation(summary = "Encontra um aluno no banco de dados")
    @GetMapping("/find/{id}")
    public Optional<Aluno> findById(@PathVariable long id) {
        return alunoService.findById(id);
    }
    
    @Operation(summary = "Apaga um aluno do banco de dados")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        alunoService.deleteById(id);
    }
}
