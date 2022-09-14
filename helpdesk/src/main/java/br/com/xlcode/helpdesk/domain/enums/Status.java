package br.com.xlcode.helpdesk.domain.enums;

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
		this.setCodigo(codigo);
		this.setDescrição(descrição);
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
