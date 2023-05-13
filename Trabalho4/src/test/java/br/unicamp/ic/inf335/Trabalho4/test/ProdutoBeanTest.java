package br.unicamp.ic.inf335.Trabalho4.test;

import br.unicamp.ic.inf335.trabalho4.beans.ProdutoBean;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {	

	ProdutoBean produto1 = new ProdutoBean("01", "Camiseta", "Camiseta Azul", 50.90, "nova");
	ProdutoBean produto2 = new ProdutoBean("02", "Blusa", "Blusa Vermelha", 120.50, "nova");
	ProdutoBean produto3 = new ProdutoBean("03", "Blusa", "Blusa Verde", 120.50, "nova");
	
	@Test
	void testCompareTo() {
		
		
		assertTrue(produto1.compareTo(produto2) < 0);
		assertTrue(produto2.compareTo(produto1) > 0);
		assertTrue(produto1.compareTo(produto1) == 0);
		assertTrue(produto2.compareTo(produto3) == 0);
	}
}
