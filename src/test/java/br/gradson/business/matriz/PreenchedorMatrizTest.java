package br.gradson.business.matriz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PreenchedorMatrizTest {
	
	private PreenchedorMatrizEspiral preenchedor;
	private final int TAMANHO_LINHA = 3;
	private final int TAMANHO_COLUNA = 4;	

	@Before
	public void setUp() throws Exception {
		preenchedor = new PreenchedorMatrizEspiral();
	}

	@Test
	public void deveRetornar3CelulasAoSerBuscadoPrimeiraLinhaDaMatriz3Por4() {
		int valorInicial = 1;
		List<Celula> celulas = preenchedor.preencherVerticeSuperior(TAMANHO_LINHA, valorInicial);
		
		assertEquals(3, celulas.size());
	}

	@Test
	public void deveRetornarATerceiraClulaComValor3EhPosicaoColunaIgualA2AoSerBuscadoPrimeiraLinhaDaMatriz3Por4() {
		int valorInicial = 1;
		List<Celula> celulas = preenchedor.preencherVerticeSuperior(TAMANHO_LINHA, valorInicial);
		Celula celula = celulas.get(2);
		
		assertEquals(3, celula.getValor());
		assertEquals(2, celula.getColuna());
	}
	
	@Test
	public void deveRetornarAQuartaCelulaComLinha3eColuna2AoBuscarVerticeDireitaDeUmaMatriz3Por4() {
		int valorInicial = 4;
		List<Celula> celulas = preenchedor.preencherVerticeDireito(TAMANHO_LINHA, TAMANHO_COLUNA, valorInicial);
		Celula celula = celulas.get(3);
		
		assertEquals(3, celula.getLinha());
		assertEquals(2, celula.getColuna());
	}
	
	@Test
	public void deveRetornarAPenltimaCelulaComLinha3eColuna1AoBuscarVerticeInferiorDeUmaMatriz3Por4() {
		int valorInicial = 7;
		List<Celula> celulas = preenchedor.preencherVerticeInferior(TAMANHO_LINHA, TAMANHO_COLUNA, valorInicial);
		Celula celula = celulas.get(1);
		
		assertEquals(3, celula.getLinha());
		assertEquals(1, celula.getColuna());
		assertEquals(8, celula.getValor());
	}
}
