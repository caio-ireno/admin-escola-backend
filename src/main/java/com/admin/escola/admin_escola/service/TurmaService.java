package com.admin.escola.admin_escola.service;

import com.admin.escola.admin_escola.domain.turma.Turma;
import com.admin.escola.admin_escola.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public Optional<Turma> getTurmaById(Long id) {
        return turmaRepository.findById(id);
    }

    public Turma saveTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    public void deleteTurma(Long id) {
        turmaRepository.deleteById(id);
    }
}
