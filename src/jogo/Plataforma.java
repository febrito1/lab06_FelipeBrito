package jogo;


public class Plataforma extends Jogo {

	
	public Plataforma(String nome, int preco){	
		super(nome,preco);
	}
	
	public int registraJogada(int score, boolean zeraJogo){
		// trata excecoes
		
		int novox2p = 0;
		super.adicionaJogada();
		super.atualizaMaiorScore(score);
		
		if(super.zeraJogo(zeraJogo)){
			novox2p = 20;
		}
		return novox2p;
	}
}
