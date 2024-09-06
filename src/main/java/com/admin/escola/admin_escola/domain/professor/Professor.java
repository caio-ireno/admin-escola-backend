package com.admin.escola.admin_escola.domain.professor;


import jakarta.persistence.*;

@Entity
@Table(name = "professores")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private int idade;

    private String materia;

    private String observacao;

    // Construtores, getters e setters

    public Professor() {}

    public Professor(Long id, String nome, int idade, String materia, String observacao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.materia = materia;
        this.observacao = observacao;
    }

    public static Professor newProfessor(final String nome, final int idade, final String materia, final String observacao) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        return new Professor(null, nome, idade, materia, observacao);
    }

    public static Professor with(final Long id, final String nome, final int idade, final String materia, final String observacao) {
        return new Professor(id, nome, idade, materia, observacao);
    }

    public Professor update(final String nome, final int idade, final String materia, final String observacao) {
        this.nome = nome;
        this.idade = idade;
        this.materia = materia;
        this.observacao = observacao;
        return this;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
