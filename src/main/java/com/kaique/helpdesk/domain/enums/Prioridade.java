package com.kaique.helpdesk.domain.enums;

public enum Prioridade {
	
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");
	
	private Integer codigo;
	private String description;
	
	private Prioridade(Integer codigo, String description) {
		this.codigo = codigo;
		this.description = description;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescription() {
		return description;
	}
	
	public static Prioridade toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (Prioridade x : Prioridade.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioriade Inválida");
		
	}
}
