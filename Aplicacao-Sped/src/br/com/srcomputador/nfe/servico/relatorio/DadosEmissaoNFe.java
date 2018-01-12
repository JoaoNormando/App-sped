package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosEmissaoNFe {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoDadosEmissao() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Emiss�o");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Natureza da opera��o");
				add("Tipo da opera��o");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> getDadosEmissao(NotaFiscalEletronica nfe){
		List<String> lista = new ArrayList<>();
		lista.add(nfe.getInfNfe().getIde().getNatOp());
		lista.add(String.valueOf(nfe.getInfNfe().getIde().getTpNf()));
		return lista;
	}
	
}
