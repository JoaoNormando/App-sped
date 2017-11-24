package br.com.srcomputador.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Entity
@Table(name = "importacao")
public class Importacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	private String descricao;
	
	@OneToMany(mappedBy = "importacao", cascade = CascadeType.ALL)
	private List<NotaFiscalEletronica> listaNfe;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente cliente;
	
	@Enumerated(EnumType.ORDINAL)
	private ModulosImportacao modulo;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<NotaFiscalEletronica> getListaNfe() {
		return listaNfe;
	}
	
	public void setListaNfe(List<NotaFiscalEletronica> listaNfe) {
		this.listaNfe = listaNfe;
	}

	public Long getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ModulosImportacao getModulo() {
		return modulo;
	}

	public void setModulo(ModulosImportacao modulo) {
		this.modulo = modulo;
	}
	
}
