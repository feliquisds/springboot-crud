package com.crud.crud.controller;
import java.util.Optional;
import com.crud.crud.model.Turma;
import com.crud.crud.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/turma")
public class TurmaController {
    

    @Autowired
    private final TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @PostMapping("/save")
    public Turma save(@RequestBody Turma turma) {
        return turmaService.save(turma);
    }

    @PostMapping("/update/{id}")
    public Turma update(@PathVariable long id, @RequestBody Turma a) {
        a.setID(id);
        Turma nova_turma = turmaService.save(a);
        return nova_turma;
    }

    @GetMapping("/findAll")
    public List<Turma> findAll() {
        return (List<Turma>) turmaService.findAll();
    }

    @GetMapping("/find/{id}")
    public Optional<Turma> findById(@PathVariable long id) {
        return turmaService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        turmaService.deleteById(id);
    }
}
