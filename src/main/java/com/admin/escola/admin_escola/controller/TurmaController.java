package com.admin.escola.admin_escola.controller;

import com.admin.escola.admin_escola.domain.turma.Turma;
import com.admin.escola.admin_escola.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> getAllTurmas() {
        return turmaService.getAllTurmas();
    }

    @GetMapping("/{id}")
    public Optional<Turma> getTurmaById(@PathVariable Long id) {
        return turmaService.getTurmaById(id);
    }

    @PostMapping
    public Turma createTurma(@RequestBody Turma turma) {
        return turmaService.saveTurma(turma);
    }

    @PutMapping("/{id}")
    public Turma updateTurma(@PathVariable Long id, @RequestBody Turma turma) {
        turma.setId(id);
        return turmaService.saveTurma(turma);
    }

    @DeleteMapping("/{id}")
    public void deleteTurma(@PathVariable Long id) {
        turmaService.deleteTurma(id);
    }
}
