/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package loja;

import java.util.HashSet;

import exceptions.*;
import usuario.*;
import jogo.*;

public class Loja {

	private HashSet<Usuario> listaUsuarios;
	
	
	public Loja(){
		listaUsuarios = new HashSet<Usuario>();
	}
	
	
	public boolean adicionaUsuario(Usuario novoUsuario){
		
		if(novoUsuario == null){
			System.out.println("Não se pode adicionar usuario null.");
			return false;	
		}else{
			return listaUsuarios.add(novoUsuario);
			
		}
	}
	
	
	public boolean adicionaDinheiro(String loginUsuario, double preco){
		
		try{
			
			Usuario usuario = ProcuraLogin(loginUsuario);
			verificaNull(usuario);
			usuario.adicionaDinheiro(preco);
			return true;
		
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}	
	
	


	private Usuario ProcuraLogin(String loginUsuario){
		Usuario procuraUsuario = null;
		for (Usuario user : listaUsuarios) {
			if(user.getLogin().equals(loginUsuario)){
				procuraUsuario = user;
			}
		} return procuraUsuario;
		
	}
	
	public boolean compraJogo(Jogo novoJogo, String login){
		
		try{
			Usuario usuario = ProcuraLogin(login);
			verificaNull(usuario);
			if(usuario.verificaDinheiro(novoJogo.getPreco()) == true){
				new Exception("Usuario não possui dinheiro suficiente. Insira dinheiro para efetuar a compra!");
				return false;
		}
		
		usuario.compraJogo(novoJogo);
		return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		
		
		
	}
	
	
	private void verificaNull(Usuario usuario)throws ObjetoException{
		if(usuario == null){
			new ObjetoException("Esse login não existe.");
		}
	
	}
	
	public String imprimeInformaces(Usuario usuario) throws Exception{
	
		verificaNull(usuario);
		String loginUsuario = usuario.getLogin();
		ProcuraLogin(loginUsuario);
		String informacoes = "== Central P2-CG == \n";	
		informacoes += usuario.toString();
		
		
		return informacoes;		
		}
	
	public boolean upgrade(String login){
		try{
			Usuario atualiza_usuario = ProcuraLogin(login);
			verificaNull(atualiza_usuario);
		
			if(atualiza_usuario.getClass() != Veterano.class && atualiza_usuario.getX2p() < 1000){
				System.out.println("O usuário não possui os pontos suficientes ou já é Veterano.");
				return false;
			}
			
			Veterano novo_usuario = new Veterano(atualiza_usuario.getLogin(), atualiza_usuario.getNome());
			novo_usuario.setCarteira(atualiza_usuario.getCarteira());
			novo_usuario.setX2p(atualiza_usuario.getX2p());
			novo_usuario.setListaJogos(atualiza_usuario.getListaJogos());
			
			
			removeUsuario(atualiza_usuario);	
			return listaUsuarios.add(novo_usuario);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		} 
	}
	
	
	
	public void removeUsuario(Usuario recebeUsuario){
		
		listaUsuarios.remove(recebeUsuario);
		
	}
	



	public HashSet<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}


	public void setListaUsuarios(HashSet<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaUsuarios == null) ? 0 : listaUsuarios.hashCode());
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
		Loja other = (Loja) obj;
		if (listaUsuarios == null) {
			if (other.listaUsuarios != null)
				return false;
		} else if (!listaUsuarios.equals(other.listaUsuarios))
			return false;
		return true;
	}
	
	
	
	
	}
	
	
	
