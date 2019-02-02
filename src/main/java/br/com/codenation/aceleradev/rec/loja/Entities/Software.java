package br.com.codenation.aceleradev.rec.loja.Entities;

import java.math.BigDecimal;

public class Software extends Produto {
	
	private String versao;
	private String requisitosSitema;
		
	public Software(Long id, String descricao, BigDecimal preco, Integer qtdEstoque, String categoria, String versao,
			String requisitosSitema) {
		super(id, requisitosSitema, preco, qtdEstoque, qtdEstoque);
		this.versao = versao;
		this.requisitosSitema = requisitosSitema;
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
