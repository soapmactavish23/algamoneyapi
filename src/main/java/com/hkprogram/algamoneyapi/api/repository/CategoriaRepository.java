package com.hkprogram.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogram.algamoneyapi.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
