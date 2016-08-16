package usuario;

import enumarations.usuarioTipo;
import jogo.*;

public class Noob extends Usuario{
	
	private double qtdx2pInicial = 0;

	public Noob(String nome, String login){
		super(nome, login);
	}
	
	
	public boolean compraJogo(Jogo jogo){	
		/* trata exceções
		 * numero inválido
		 * nome inválido */
		/*verifica se o jogo existe na lista de jogos*/
		if(super.verificaListaJogo(jogo)){
			return false;
		}
		
		/*atualizacao x2p*/
		
		
		
		
		/*O preco com o desconto de 10%*/
		double precoDesconto = jogo.getPreco() - jogo.getPreco() * usuarioTipo.Noob.getDesconto();
		/* verifica se o valor da carteira é suficiente pra comrpar o jogo*/
		if(super.verificaDinheiro(precoDesconto)){
			return false;
		}
		/*atualiza o valor da carteira depois de descontado o preco com desconto*/
		super.atualizaCarteira(precoDesconto);
		return true;
	}
	
	
}
