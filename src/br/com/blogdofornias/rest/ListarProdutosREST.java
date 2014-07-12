package br.com.blogdofornias.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.blogdofornias.bo.ProdutoBO;
import br.com.blogdofornias.vo.Produto;

@LocalBean
@Stateless
@Path(value="/ListarProdutos")
public class ListarProdutosREST {

	@EJB
	private ProdutoBO produtoBO;

	public ListarProdutosREST() {
	}

	@GET
	@Path(value="/listarTodosProdutos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> listarTodosProdutos() {
		return this.produtoBO.listarTodosProdutos();
	}

	@GET
	@Path(value="/buscarProdutoPorID")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto buscarProdutoPorID(@QueryParam("cod_prod") Integer codigoProduto) throws RestException {
		if(codigoProduto == null) {
			throw new RestException(10, "Parâmetro obrigatório nulo. [cod_prod]");
		}

		return this.produtoBO.buscarProdutoPorID(codigoProduto);
	}

	@POST
	@Path(value="/buscarProdutoPorIDPost")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto buscarProdutoPorIDPost(@FormParam("cod_prod") Integer codigoProduto) {
		return this.produtoBO.buscarProdutoPorID(codigoProduto);
	}
}
