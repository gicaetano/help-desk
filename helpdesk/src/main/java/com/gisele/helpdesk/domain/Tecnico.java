package com.gisele.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author giseleCaetano
 * @since 05/22
 * Classe responsável pelo cadastro de técnico
 */

@Getter
@Setter
public class Tecnico extends Pessoa {
	
	private List<Chamado> chamados = new ArrayList<>();

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}
	
	

}
