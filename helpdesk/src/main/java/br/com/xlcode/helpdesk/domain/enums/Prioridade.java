package br.com.xlcode.helpdesk.domain.enums;

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
		this.setCodigo(codigo);
		this.setDescrição(descrição);
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
