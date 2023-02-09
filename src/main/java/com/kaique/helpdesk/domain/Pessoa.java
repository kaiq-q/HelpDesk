package com.kaique.helpdesk.domain;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import com.kaique.helpdesk.domain.enums.Perfil;

public abstract class Pessoa {

	protected int id;
	protected String nome;
	protected String CPF;
	protected String email;
	protected String senha;
	
	protected Set<Integer> perfis = new HashSet<>();
	
	LocalDate dataCriacao = LocalDate.now();

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Pessoa(int id, String nome, String cPF, String email, String senha, LocalDate dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.CPF = cPF;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = dataCriacao;
	}


	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
		
	
	
	
	
}