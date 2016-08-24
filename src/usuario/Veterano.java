/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package usuario;


import jogo.Jogo;

public class Veterano extends Usuario{
	
	public Veterano(String nome, String login) throws Exception{
		super(nome, login);
		
	}
	
	
	public void compraJogo(Jogo jogo) throws Exception{	
			 
		if(super.verificaListaJogo(jogo)){
			new Exception("Você já possui o jogo na sua lista.");
		}
		double precoDesconto = jogo.getPreco() - jogo.getPreco() * 0.20;
		if(super.verificaDinheiro(precoDesconto)){
			new Exception("Você não possui dinheiro suficiente para efetuar a compra.");
		}
		
		somavalorJogo(jogo.getPreco());
		super.x2pCompra(calculax2pCompra(jogo.getPreco()));
		super.adicionaJogo(jogo);
		
	}

	
	public int calculax2pCompra(double precoJogo){
	
		int x2p = (int) (precoJogo * 15);	
		return x2p;
	}


	@Override
	public String toString() {
		return super.getLogin() + "/n" 
	           + super.getNome() + "- Jogador Veterano \n"
	           + "Lista de Jogos: /n"
	           + super.toString();
		
	}
	
	
}
