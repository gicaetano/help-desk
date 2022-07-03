package com.gisele.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gisele.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
