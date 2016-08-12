package jogo;

public class Luta extends Jogo {

	public Luta(String nome, double preco){
		
		super(nome,preco);
	}
	
	public void registraJogada(int score, boolean zeraJogo){
		// trata excecoes
		super.adicionaJogada();
		super.atualizaMaiorScore(score);
		super.zeraJogo(zeraJogo);
		
	}
	
	
	
}
