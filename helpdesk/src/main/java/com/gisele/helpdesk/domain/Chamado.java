/**
 * 
 */
package com.gisele.helpdesk.domain;

import java.time.LocalDate;

import com.gisele.helpdesk.domain.enums.Prioridade;
import com.gisele.helpdesk.domain.enums.Status;

import lombok.Data;

/**
 * @author giseleCaetano
 * @since 05/22
 * Classe responsável pelo gerenciamento de chamados
 *
 */

@Data
public class Chamado {

	private Integer id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observações;
	
	private Tecnico tecnico;
	private Cliente cliente;
	
	public Chamado() {
		super();
	}

	public Chamado(Integer id, Prioridade prioridade, Status status, String titulo, String observações, Tecnico tecnico,
			Cliente cliente) {
		super();
		this.id = id;
		this.prioridade = prioridade;
		this.status = status;
		this.titulo = titulo;
		this.observações = observações;
		this.tecnico = tecnico;
		this.cliente = cliente;
	}
	
}
