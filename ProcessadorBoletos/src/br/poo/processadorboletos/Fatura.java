package br.poo.processadorboletos;

import java.util.List;

public class Fatura {

	private List<Pagamento> pagamentos;
	private double valor;
	private boolean pago;

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public double getValor() {
		return valor;
	}
	
	public boolean getPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
