package jogo;

public class Luta extends Jogo {

	public Luta(String nome, double preco){
		
		super(nome,preco);
	}
	
	public int registraJogada(int score, boolean zeraJogo){
		
		int novoxp = 0;
		
		// trata excecoes
		super.adicionaJogada();
		
		if(super.atualizaMaiorScore(score)){
			int novox2p = score/1000;
		}
		super.zeraJogo(zeraJogo);
		
		return novoxp;
	}	
	
	
	
	
	
}
