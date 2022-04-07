package com.brunocarmanhan.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunocarmanhan.vendas.DTO.ComprasDTO;
import com.brunocarmanhan.vendas.entities.Compras;
import com.brunocarmanhan.vendas.repositories.ComprasRepository;

@Service
public class ComprasService {
	@Autowired
	private ComprasRepository comprasRepository;
	
	public List<ComprasDTO> findAll() {
		List<Compras>res=comprasRepository.findAll();
		return res.stream().map(c->new ComprasDTO(c)).collect(Collectors.toList());
	}
}
