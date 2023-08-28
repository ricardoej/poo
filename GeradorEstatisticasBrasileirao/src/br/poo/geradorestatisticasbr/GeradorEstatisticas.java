package br.poo.geradorestatisticasbr;

public class GeradorEstatisticas {
	
	public EstatisticaTempoJogo calcularTemposJogo(Jogo jogo) {
		return new EstatisticaTempoJogo(
				jogo.getPosseBolaTimeVisitanteDefesaEmMin(), 
				jogo.getPosseBolaTimeVisitanteAtaqueEmMin(),
				jogo.getPosseBolaTimeMandanteDefesaEmMin(), 
				jogo.getPosseBolaTimeVisitanteAtaqueEmMin(),
				jogo.getTempoTotalBolaRolandoEmMin(),
				jogo.getTempoTotalJogoEmMin()
			);
	}
	
	public EstatisticaFaltasCartoes calcularFaltasCartoes(Jogo jogo) {
		return new EstatisticaFaltasCartoes(
				jogo.getCartoesAmarelosVisitante(),
				jogo.getCartoesVermelhosVisitante(),
				jogo.getCartoesAmarelosMandante(),
				jogo.getCartoesVermelhosMandante(),
				jogo.getFaltasTimeVisitante(),
				jogo.getFaltasTimeMandante()
			);
	}
	
	public EstatisticaGolsChutes calcularChutesGol(Jogo jogo) {
		return new EstatisticaGolsChutes(jogo.getGolsTimeVisitante(), 
				jogo.getGolsTimeMandante(), 
				jogo.getChutesAGolTimeVisitante(), 
				jogo.getChutesAGolTimeMandante()
			);
	}
	
}
