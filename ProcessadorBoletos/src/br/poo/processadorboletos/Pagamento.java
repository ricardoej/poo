package br.poo.processadorboletos;

public class Pagamento {

	private double valor;
	private MeioPagamento meioPagamento;

	public double getValor() {
		return valor;
	}

	public MeioPagamento getMeioPagamento() {
		return meioPagamento;
	}

	public Pagamento(double valor, MeioPagamento meioPagamento) {
		this.valor = valor;
		this.meioPagamento = meioPagamento;
	}
}
