package br.com.lavagest.modelo.entidade;

import java.io.Serializable;

public abstract class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String cpf;
	private String senha;

	public Usuario() {
	}

	public Usuario (Long id) {
		setId(id);
	}
	
	public Usuario (String nome, String sobrenome, String telefone, String cpf, String senha) {
		setNome(nome);
		setSobrenome(sobrenome);
		setTelefone(telefone);
		setCpf(cpf);
		setSenha(senha);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
