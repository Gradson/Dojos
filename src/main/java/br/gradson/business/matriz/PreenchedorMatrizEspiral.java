package br.gradson.business.matriz;

import java.util.ArrayList;
import java.util.List;

public class PreenchedorMatrizEspiral {

	public int[][] preencher(int[][] matriz, int qtdColunas, int qtdLinhas) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Celula> preencherVerticeSuperior(int tamanhoLinha, int valorInicial) {
		int linha = 0;
		List<Celula> celulas = new ArrayList<Celula>();
		
		for(int coluna = 0; coluna < tamanhoLinha; coluna ++) {
			celulas.add(new Celula(linha, coluna, valorInicial));
			valorInicial ++;
		}
		
		return celulas;
	}

	public List<Celula> preencherVerticeDireito(int tamanhoLinha, int tamanhoColuna, int valorInicial) {
		ArrayList<Celula> celulas = new ArrayList<Celula>();
		
		for(int linha = 0; linha < tamanhoColuna; linha++) {
			celulas.add(new Celula(linha, tamanhoLinha - 1 , valorInicial));
			valorInicial++;
		}
		
		return celulas;
	}

	public List<Celula> preencherVerticeInferior(int tamanhoLinha,	int tamanhoColuna, int valorInicial) {
		ArrayList<Celula> celulas = new ArrayList<Celula>();
		
		for(int coluna = tamanhoLinha -1; coluna >= 0; coluna --) {
			celulas.add(new Celula(tamanhoColuna - 1, coluna, valorInicial));
			valorInicial++;
		}
		
		return celulas;
	}

	public List<Celula> preencherVerticeEsquerdo(int tamanhoLinha,	int tamanhoColuna, int valorInicial) {
		ArrayList<Celula> celulas = new ArrayList<Celula>();
		
		for(int linha = tamanhoColuna - 1; linha >= 1; linha--) {
			celulas.add(new Celula(linha, 0, valorInicial));
			valorInicial++;
		}
		
		return celulas;
	}

	

}
