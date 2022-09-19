package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private boolean isUsado;

	public void videoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public Double calculaImposto() {
		if (isUsado) {
			return getPreco() + (getPreco() * 0.25);			
		} 		
		return getPreco() +(getPreco() * 0.45);
	}

	@Override
	public String toString() {
		return "VideoGame : modelo: " + modelo + ", preço:" + getPreco() + ", quantidade:" + getQtd()+ "\n" ;
	}
	
	
}
