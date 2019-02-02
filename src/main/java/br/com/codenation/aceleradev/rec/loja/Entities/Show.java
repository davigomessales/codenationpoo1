package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;

public class Show {
    private Long id;
    private String descricao;
    private BigDecimal preco;
    private Integer qtdEstoque;
    private Integer categoria;
    private String artista;
    private Integer numeroMusicas;

    public Show(Long id, String descricao, BigDecimal preco, Integer qtdEstoque, Integer categoria, String artista, Integer numeroMusicas) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
        this.artista = artista;
        this.numeroMusicas = numeroMusicas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(Integer numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
}
