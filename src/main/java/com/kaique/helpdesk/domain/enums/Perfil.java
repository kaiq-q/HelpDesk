package com.kaique.helpdesk.domain.enums;

public enum Perfil {
	
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), TECNICO(2, "ENCERRADO");
	
	private Integer codigo;
	private String description;
	
	private Perfil(Integer codigo, String description) {
		this.codigo = codigo;
		this.description = description;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescription() {
		return description;
	}
	
	public static Perfil toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (Perfil x : Perfil.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Perfil Inválido");
		
	}
}
