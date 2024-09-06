package com.admin.escola.admin_escola.domain.aluno;


import com.admin.escola.admin_escola.domain.turma.Turma;
import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma;

    @Column(name = "data_nascimento")
    private String dataNascimento;

    @Column(name = "nota_primeiro_semestre")
    private double notaPrimeiroSemestre;

    @Column(name = "nota_segundo_semestre")
    private double notaSegundoSemestre;

    @Transient
    private double mediaFinal;

    // Construtores, getters e setters

    public Aluno() {}

    public Aluno(Long id, String nome, int idade, Turma turma, String dataNascimento, double notaPrimeiroSemestre, double notaSegundoSemestre) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.dataNascimento = dataNascimento;
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
        this.notaSegundoSemestre = notaSegundoSemestre;
        this.mediaFinal = (notaPrimeiroSemestre + notaSegundoSemestre) / 2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(double notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public double getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(double notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }
}
