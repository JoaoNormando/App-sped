package br.com.srcomputador.servico.relatorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.servico.RelatorioExcelService;

@Service
public class RelatorioNFe {

	private RelatorioExcelService relatorioExcelService;

	@Autowired
	public RelatorioNFe(RelatorioExcelService relatorioExcelService) {
		this.relatorioExcelService = relatorioExcelService;
	}
	
	
	
}
