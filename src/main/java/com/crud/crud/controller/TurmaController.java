package com.crud.crud.controller;

import com.crud.crud.model.Turma;
import com.crud.crud.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/turma")
public class TurmaController {
    // ... injeção de TurmaService

    @PostMapping("/save")
    public Turma save(@RequestBody Turma turma) {
        return turmaService.save(turma);
    }

    @GetMapping("/findAll")
    public List<Turma> findAll() {
        return (List<Turma>) turmaService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        turmaService.deleteById(id);
    }
}
