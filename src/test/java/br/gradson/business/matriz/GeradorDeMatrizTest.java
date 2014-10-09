package br.gradson.business.matriz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.gradson.business.matriz.GeradorDeMatriz;

public class GeradorDeMatrizTest {
	
	private GeradorDeMatriz gerador;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void deveRetornar1QuandoMatrizFor1Por1() {
		gerador = new GeradorDeMatriz(1, 1);
		int[][] matrizEspiral = gerador.getMatriz();
		
		assertEquals(1, matrizEspiral[0][0]);
	}
	
	@Test
	public void deveRetornar2NaPosicao0_1QuandoMatrizFor2Por1() {
		gerador = new GeradorDeMatriz(2, 1);
		int[][] matriz = gerador.getMatriz();
		
		assertEquals(2, matriz[0][1]);
	}
	
	@Test
	public void deveRetornar2NaPosicao1_0QuandoMatrizFor1Por2() {
		gerador = new GeradorDeMatriz(1, 2);
		int[][] matriz = gerador.getMatriz();
		
		assertEquals(2, matriz[1][0]);
	}
	
	@Test
	public void deveRetornar9NaPosicao1_1QuandoMatrizFor3Por3() {
		gerador = new GeradorDeMatriz(3, 3);
		int[][] matriz = gerador.getMatriz();
		
		assertEquals(9, matriz[1][1]);
	}

}