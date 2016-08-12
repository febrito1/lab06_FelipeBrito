package jogo;

public class RPG extends Jogo {

	public RPG(String nome, double preco){
		
		super(nome, preco);
		
	}

	public void registraJogada(int score, boolean zeraJogo){
		// trata excecoes
		super.adicionaJogada();
		super.atualizaMaiorScore(score);
		super.zeraJogo(zeraJogo);
		
		
		
	}

	

	

}
