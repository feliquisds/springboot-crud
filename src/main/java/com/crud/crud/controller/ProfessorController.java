package com.crud.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.crud.model.Professor;
import com.crud.crud.service.ProfessorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Professor Controller")
@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private final ProfessorService professorService;


    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @Operation(summary = "Salva um professor no banco de dados")
    @PostMapping("/save")
    public Professor save(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

    @Operation(summary = "Atualiza um professor no banco de dados")
    @PostMapping("/update/{id}")
    public Professor update(@PathVariable long id, @RequestBody Professor a) {
        a.setID(id);
        Professor novo_professor = professorService.save(a);
        return novo_professor;
    }

    @Operation(summary = "Lista todos os professores do banco de dados")
    @GetMapping("/findAll")
    public Iterable<Professor> findAll() {
        return professorService.findAll();
    }

    @Operation(summary = "Encontra um professor no banco de dados")
    @GetMapping("/find/{id}")
    public Optional<Professor> findById(@PathVariable long id) {
        return professorService.findById(id);
    }

    @Operation(summary = "Apaga um professor do banco de dados")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        professorService.deleteById(id);
    }
}
