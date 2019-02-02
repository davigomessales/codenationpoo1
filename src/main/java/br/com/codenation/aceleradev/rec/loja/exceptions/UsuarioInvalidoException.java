package br.com.codenation.aceleradev.rec.loja.exceptions;

public class UsuarioInvalidoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioInvalidoException(String msg){
        super(msg);
    }

    public UsuarioInvalidoException(String msg, Throwable cause){
        super(msg, cause);
    }

}
