package com.gisele.helpdesk.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.gisele.helpdesk.domain.enums.Perfil;

import lombok.Data;

@Data
public abstract class Pessoa {

	protected Integer id;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String senha;
	protected Set<Integer> perfis = new HashSet<>();
	protected LocalDate dataCriacao = LocalDate.now();

	public Pessoa() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Pessoa(Integer id, String nome, String cpf, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		addPerfil(Perfil.CLIENTE);
	}

	/**
	 * MÉTODO
	 * responsável por criar perfil padrão CLIENTE
	 * @param perfil
	 */
	private void addPerfil(Perfil perfil) {
		this.perfis.add(perfil.getCodigo());
	}
}
