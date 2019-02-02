package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;

public abstract class Produto {
	
	private Long id;
    private String descricao;
    private BigDecimal preco;
    private Integer qtdEstoque;
    private Integer categoria;
    
	public Produto(Long id, String descricao, BigDecimal preco, Integer qtdEstoque, Integer categoria) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
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
    
    
}
