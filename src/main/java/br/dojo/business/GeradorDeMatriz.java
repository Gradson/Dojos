package br.dojo.business;

import java.util.List;

public interface GeradorDeMatriz {

	List<Integer> gerarValores(int i);

	int getQuantidadeDeValores(int i, int j);

	Integer[][] gerar(int linha, int coluna);
}
