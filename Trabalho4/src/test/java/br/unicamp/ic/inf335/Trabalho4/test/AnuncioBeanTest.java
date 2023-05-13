package br.unicamp.ic.inf335.Trabalho4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.trabalho4.beans.ProdutoBean;
import br.unicamp.ic.inf335.trabalho4.beans.AnuncioBean;

class AnuncioBeanTest {
	
	ProdutoBean produto = new ProdutoBean("01", "Camiseta", "Camiseta Azul", 50.90, "nova");
	AnuncioBean anuncio = new AnuncioBean();
	
	@Test
	void testGetValor() {
		anuncio.setProduto(produto);
		
		anuncio.setDesconto(0.0);
		double valorSemDesconto = anuncio.getValor();		
		assertTrue(valorSemDesconto == produto.getValor());
		
		anuncio.setDesconto(0.5);
		double valorComDesconto50 = anuncio.getValor();		
		assertTrue(valorComDesconto50 == 25.45);
		
		anuncio.setDesconto(1.0);
		double valorComDesconto100 = anuncio.getValor();		
		assertTrue(valorComDesconto100 == 0);
	}
	

}
