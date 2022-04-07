package com.brunocarmanhan.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunocarmanhan.vendas.DTO.ClienteDTO;
import com.brunocarmanhan.vendas.entities.Cliente;
import com.brunocarmanhan.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDTO> findAll() {
		List<Cliente>res=clienteRepository.findAll();
		return res.stream().map(c->new ClienteDTO(c)).collect(Collectors.toList());
	}

	

}
