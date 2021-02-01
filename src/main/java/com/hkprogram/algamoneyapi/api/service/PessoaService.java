package com.hkprogram.algamoneyapi.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hkprogram.algamoneyapi.api.model.Pessoa;
import com.hkprogram.algamoneyapi.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Optional<Pessoa> pessoaSalva = buscarPessoaPeloCodigo(codigo);
		
		if(pessoaSalva.isPresent()) {
			pessoa.setCodigo(codigo);
			pessoaSalva = Optional.ofNullable(pessoa);
			return pessoaRepository.save(pessoaSalva.get());
		} 
		
		return null;
	}
 
	public Boolean atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Optional<Pessoa> pessoaSalva = buscarPessoaPeloCodigo(codigo);
		if(pessoaSalva.isPresent()) {
			pessoaSalva.get().setAtivo(ativo);
			pessoaRepository.save(pessoaSalva.get());
			return true;
		}
		return false;
	}
	
	private Optional<Pessoa> buscarPessoaPeloCodigo(Long codigo) {
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
		return pessoaSalva;
	}
	
}
