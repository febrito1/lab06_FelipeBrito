/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package jogo;
import exceptions.*;

public class RPG extends Jogo {

	public RPG(String nome, double preco) throws Exception{
		
		super(nome, preco);
		
	}

	public int registraJogada(int score, boolean zeraJogo) throws NumberException{
		
		Excecoes.ScoreInvalido(score);
		super.adicionaJogada();
		super.atualizaMaiorScore(score); /*score max de 100.000*/
		super.zeraJogo(zeraJogo);
		int x2p = 10;
		return x2p;
	}

	public String toString(){
		
		return "\n+" + super.getNome() + "- RPG:\n" + super.toString();	
		
	}
	
}
