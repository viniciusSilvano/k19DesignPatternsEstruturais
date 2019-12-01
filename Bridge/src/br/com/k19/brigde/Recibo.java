package br.com.k19.brigde;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Recibo implements Documento {
	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorDeArquivo geradorDeArquivo;

	public Recibo(String emissor, String favorecido, double valor, GeradorDeArquivo geradorDeArquivo) {
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}

	@Override
	public void geraArquivo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Recibo: ");
		buffer.append("\n");
		buffer.append("Empresa: " + this.emissor);
		buffer.append("\n");
		buffer.append("Cliente: " + this.favorecido);
		buffer.append("\n");
		buffer.append("Valor: " + this.valor);
		buffer.append("\n");
		this.geradorDeArquivo.gera(buffer.toString());
	}

}
