package com.github.jhugosc.FinTrack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Movimentacao movimentacao;

    public Transacao() {
    }

    public Transacao(Long id, String nome, String descricao, Movimentacao movimentacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.movimentacao = movimentacao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Movimentacao getmovimentacao() {
        return movimentacao;
    }

    public void setmovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
