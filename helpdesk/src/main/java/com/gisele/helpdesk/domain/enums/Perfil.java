package com.gisele.helpdesk.domain.enums;

import lombok.Getter;

/**
 * @author giseleCaetano
 * @since 05/22 
 * DEFINIÇÃO DO PERFIL QUE ESTA ACESSANDO O SISTEMA
 */

@Getter
public enum Perfil {

	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

	private Integer codigo;
	private String descrição;
	
	private Perfil(Integer codigo, String descrição) {
		this.setCodigo(codigo);
		this.setDescrição(descrição);
	}

	/**
	 * 
	 * MÉTODO
	 * Responsável por verificar se o código recebido é válido
	 * 
	 */
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Perfil x : Perfil.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Perfil Inválido");
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
}
