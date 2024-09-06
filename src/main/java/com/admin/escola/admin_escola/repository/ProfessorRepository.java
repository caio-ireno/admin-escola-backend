package com.admin.escola.admin_escola.repository;


import com.admin.escola.admin_escola.domain.professor.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findByNomeContaining(String nome);
}

