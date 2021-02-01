package com.hkprogram.algamoneyapi.api.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkprogram.algamoneyapi.api.model.Lancamento;
import com.hkprogram.algamoneyapi.api.model.Pessoa;
import com.hkprogram.algamoneyapi.api.repository.LancamentoRepository;
import com.hkprogram.algamoneyapi.api.repository.PessoaRepository;
import com.hkprogram.algamoneyapi.api.service.exception.PessoaInexistenteOuInativoException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(@Valid Lancamento lancamento) {
		Long codigo = lancamento.getPessoa().getCodigo();
		if(codigo == null) codigo = 0L;
		Optional<Pessoa> pessoa = pessoaRepository.findById(codigo); 
		
		if(codigo == null || !pessoa.isPresent() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativoException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
	
	
}
