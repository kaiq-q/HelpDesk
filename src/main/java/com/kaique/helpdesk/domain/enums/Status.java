package com.kaique.helpdesk.domain.enums;

public enum Status {
	
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), TECNICO(2, "ENCERRADO");
	
	private Integer codigo;
	private String description;
	
	private Status(Integer codigo, String description) {
		this.codigo = codigo;
		this.description = description;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescription() {
		return description;
	}
	
	public static Status toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (Status x : Status.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Perfil Inválido");
		
	}
}
