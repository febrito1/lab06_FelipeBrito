package usuario;

import java.util.HashSet;
import java.util.Iterator;
import jogo.*;

import jogo.Jogo;

public abstract class Usuario {
	
	private String nome, login;
	private double carteira = 0;
	private int x2p;
	private HashSet<Jogo> listaJogos;
	
	
	public Usuario(String nome, String login){
		
		/*trata exceções*/
		
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
	
	
	public boolean verificaDinheiro(double preco){
		
		double verificaDisponivel = carteira - preco;
		
		if(verificaDisponivel < 0){
			return true;
		}
		return false;
	}
	
	public void atualizaCarteira(double preco){
		double novoValor = carteira - preco;
		setCarteira(novoValor);
	}
	
	
	public void calculax2pCompra(double precoJogo, int x2pTipo){
		
		this.x2p += (int) precoJogo * x2pTipo;
		
	}
	
	public int registraJogada(String nomeJogo, int score, boolean zerou){
		Jogo jogo = this.getJogo(nomeJogo);
		
		int x2p = jogo.registraJogada(score, zerou);
		
		this.x2p += x2p;
		
		return x2p;

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


	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", carteira=" + carteira + ", x2p=" + x2p
				+ ", listaJogos=" + listaJogos + "]";
	}

	
	
	
	
}
