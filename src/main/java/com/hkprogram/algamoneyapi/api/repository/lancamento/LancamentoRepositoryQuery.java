package com.hkprogram.algamoneyapi.api.repository.lancamento;

import java.util.List;

import com.hkprogram.algamoneyapi.api.model.Lancamento;
import com.hkprogram.algamoneyapi.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery{

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
