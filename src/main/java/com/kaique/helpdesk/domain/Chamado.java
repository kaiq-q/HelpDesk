package com.kaique.helpdesk.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaique.helpdesk.domain.enums.Prioridade;
import com.kaique.helpdesk.domain.enums.Status;


@Entity
public class Chamado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura; 
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	
	private Prioridade prioridade;	
	private Status status;
	private String titulo;
	
	@ManyToOne
	@JoinColumn(name = "tecnico_id")
	private Tecnico tecnico;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
	
	public Chamado() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Chamado(int id, Prioridade prioridade, Status status, String titulo, Tecnico tecnico, Cliente cliente) {
		super();
		this.id = id;
		this.prioridade = prioridade;
		this.status = status;
		this.titulo = titulo;
		this.tecnico = tecnico;
		this.cliente = cliente;
	}
	
	
	
}
