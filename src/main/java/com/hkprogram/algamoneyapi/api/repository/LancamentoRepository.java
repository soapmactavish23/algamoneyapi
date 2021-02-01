package com.hkprogram.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogram.algamoneyapi.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
