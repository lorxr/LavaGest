package br.com.lavagest.modelo.entidade;

import java.io.Serializable;

public class Administrador extends Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Administrador() {
		
	}
	
	public Administrador (Long id, String nome, String sobrenome, String telefone, String cpf, String senha) {
		super(id, nome, sobrenome, telefone, cpf, senha);
	}

}
