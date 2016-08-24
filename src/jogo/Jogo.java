/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */

package jogo;

import java.util.HashSet;

import enumarations.Jogabilidade;
import exceptions.*;
/*import exceptions.Exception;*/

public abstract class Jogo {

	/*
	 * A classe vai ter um nome, preco, high_score, qtd_jogadas e qtd_zeradas
	 * que é caracteristica de um Jogo.
	 */

	private String nome;
	private double preco;
	private int high_score, qtd_jogadas, qtd_zeradas;
	private HashSet<Jogabilidade> jogabilidade;

	public Jogo(String nome, double preco) throws Exception {

		Excecoes.exceptionString(nome);
		Excecoes.precoInvalido(preco);

		this.nome = nome;
		this.preco = preco;

		this.high_score = 0;
		this.qtd_jogadas = 0;
		this.qtd_zeradas = 0;
		
		
		jogabilidade = new HashSet<Jogabilidade>();

		/* cria hashset de classificação de jogo */
	}
	
	
	public boolean atualizaMaiorScore(int novoHighScore){
		
		if (novoHighScore > high_score) {
			this.high_score = novoHighScore;
			return true;
		} return false;
	}

	public void adicionaJogada() {
		qtd_jogadas++;
	}

	public boolean zeraJogo(boolean zera) {
		/*tratemento excecao*/
		if (zera == true) {
			qtd_zeradas += 1;
			return true;
		} return false;
	}
	
	public void adicionaJogabilidade(Jogabilidade novaJogabilidade) throws ObjetoException{
		
		jogabilidade.add(novaJogabilidade);
		
	}
	
	
	public abstract int registraJogada(int pontuacaoJogada, boolean zerou) throws NumberException;
	
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

	public void setNome(String nome) throws StringException {
		Excecoes.exceptionString(nome);
		this.nome = nome;
	}

	public void setPreco(double preco)throws Exception {
		this.preco = preco;
	}

	@Override
	public String toString(){
		return "==> Jogou " + getQtd_jogadas() + " vez(es)\n"
				+ "==> Zerou " + getQtd_zeradas() + " vez(es)\n"
				+ "==> Maior Score: " + getHigh_score();  
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + high_score;
		result = prime * result + ((jogabilidade == null) ? 0 : jogabilidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qtd_jogadas;
		result = prime * result + qtd_zeradas;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		if (high_score != other.high_score)
			return false;
		if (jogabilidade == null) {
			if (other.jogabilidade != null)
				return false;
		} else if (!jogabilidade.equals(other.jogabilidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (qtd_jogadas != other.qtd_jogadas)
			return false;
		if (qtd_zeradas != other.qtd_zeradas)
			return false;
		return true;
	}
	

	
	
	
}
