package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;

public class Filme extends Produto {
    
    private String diretor;
    private String anoLancamento;

    public Filme(Long id, String descricao, BigDecimal preco, Integer qtdEstoque, Integer categoria, String diretor, String anoLancamento) {
        super(id, anoLancamento, preco, categoria, categoria);
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
