package br.com.k19;

public class TrechoDeCarro implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoDeCarro(String direcao, double distancia) {
		super();
		this.direcao = direcao;
		this.distancia = distancia;
	}

	@Override
	public void imprime() {
		System.out.println("Vá de carro");
		System.out.println(this.direcao);
		System.out.println("A distancia pecorrida será de: " + this.distancia + " metros.");
	}

}
