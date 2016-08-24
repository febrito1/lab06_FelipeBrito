/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package usuario;

import java.util.HashSet;
import exceptions.*;
import jogo.Jogo;

public abstract class Usuario {
	
	private String nome, login;
	private double carteira = 0;
	private int x2p;
	private double valorTotalJogos = 0;
	private HashSet<Jogo> listaJogos;
	
	
	public Usuario(String nome, String login) throws Exception{
		
		Excecoes.exceptionString(nome);
		Excecoes.exceptionString(login);
		
		this.nome = nome;
		this.login = login;
		listaJogos = new HashSet<Jogo>();
		this.x2p = 0;
		
	}

	public boolean adicionaJogo(Jogo jogo){
		listaJogos.add(jogo);
		return true;
	}
	
	public boolean adicionaDinheiro(double dinheiro){
		/* trata excessão (pode retornar falso)*/
		
		this.carteira+= dinheiro;
		return true;
	}


	public boolean verificaListaJogo(Jogo jogo){
		
		for (Jogo jogoLista : listaJogos) {
			if(jogoLista.equals(jogo)){
				return true;
			}
		} return false;
	}
	
	
	public boolean verificaDinheiro(double preco) throws Exception{
		
		Excecoes.precoInvalido(preco);
		
		
		double verificaDisponivel = carteira - preco;
		
		if(verificaDisponivel < 0){
			return true;
		}
		atualizaCarteira(preco);
		return false;
	}
	
	public void atualizaCarteira(double preco){
		double novoValor = carteira - preco;
		setCarteira(novoValor);
	}
	
	
	public abstract int calculax2pCompra(double precoJogo);

	public void x2pCompra(int x2pCompra){
		
		this.x2p += x2pCompra;
	}
	
	public void registraJogada(String nomeJogo, int score, boolean zerou)throws NumberException{
		/*nome , score */
		
		
		Jogo jogo = this.getJogo(nomeJogo);
		
		x2p += jogo.registraJogada(score, zerou);
		
	}
	

	public abstract void compraJogo(Jogo jogo) throws Exception;
	
	public double somavalorJogo(double preco){
		valorTotalJogos += preco;
		return valorTotalJogos;
	}
	
	
	public String getNome() {
		return nome;
	}


	public String getLogin() {
		return login;
	}


	public double getCarteira() {
		return carteira;
	}


	public HashSet<Jogo> getListaJogos() {
		return listaJogos;
	}

	public int getX2p() {
		return x2p;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}


	public void setListaJogos(HashSet<Jogo> listaJogos) {
		this.listaJogos = listaJogos;
	}

	public Jogo getJogo(String nome){
		
		Jogo procuraJogo = null;
		
		for (Jogo jogo : listaJogos) {
			if(jogo.getNome().equalsIgnoreCase(nome)){
				procuraJogo = jogo;
			}
		
		} return procuraJogo;
		
		
	}
	public String getSomaJogos(){
			return String.format("%.2f",valorTotalJogos);
	}
	
	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(carteira);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((listaJogos == null) ? 0 : listaJogos.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(valorTotalJogos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + x2p;
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
		Usuario other = (Usuario) obj;
		if (Double.doubleToLongBits(carteira) != Double.doubleToLongBits(other.carteira))
			return false;
		if (listaJogos == null) {
			if (other.listaJogos != null)
				return false;
		} else if (!listaJogos.equals(other.listaJogos))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valorTotalJogos) != Double.doubleToLongBits(other.valorTotalJogos))
			return false;
		if (x2p != other.x2p)
			return false;
		return true;
	}
	
	public String toString(){
		String listaJogo = "";
		if (listaJogos.size() > 0){
			for (Jogo jogo : listaJogos) {
				listaJogo += jogo.toString();
			}
		}else{
			 listaJogo = "O jogador não possui jogos.";
		}
		listaJogo += "\nTotal de preço dos jogos: R$ " + getSomaJogos();
		return listaJogo; 
	}
					
	
	
	
}
