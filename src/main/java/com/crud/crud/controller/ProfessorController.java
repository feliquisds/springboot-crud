package com.crud.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.crud.model.Aluno;
import com.crud.crud.model.Professor;
import com.crud.crud.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private final ProfessorService professorService;


    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping("/save")
    public Professor save(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

     @PostMapping("/update/{id}")
    public Professor update(@PathVariable long id, @RequestBody Professor a) {
        a.setID(id);
        Professor novo_professor = professorService.save(a);
        return novo_professor;
    }

    @GetMapping("/findAll")
    public Iterable<Professor> findAll() {
        return professorService.findAll();
    }
}
