package br.poo.processadorboletos;

import java.util.List;

public class ProcessadorBoletos {
	
	public void processa(List<Boleto> boletos, Fatura fatura) {
		
		double total = 0;
		
		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioPagamento.BOLETO);
			fatura.getPagamentos().add(pagamento);
			total += fatura.getValor();
		}
		
		if (total >= fatura.getValor()) {
			fatura.setPago(true);
		}
	}
}
