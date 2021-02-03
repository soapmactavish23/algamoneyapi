package com.hkprogram.algamoneyapi.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogram.algamoneyapi.api.model.Lancamento;
import com.hkprogram.algamoneyapi.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

	List<Lancamento> findByDescricao(String descricao);
	
}
