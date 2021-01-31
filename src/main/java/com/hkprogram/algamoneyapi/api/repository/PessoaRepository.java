package com.hkprogram.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogram.algamoneyapi.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
