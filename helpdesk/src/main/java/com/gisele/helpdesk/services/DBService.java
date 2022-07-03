package com.gisele.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gisele.helpdesk.domain.Chamado;
import com.gisele.helpdesk.domain.Cliente;
import com.gisele.helpdesk.domain.Tecnico;
import com.gisele.helpdesk.domain.enums.Perfil;
import com.gisele.helpdesk.domain.enums.Prioridade;
import com.gisele.helpdesk.domain.enums.Status;
import com.gisele.helpdesk.repository.ChamadoRepository;
import com.gisele.helpdesk.repository.ClienteRepository;
import com.gisele.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void iinstanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "11122233344", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torwalds", "22233344455", "torwalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeito Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
