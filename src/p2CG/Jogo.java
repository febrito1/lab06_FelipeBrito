/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */


package p2CG;

public abstract class Jogo {
	
/* A classe vai ter um nome, preco, high_score, qtd_jogadas e qtd_zeradas 
 * que � caracteristica de um Jogo. */
	
	
	private String nome;
	private double preco;
	private int high_score, qtd_jogadas, qtd_zeradas;
	
	
	public Jogo(String nome, double preco){
		
		/* trata exce��es de nome e de pre�o*/
		
		
		this.nome = nome;
		this.preco = preco;
		
		/*cria hashset de classifica��o de jogo*/
	}
	
	public Jogo(){
	}
	
	
	
}
