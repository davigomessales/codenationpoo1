package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Carrinho {
    private Long usuarioId;
    private BigDecimal valorTotal;
    private Integer qtdTotal;
    private Timestamp dtHora;

    public Carrinho(Long usuarioId, BigDecimal valorTotal, Integer qtdTotal, Timestamp dtHora) {
        this.usuarioId = usuarioId;
        this.valorTotal = valorTotal;
        this.qtdTotal = qtdTotal;
        this.dtHora = dtHora;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(Integer qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public Timestamp getDtHora() {
        return dtHora;
    }

    public void setDtHora(Timestamp dtHora) {
        this.dtHora = dtHora;
    }
}
