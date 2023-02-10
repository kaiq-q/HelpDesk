package com.kaique.helpdesk.domain.enums;

public enum Perfil {
	
	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");
	
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
		
		throw new IllegalArgumentException("Status Inválido");
		
	}
}
