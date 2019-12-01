package br.com.k19.adapter;

public class ControleDePontoAdapter extends ControleDePonto {
	private ControleDePontoNovo controleDePontoNovo;
	
	public ControleDePontoAdapter() {
		this.controleDePontoNovo = new ControleDePontoNovo();
	}
	
	public void registraEntrada(Funcionario f) {
		this.controleDePontoNovo.registra(f, true);
	}
	
	public void registraSaida(Funcionario f) {
		this.controleDePontoNovo.registra(f, false);
	}
}
