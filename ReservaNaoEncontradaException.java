package br.com.smartweb.airlines;

public class ReservaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ReservaNaoEncontradaException() {
    }

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }

}