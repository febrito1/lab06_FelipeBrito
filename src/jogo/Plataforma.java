/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package jogo;

import exceptions.*;



public class Plataforma extends Jogo {

	
	public Plataforma(String nome, double preco) throws Exception{	
		super(nome,preco);
	}
	
	public int registraJogada(int score, boolean zeraJogo) throws NumberException{
		Excecoes.ScoreInvalido(score);
		
		int novox2p = 0;
		super.adicionaJogada();
		super.atualizaMaiorScore(score);
		
		if(super.zeraJogo(zeraJogo)){
			novox2p = 20;
		}
		return novox2p;
	}
	
	
	public String toString(){
		
		return "\n+" + super.getNome() + "- PLATOFORMA:\n" + super.toString();	
	}
	
}
