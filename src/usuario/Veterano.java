package usuario;

import enumarations.usuarioTipo;
import jogo.Jogo;

public class Veterano extends Usuario{
	
	private double qtdx2Incial;
	
	public Veterano(String nome, String login){
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
		/*atualiza x2p*/
		
		super.calculax2pCompra(jogo.getPreco(), usuarioTipo.Veterano.getX2pPreco());
		
		/*O preco com o desconto de 10%*/
		
		double precoDesconto = jogo.getPreco() - jogo.getPreco() * usuarioTipo.Veterano.getDesconto();
		
		/* verifica se o valor da carteira é suficiente pra comrpar o jogo*/
		if(super.verificaDinheiro(precoDesconto)){
			return false;
		}
	
		/*atualiza o valor da carteira depois de descontado o preco com desconto*/
		super.atualizaCarteira(precoDesconto);
		return true;
	}

}
