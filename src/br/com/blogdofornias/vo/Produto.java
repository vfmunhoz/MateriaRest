package br.com.blogdofornias.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="produtos")

@NamedQueries ({
	@NamedQuery(name="Produto.listarTodosProdutos", query="SELECT p FROM Produto p")
})

@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)
public class Produto implements Serializable {

	private static final long serialVersionUID = 4515608770838339692L;

	@Id
	private Integer id;
	private String nome;
	private String descricao;
	private Integer quantidade;
	private Double preco;

	public Produto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
