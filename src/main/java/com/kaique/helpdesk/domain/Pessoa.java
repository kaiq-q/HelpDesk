package com.kaique.helpdesk.domain;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaique.helpdesk.domain.enums.Perfil;

@Entity
public abstract class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nome;
	
	@Column(unique = true)
	protected String CPF;
	
	@Column(unique = true)
	protected String email;
	protected String senha;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "Perfis")
	protected Set<Integer> perfis = new HashSet<>();
	
	@JsonFormat(pattern = "dd/MM/yyy")
	LocalDate dataCriacao = LocalDate.now();

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
		addPerfil(Perfil.CLIENTE);
		
		
	}

	
	public Pessoa(int id, String nome, String cPF, String email, String senha, LocalDate dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.CPF = cPF;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = dataCriacao;
		
		addPerfil(Perfil.CLIENTE);
		
	}


	
	

	public Set<Perfil> getPerfis() {
		return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}


	public void addPerfil(Perfil perfil) {
		//this.perfis.add(perfis.getCodigo()); -- Não poderia passar uma lista mas sim um unico perfil. 
		this.perfis.add(perfil.getCodigo());
		
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