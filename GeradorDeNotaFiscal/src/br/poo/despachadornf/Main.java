package br.poo.despachadornf;

import br.poo.geradornf.NotaFiscal;
import br.poo.geradornf.NotaFiscalDao;

public class Main {

	public static void main(String[] args) {
		
		NotaFiscalDao dao = new NotaFiscalDao();
		CalculadorImposto impostos = new CalculadorImposto();
		LeiEntrega lei = new LeiEntrega();
		Correios correios = new Correios();
		
		NotaFiscal nf = new NotaFiscal(100000);
		
		DespachadorNotasFiscais despachador = new DespachadorNotasFiscais(dao, impostos, lei, correios);

		despachador.processa(nf);
	}

}
