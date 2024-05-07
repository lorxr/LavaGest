package br.com.lavagest.modelo.entidade;

import java.io.Serializable;

public class Cliente extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Automovel automovel;

	public Cliente() {

	}

	public Cliente(Long id, String nome, String sobrenome, String telefone, String cpf, String senha) {
		super(id, nome, sobrenome, telefone, cpf, senha);
		setAutomovel(automovel);
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

}
