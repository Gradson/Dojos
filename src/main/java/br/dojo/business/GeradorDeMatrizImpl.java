package br.dojo.business;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeMatrizImpl implements GeradorDeMatriz{

	public List<Integer> gerarValores(int quantidadeDeValores) {
		List<Integer> digitosDaLinha = new ArrayList<Integer>();
		
		for (int item = 1; item <= quantidadeDeValores; item++) {
			digitosDaLinha.add(item);
		}
		
		return digitosDaLinha;
	}

	public int getQuantidadeDeValores(int linha, int coluna) {
		return linha * coluna;
	}

	public Integer[][] gerar(int tamanhoLinha, int tamanhoColuna) {
		Integer[][] matrizEspiral = new Integer[tamanhoLinha][tamanhoColuna];
		int quantidadeDeValores = getQuantidadeDeValores(tamanhoLinha, tamanhoColuna);
		List<Integer> valores = gerarValores(quantidadeDeValores);
		
		int posLinha = 0;
		int posColuna = 0;
		int tamanhoLinhaInicial = 0;
		int tamanhoColunaInicial = 0;
		Sentido sentido = Sentido.ESQUERDA_DIREITA;
		
		for(int posicao = 0; posicao < quantidadeDeValores; posicao++) {
			switch (sentido) {
			case ESQUERDA_DIREITA:
				if(posColuna < tamanhoLinha) {
					matrizEspiral[posLinha][posColuna] = valores.get(posicao);
					posColuna++;
				} else {
					sentido = Sentido.CIMA_BAIXO;
					tamanhoLinha--;
					posLinha++;
					posColuna --;
					posicao--;
				}
				break;
			case CIMA_BAIXO:
				if(posLinha < tamanhoColuna) {
					matrizEspiral[posLinha][posColuna] = valores.get(posicao);
					posLinha++;
				} else {
					sentido = Sentido.DIREITA_ESQUERDA;
					tamanhoColuna --;
					posLinha --;
					posColuna --;
					posicao--;
				}
				break;
			case DIREITA_ESQUERDA:
				if(posColuna >= tamanhoLinhaInicial) {
					matrizEspiral[posLinha][posColuna] = valores.get(posicao);
					posColuna --;
				} else {
					sentido = Sentido.BAIXO_CIMA;
					tamanhoLinhaInicial ++;
					posLinha = tamanhoLinhaInicial;
					posColuna += 2;
					posicao--;
				}
				break;
			case BAIXO_CIMA:
				if(posLinha >= tamanhoColunaInicial) {
					matrizEspiral[posLinha][posColuna] = valores.get(posicao);
					posLinha --;
				} else {
					/*sentido = Sentido.DIREITA_ESQUERDA;
					tamanhoColunaInicial ++;
					posLinha += 2;
					posColuna = tamanhoColunaInicial;
					posicao --;*/
				}
				break;
				
			default:
				break;
			}
		}
		
		return matrizEspiral;
	}

}
