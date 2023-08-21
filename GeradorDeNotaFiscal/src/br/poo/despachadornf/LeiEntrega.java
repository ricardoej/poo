package br.poo.despachadornf;

import br.poo.geradornf.NotaFiscal;

public class LeiEntrega {

	public boolean deveEntregarUrgente(NotaFiscal nf) {
		return nf.getValor() >= 100000;
	}

}
