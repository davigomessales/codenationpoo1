package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;

public class Show extends Produto{
    
    private String artista;
    private Integer numeroMusicas;

    public Show(Long id, String descricao, BigDecimal preco, Integer qtdEstoque, String categoria, String artista, Integer numeroMusicas) {
        super(id, artista, preco, qtdEstoque, categoria);
        this.artista = artista;
        this.numeroMusicas = numeroMusicas;
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
