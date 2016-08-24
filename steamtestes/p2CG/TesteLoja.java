/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package p2CG;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jogo.*;
import usuario.*;
import loja.*;

public class TesteLoja {

	private Jogo mario;
	private Jogo StreetFight;
	private Usuario joaozinho;
	private Usuario bot;
	private Loja americanas;
	
	@Before
	public void setUp() throws Exception {
		americanas = new Loja();	
		StreetFight = new Luta("StreetFight", 80.00);
		joaozinho = new Noob("joaozinho", "JoazinhoMoral");
		mario = new RPG("Mario", 20.00);
		
		bot = new Noob("Mano","SOUBRONZE");	
	}

	@Test
	public void testAdicionaUsuario() throws Exception {
				
		assertTrue(americanas.adicionaUsuario(joaozinho)); 
		assertFalse(americanas.adicionaUsuario(joaozinho));
		assertTrue(americanas.adicionaUsuario(bot));
				
	}

	
	@Test
	public void testAdicionaDinheiro() throws Exception{
	
		americanas.adicionaUsuario(joaozinho);
		americanas.adicionaUsuario(bot);
		
		americanas.adicionaDinheiro("JoazinhoMoral", 20.00);
		americanas.adicionaDinheiro("SOUBRONZE", 5.00);
		
		assertEquals(20.00,joaozinho.getCarteira(),0.5);
		assertNotEquals(15.00,joaozinho.getCarteira(),0.5);	
	}
	
	
	@Test
	public void testeCompraJogo() throws Exception{
		
		americanas.adicionaUsuario(joaozinho);
		americanas.adicionaUsuario(bot);
		
		americanas.adicionaDinheiro("JoazinhoMoral", 25.00);
		americanas.adicionaDinheiro("SOUBRONZE", 5.00);
		
		assertTrue(americanas.compraJogo(mario, "JoazinhoMoral"));
		assertFalse(americanas.compraJogo(mario, "SOUBRONZE"));
		assertEquals("0,00",bot.getSomaJogos());	
		
	}
	
	@Test
	public void testex2p() throws Exception{
		
		americanas.adicionaUsuario(joaozinho);
		americanas.adicionaDinheiro("JoazinhoMoral", 80.00);
		americanas.compraJogo(StreetFight, "JoazinhoMoral");
		assertEquals(800, joaozinho.getX2p());
		joaozinho.registraJogada("StreetFight", 80000, false);
		assertEquals(880, joaozinho.getX2p());
		
	}
	
	
	@Test
	public void testeUpgrade() throws Exception{
		americanas.adicionaUsuario(joaozinho);
		americanas.adicionaDinheiro("JoazinhoMoral", 80.00);
		americanas.compraJogo(StreetFight, "JoazinhoMoral");
		joaozinho.registraJogada("StreetFight", 1000000, false);
		
		americanas.upgrade("JoazinhoMoral");	
		
	}
	
	
	
	
	
	
	@Test
	public void testToString() throws Exception{
		
		americanas.adicionaUsuario(joaozinho);
		americanas.adicionaDinheiro("JoazinhoMoral", 80.00);
		americanas.compraJogo(StreetFight, "JoazinhoMoral");
		joaozinho.registraJogada("StreetFight", 80000, false);
		
		americanas.adicionaDinheiro("JoazinhoMoral", 20.00);
		americanas.compraJogo(mario, "JoazinhoMoral");
		assertEquals("== Central P2-CG == \n"
				+ "JoazinhoMoral\n"
				+ "joaozinho- Jogador Noob \n"
				+ "Lista de Jogos: \n"
				+"\n"
				+ "+StreetFight- LUTA:\n"
				+ "==> Jogou 1 vez(es)\n"
				+ "==> Zerou 0 vez(es)\n"
				+ "==> Maior Score: 80000\n"
				+ "+Mario- RPG:\n"
				+ "==> Jogou 0 vez(es)\n"
				+ "==> Zerou 0 vez(es)\n"
				+ "==> Maior Score: 0\n"
				+ "Total de preço dos jogos: R$ 100,00", americanas.imprimeInformaces(joaozinho));
		
	}
	
	
	
}
