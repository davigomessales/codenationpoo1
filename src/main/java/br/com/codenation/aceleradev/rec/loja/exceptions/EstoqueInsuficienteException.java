package br.com.codenation.aceleradev.rec.loja.exceptions;

public class EstoqueInsuficienteException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EstoqueInsuficienteException(String msg){
        super(msg);
    }
	
	public EstoqueInsuficienteException(String msg, Throwable cause){
        super(msg, cause);
    }

}
