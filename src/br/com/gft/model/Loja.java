package br.com.gft.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import br.com.gft.interfaces.Imposto;

public class Loja {

	private String loja;
	private String cnpj;

	List<Livro> livros;
	List<VideoGame> videoGames;

	public Loja() {

	}

	public Loja(String loja, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.loja = loja;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		if (getLivros().isEmpty() || getLivros().size() == 0) {
			System.out.println("A loja não tem livros no seu estoque.");
		}
		System.out.println(getLivros().toString());
	}

	public void listaVideoGames() {
		if (getVideoGames().isEmpty() || getVideoGames().size() == 0) {
			System.out.println("A loja não tem video-games no seu estoque.");
		}
		System.out.println(getVideoGames());
	}

	public Double calculaPatrimonio(List<Livro> livros, List<VideoGame> videoGames) {

		Stream<Object> somaLivrosPrecoQuantidade = livros.stream()
				.filter(titulo->titulo.getNome().equalsIgnoreCase("Harry Potter"))
				.map(p->p.getPreco()*p.getQtd());
		somaLivrosPrecoQuantidade.iterator().forEachRemaining(p -> {
			.
		});
//		System.out.println("Soma livros Harry Potter: " + somaLivrosPrecoQuantidade);
//
//		Double somaVideoGamePrecoQuantidade = videoGames.stream().filter(tipo->tipo.getNome().equalsIgnoreCase("ps4")).flatMap(v->v.getPreco()*v.getQtd())));
//
//		System.out.println("Soma video game: "+ somaVideoGamePrecoQuantidade);

	}

}