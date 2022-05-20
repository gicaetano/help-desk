package com.gisele.helpdesk.domain.enums;

import lombok.Getter;

/**
 * @author giseleCaetano
 * @since 05/22 
 * DEFINIÇÃO DO STATUS DO CHAMADO
 *        
 */

@Getter
public enum Status {

	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

	private Integer codigo;
	private String descrição;
	
	private Status(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	/**
	 * 
	 * MÉTODO
	 * Responsável por verificar se o STATUS recebido é válido
	 * 
	 */
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Status x : Status.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("sTATUS Inválido");
	}
}
