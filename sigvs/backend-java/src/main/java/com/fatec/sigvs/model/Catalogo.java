package com.fatec.sigvs.model;

public class Catalogo {
    private Long id;
    private String descricao;
    private String categoria;
    private double custo;
    private int quantidadeNoEstoque;
    private byte[] imagem;


    public Catalogo(Long id, String descricao, String categoria, double custo, int quantidadeNoEstoque, byte[] imagem) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.custo = custo;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
        this.imagem = imagem;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getQuantidadeNoEstoque() {
        return this.quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public byte[] getImagem() {
        return this.imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

}
