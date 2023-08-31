/**
 * 
 */
package br.com.pires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.pires.dao.IProdutoDao;
import br.com.pires.dao.ProdutoDao;
import br.com.prires.domain.Produto;

/**
 * 
 */
public class ProdutoTest {
	
	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar () {
	
		Produto produto = new Produto();
		
		produto.setCodigo("A2");
		produto.setNome("Arroz");
		produto.setPreco(50d);
		produto.setQuant("10");
		
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
	

}
