package br.poo.geradorestatisticasbr;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo(2, 4, 21, 30, 10, 22, 18, 20, 70, 96, 32, 1, 0, 24, 1, 1);
		GeradorEstatisticas gerador = new GeradorEstatisticas();
		EstatisticaTempoJogo tempoJogo = gerador.calcularTemposJogo(jogo);
		EstatisticaGolsChutes chutesGol = gerador.calcularChutesGol(jogo);
		EstatisticaFaltasCartoes faltasCartoes = gerador.calcularFaltasCartoes(jogo);
		System.out.println(tempoJogo.imprimir());
		System.out.println(chutesGol.imprimir());
		System.out.println(faltasCartoes.imprimir());
	}

}
