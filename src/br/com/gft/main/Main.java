package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java Poo", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "one", true);

		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		
		List<VideoGame> videoGames = new ArrayList<>();
		videoGames.add(ps4);
		videoGames.add(ps4Usado);
		videoGames.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, videoGames);
		l1.calculaImposto();
		l2.calculaImposto();
		l3.calculaImposto();
		
		ps4.calculaImposto();
		ps4Usado.calculaImposto();
		xbox.calculaImposto();
		
		System.out.println("A loja " + americanas.getLoja() + " possui estes livros para venda:");
		americanas.listaLivros();
		System.out.println("A loja " + americanas.getLoja() + " possui estes video-games para venda:");
		americanas.listaVideoGames();
		
//		double livrosSoma = livros.stream().filter(titulo->titulo.getNome().equalsIgnoreCase("Harry Potter")).peek(p->p.getPreco()*p.getQtd())));
//		System.out.println("SOMA:" + livrosSoma);
		
		americanas.calculaPatrimonio(livros, videoGames);
		
		
	}
}
