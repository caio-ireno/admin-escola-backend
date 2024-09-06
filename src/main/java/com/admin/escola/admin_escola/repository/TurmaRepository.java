package com.admin.escola.admin_escola.repository;


import com.admin.escola.admin_escola.domain.turma.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
