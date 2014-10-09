package br.gradson.business.matriz;

public class Celula {
	
	private int linha;
	private int coluna;
	private int valor;
	
	public Celula(int linha, int coluna, int valor) {
		this.linha = linha;
		this.valor = valor;
		this.coluna = coluna;
	}
	
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}
