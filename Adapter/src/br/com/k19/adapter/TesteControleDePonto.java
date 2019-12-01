package br.com.k19.adapter;

import br.com.k19.adapter.ControleDePonto;

public class TesteControleDePonto {
	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePonto();
		Funcionario funcionario = new Funcionario("Marcelo Martins");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}
}
