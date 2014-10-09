package br.gradson.business.matriz;

public class GeradorDeMatriz {
	
	private int[][] matriz;
	private int qtdColunas; 
	private int qtdLinhas;
	private PreenchedorMatrizEspiral preenchedorMatriz;

	public GeradorDeMatriz(int qtdColunas, int qtdLinhas) {
		this();
		this.qtdColunas = qtdColunas;
		this.qtdLinhas = qtdLinhas;
		this.matriz = new int[qtdLinhas][qtdColunas];
	}
	
	public GeradorDeMatriz() {
		preenchedorMatriz = new PreenchedorMatrizEspiral();
	}

	public int[][] getMatriz() {
		return preenchedorMatriz.preencher(matriz, qtdColunas, qtdLinhas);
	}

	public int getQtdColunas() {
		return qtdColunas;
	}

	public int getQtdLinhas() {
		return qtdLinhas;
	}
	
	public void setPreenchedorMatriz(PreenchedorMatrizEspiral preenchedorMatriz) {
		this.preenchedorMatriz = preenchedorMatriz;
	}
}
