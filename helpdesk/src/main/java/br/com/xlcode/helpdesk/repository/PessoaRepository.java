package br.com.xlcode.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xlcode.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
