package br.com.xlcode.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xlcode.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
