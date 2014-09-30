package br.dojo.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeradorDeMatrizTest {
	
	private GeradorDeMatriz gerador;

	@Before
	public void setUp() throws Exception {
		gerador = new GeradorDeMatrizImpl();
	}
	
	@Test
	public void deveRetornar20QuandoOsDigitosDeEntradaForem5E4() {
		int linha = 5;
		int coluna = 4;
		 assertEquals(20,gerador.getQuantidadeDeValores(linha, coluna));
		
	}
	
	@Test
	public void deveRetornarValoresDe1A8QuandoAQauntidadeDeValoresFor8() {
		int qtdeValores = 8;
		List<Integer> valores = gerador.gerarValores(8);
		
		for (int item = 0; item < qtdeValores; item++) {
			int valorEsperado = item + 1;
			assertEquals(valorEsperado, valores.get(item).intValue());
		}
	}
	
	@Test
	public void deveRetornarPrimeiraLinhaDaMatrizEspiralQuandoElaFor3por3() {
		int linha = 3;
		int coluna = 3;
		Integer[][] matriz = gerador.gerar(linha, coluna);
		
		assertEquals(1, matriz[0][0].intValue());
		assertEquals(2, matriz[0][1].intValue());
		assertEquals(3, matriz[0][2].intValue());
	}
	
	@Test
	public void deveGerarPrimeiraColunaDaMatrizEspiralQuandoElaFor3Por3() {
		int linha = 3;
		int coluna = 3;
		Integer[][] matriz = gerador.gerar(linha, coluna);
		
		assertEquals(3, matriz[0][2].intValue());
		assertEquals(4, matriz[1][2].intValue());
		assertEquals(5, matriz[2][2].intValue());
	}
	
	@Test
	public void deveGerarUltimaLinhaDaMatrizEspiralQuandoElaFor3Por3() {
		int linha = 3;
		int coluna = 3;
		Integer[][] matriz = gerador.gerar(linha, coluna);
		
		assertEquals(7, matriz[2][0].intValue());
		assertEquals(6, matriz[2][1].intValue());
		assertEquals(5, matriz[2][2].intValue());
	}

}
