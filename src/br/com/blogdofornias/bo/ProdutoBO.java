package br.com.blogdofornias.bo;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.blogdofornias.dao.ProdutoDAO;
import br.com.blogdofornias.vo.Produto;

@LocalBean
@Stateless
public class ProdutoBO {

	@EJB
	private ProdutoDAO produtoDAO;

	public ProdutoBO() {
	}

	public List<Produto> listarTodosProdutos() {
		return this.produtoDAO.listarTodosProdutos();
	}

	public Produto buscarProdutoPorID(Integer codigoProduto) {
		return this.produtoDAO.buscarProdutoPorID(codigoProduto);
	}
}
