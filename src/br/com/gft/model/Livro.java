package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{

	private String autor;
	private String tema;
	private int qtdpag;
	
	public Livro() {
	}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdpag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdpag = qtdpag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdpag() {
		return qtdpag;
	}

	public void setQtdpag(int qtdpag) {
		this.qtdpag = qtdpag;
	}

	@Override
	public Double calculaImposto() {
		if(!getTema().equalsIgnoreCase("educativo")) {
			return getPreco() + (getPreco() * 0.10);
		}
		return 0.0;
	}
	
	@Override
	public String toString() {
		return " Título: " + getNome() + ", preço:" + getPreco() + ", quantidade:" + getQtd()+ " em estoque."+"\n";
	}
}
