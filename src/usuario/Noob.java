/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package usuario;


import exceptions.*;
import jogo.Jogo;

public class Noob extends Usuario{
	

	public Noob(String nome, String login) throws Exception{
		super(nome, login);
	}
	
	
	public void compraJogo(Jogo jogo) throws Exception{	
		
		if(super.verificaListaJogo(jogo)){
			new Exception("Jogo já existe na sua lista de jogos");
		}
		
		double precoDesconto = jogo.getPreco() - jogo.getPreco() * 0.10;
		if(super.verificaDinheiro(precoDesconto)){
			new Exception("Você não possui dinheiro suficiente.");
		}
		
		somavalorJogo(jogo.getPreco());
		super.x2pCompra(calculax2pCompra(jogo.getPreco()));
		super.adicionaJogo(jogo);
	}
	
	public int calculax2pCompra(double precoJogo){
		int x2p = (int) (precoJogo * 10);	
		return x2p;
	}


	@Override
	public String toString() {
		return super.getLogin() + "\n" 
	           + super.getNome() + "- Jogador Noob \n"
	           + "Lista de Jogos: \n"
	           + super.toString();
		
	}
	
}
