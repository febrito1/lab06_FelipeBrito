/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */


package p2CG;

public abstract class Jogo {
	
/* A classe vai ter um nome, preco, high_score, qtd_jogadas e qtd_zeradas 
 * que é caracteristica de um Jogo. */
	
	
	private String nome;
	private double preco;
	private int high_score, qtd_jogadas, qtd_zeradas;
	
	
	public Jogo(String nome, double preco){
		
		/* trata exceções de nome e de preço*/
		
		
		this.nome = nome;
		this.preco = preco;
		
		/*cria hashset de classificação de jogo*/
	}
	
	public Jogo(){
	}
	
	
	
}
