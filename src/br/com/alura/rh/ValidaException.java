package br.com.alura.rh;

public class ValidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidaException(String mensagem) {
		super(mensagem);
	}

}
