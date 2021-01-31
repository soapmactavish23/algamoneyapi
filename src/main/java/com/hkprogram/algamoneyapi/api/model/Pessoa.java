package com.hkprogram.algamoneyapi.api.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank
	private String nome;
	
	@Embedded
	private Endereco endereco;
	
	@NotNull
	private Boolean ativo;
	
}
