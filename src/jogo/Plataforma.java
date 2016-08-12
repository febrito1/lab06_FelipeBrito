package jogo;

public class Plataforma extends Jogo {

	
	public Plataforma(String nome, int preco){	
		super(nome,preco);
	}
	
	public void registraJogada(int score, boolean zeraJogo){
		// trata excecoes
		super.adicionaJogada();
		super.atualizaMaiorScore(score);
		super.zeraJogo(zeraJogo);
		
	}
	
	
	
}
