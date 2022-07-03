package com.gisele.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gisele.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
