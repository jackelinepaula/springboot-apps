package com.fatec.sigvs.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Imagem {
    @Id
    private Long id;
    private String nome;
    private String caminho;

    @Column(name = "arquivo", length = 28672)
    private byte[] arquivo;

    // Construtor default - Não esquecer esse krl
    public Imagem() {
    }

    public Imagem(Long id, String nome, String caminho, byte[] arquivo) {
        this.id = id;
        this.nome = nome;
        this.caminho = caminho;
        this.arquivo = arquivo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public byte[] getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }

}
