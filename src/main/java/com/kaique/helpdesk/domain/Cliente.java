package com.kaique.helpdesk.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import com.kaique.helpdesk.domain.enums.Perfil;

@Entity
public class Cliente extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();

	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome, String cPF, String email, String senha, LocalDate dataCriacao) {
		super(id, nome, cPF, email, senha, dataCriacao);
		addPerfil(Perfil.CLIENTE);
		// TODO Auto-generated constructor stub
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
	
	
	
}
