package com.gisele.helpdesk.domain.enums;

import lombok.Getter;

/**
 * @author giseleCaetano
 * @since 05/22 
 * DEFINIÇÃO DA PRIORIDADE DO CHAMADO
 *        
 */

@Getter
public enum Prioridade {

	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

	private Integer codigo;
	private String descrição;
	
	private Prioridade(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	/**
	 * 
	 * MÉTODO
	 * Responsável por verificar se o PRIORIDADE recebido é válido
	 * 
	 */
	
	public static Prioridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("sTATUS Inválido");
	}
}
