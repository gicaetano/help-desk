package br.com.xlcode.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xlcode.helpdesk.domain.Tecnico;
import br.com.xlcode.helpdesk.repository.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
