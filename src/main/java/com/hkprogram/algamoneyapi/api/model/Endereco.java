package com.hkprogram.algamoneyapi.api.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
}
