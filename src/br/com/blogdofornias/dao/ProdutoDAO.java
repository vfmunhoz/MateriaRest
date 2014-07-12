package br.com.blogdofornias.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.blogdofornias.vo.Produto;

@LocalBean
@Stateless
public class ProdutoDAO {

	@PersistenceContext(unitName="eatbox")
	private EntityManager entityManager;

	public ProdutoDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listarTodosProdutos() {
		Query query = this.entityManager.createNamedQuery("Produto.listarTodosProdutos");

		return (List<Produto>) query.getResultList();
	}

	public Produto buscarProdutoPorID(Integer codigoProduto) {
		return this.entityManager.find(Produto.class, codigoProduto);
	}
}