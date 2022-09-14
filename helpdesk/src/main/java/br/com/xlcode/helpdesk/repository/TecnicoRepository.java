package br.com.xlcode.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xlcode.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
