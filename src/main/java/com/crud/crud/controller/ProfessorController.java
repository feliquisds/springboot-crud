package com.crud.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.crud.model.Professor;
import com.crud.crud.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public Professor save(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

    @GetMapping
    public Iterable<Professor> findAll() {
        return professorService.findAll();
    }
}
