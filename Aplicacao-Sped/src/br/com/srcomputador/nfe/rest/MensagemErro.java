package br.com.srcomputador.nfe.rest;

public class MensagemErro {

	private String mensagem;

	public MensagemErro() {
	}

	public MensagemErro(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
