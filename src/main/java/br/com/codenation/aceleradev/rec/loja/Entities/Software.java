package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;

public class Software {
	
	private Long id;
	private String descricao;
	private BigDecimal preco;
	private Integer qtdEstoque;
	private String categoria;
	private String versao;
	private String requisitosSitema;
		
	public Software(Long id, String descricao, BigDecimal preco, Integer qtdEstoque, String categoria, String versao,
			String requisitosSitema) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
		this.versao = versao;
		this.requisitosSitema = requisitosSitema;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getRequisitosSitema() {
		return requisitosSitema;
	}
	public void setRequisitosSitema(String requisitosSitema) {
		this.requisitosSitema = requisitosSitema;
	}
}
