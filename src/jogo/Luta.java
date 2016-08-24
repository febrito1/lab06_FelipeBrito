package jogo;

import exceptions.Excecoes;
import exceptions.NumberException;

public class Luta extends Jogo {

	public Luta(String nome, double preco) throws Exception{
		
		super(nome,preco);
	}
	
	public int registraJogada(int score, boolean zeraJogo) throws NumberException{
		
		Excecoes.ScoreInvalido(score);
		int novox2p = 0;
		super.adicionaJogada();	
		
		if(super.atualizaMaiorScore(score)){
			 novox2p = score/1000;
		}
		super.zeraJogo(zeraJogo);
		
		return novox2p;
	}	
	
	
	public String toString(){
		
		return "\n+" + super.getNome() + "- LUTA:\n" + super.toString();	
		
	}
	
	
}
