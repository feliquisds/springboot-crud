package com.crud.crud.controller;
import java.util.Optional;
import com.crud.crud.model.Turma;
import com.crud.crud.service.TurmaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Turma Controller")
@RestController
@RequestMapping("/turma")
public class TurmaController {
    

    @Autowired
    private final TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @Operation(summary = "Salva uma turma no banco de dados")
    @PostMapping("/save")
    public Turma save(@RequestBody Turma turma) {
        return turmaService.save(turma);
    }

    @Operation(summary = "Atualiza uma turma no banco de dados")
    @PostMapping("/update/{id}")
    public Turma update(@PathVariable long id, @RequestBody Turma a) {
        a.setID(id);
        Turma nova_turma = turmaService.save(a);
        return nova_turma;
    }

    @Operation(summary = "Lista todas as turmas do banco de dados")
    @GetMapping("/findAll")
    public List<Turma> findAll() {
        return (List<Turma>) turmaService.findAll();
    }

    @Operation(summary = "Encontra uma turma no banco de dados")
    @GetMapping("/find/{id}")
    public Optional<Turma> findById(@PathVariable long id) {
        return turmaService.findById(id);
    }

    @Operation(summary = "Apaga uma turma do banco de dados")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        turmaService.deleteById(id);
    }
}
