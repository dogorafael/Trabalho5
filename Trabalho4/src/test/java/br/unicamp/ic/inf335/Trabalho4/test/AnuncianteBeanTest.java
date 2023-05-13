package br.unicamp.ic.inf335.Trabalho4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.net.URL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.trabalho4.beans.ProdutoBean;
import br.unicamp.ic.inf335.trabalho4.beans.AnuncianteBean;
import br.unicamp.ic.inf335.trabalho4.beans.AnuncioBean;

public class AnuncianteBeanTest {

    private AnuncianteBean anunciante;
    private AnuncioBean anuncio1; 
    private AnuncioBean anuncio2; 
    private AnuncioBean anuncio3;
    
    @BeforeEach
    public void setUp() {
        // Cria um novo objeto AnuncianteBean e adiciona dois anúncios
        anunciante = new AnuncianteBean("João", "123.456.789-00", new ArrayList<AnuncioBean>());
        anuncio1 = new AnuncioBean(new ProdutoBean("001", "Caneta", "Caneta preta", 4.50, "Novo"), new ArrayList<URL>(), 0.0);
        anuncio2 = new AnuncioBean(new ProdutoBean("002", "Lápis", "Lápis de cor", 2.50, "Novo"), new ArrayList<URL>(), 0.0);
        anuncio3 = new AnuncioBean(new ProdutoBean("003", "Caderno", "Caderno espiral", 8.0, "Novo"), new ArrayList<URL>(), 0.0);
        anunciante.addAnuncio(anuncio1);
        anunciante.addAnuncio(anuncio2);
        anunciante.addAnuncio(anuncio3);
    }

    @Test
    public void testAddAnuncio() {        
        AnuncioBean anuncio4 = new AnuncioBean(new ProdutoBean("004", "Mochila", "Mochila escolar", 25.0, "Novo"), new ArrayList<URL>(), 0.0);
    
        anunciante.addAnuncio(anuncio4);
        assertEquals(anunciante.getAnuncios().size(), 4);
        assertTrue(anunciante.getAnuncios().contains(anuncio4));
    }

    @Test
    public void testRemoveAnuncio() {       
        anunciante.removeAnuncio(1);        
        assertEquals(anunciante.getAnuncios().size(), 2);
        assertFalse(anunciante.getAnuncios().contains(anuncio2));
    }
    
    @Test
    public void testeValorMedioAnuncios()
    {
    	double valorMedio = anunciante.valorMedioAnuncios();
    	assertTrue(valorMedio == 5.0);
    }
}
