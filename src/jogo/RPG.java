package jogo;

public class RPG extends Jogo {

	public RPG(String nome, double preco){
		
		super(nome, preco);
		
	}

	public int registraJogada(int score, boolean zeraJogo){
		// trata excecoes
		super.adicionaJogada();
		super.atualizaMaiorScore(score); /*score max de 100.000*/
		super.zeraJogo(zeraJogo);
		int x2p = 10;
		return x2p;
	}

	

	

}
