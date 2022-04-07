package com.brunocarmanhan.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunocarmanhan.vendas.DTO.ClienteDTO;
import com.brunocarmanhan.vendas.entities.Cliente;
import com.brunocarmanhan.vendas.services.ClienteService;

@RestController//classe ela vai ter endpoints
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>>findAll(){
		List<ClienteDTO>lista = clienteService.findAll();
		return ResponseEntity.ok(lista);
	}

}
