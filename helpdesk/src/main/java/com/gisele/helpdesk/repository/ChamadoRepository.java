package com.gisele.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gisele.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {


}
