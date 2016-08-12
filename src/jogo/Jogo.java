/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */

package jogo;

public abstract class Jogo {

	/*
	 * A classe vai ter um nome, preco, high_score, qtd_jogadas e qtd_zeradas
	 * que é caracteristica de um Jogo.
	 */

	private String nome;
	private double preco;
	private int high_score, qtd_jogadas, qtd_zeradas;

	public Jogo(String nome, double preco) {

		/* trata exceções de nome e de preço */

		this.nome = nome;
		this.preco = preco;

		this.high_score = 0;
		this.qtd_jogadas = 0;
		this.qtd_zeradas = 0;

		/* cria hashset de classificação de jogo */
	}


	public void atualizaMaiorScore(int novoHighScore) {
		if (novoHighScore > high_score) {
			this.high_score = novoHighScore;
		}
	}

	public void adicionaJogada() {
		qtd_jogadas++;
	}

	public void zeraJogo(boolean zera) {
		if (zera == true) {
			qtd_zeradas += 1;
		}

	}
	/* Getter e setters */

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getHigh_score() {
		return high_score;
	}

	public int getQtd_jogadas() {
		return qtd_jogadas;
	}

	public int getQtd_zeradas() {
		return qtd_zeradas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	
	
	
}
