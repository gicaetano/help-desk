package com.gisele.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gisele.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
