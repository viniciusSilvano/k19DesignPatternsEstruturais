package br.com.k19;

public class TrechoAndando implements Trecho {
	private String direcao;
	private double distancia;
	
	
	public TrechoAndando(String direcao, double distancia) {
		super();
		this.direcao = direcao;
		this.distancia = distancia;
	}


	@Override
	public void imprime() {
		System.out.println("V� andando");
		System.out.println(this.direcao);
		System.out.println("A dist�ncia pecorrida ser� de " + this.distancia + "metros.");
	}

}
