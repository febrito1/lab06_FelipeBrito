/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package exceptions;

import java.util.HashSet;
import jogo.*;
import usuario.*;
import enumarations.*;

public class Excecoes {
	
	public Excecoes(){

	}
	
	
	public static void exceptionString(String recebeString) throws StringException{
		
		if(recebeString == null || recebeString.trim().isEmpty()){
			throw new StringException();	
		} 
	}	
	public static void ScoreInvalido(int recebeInteiro) throws NumberException{
		if(recebeInteiro < 0){
			throw new NumberException();
		}
	}
	
	
	public static void precoInvalido(double preco) throws NumberException{
		if(preco < 0){
			throw new NumberException("Preco nao pode ser menor que zero.");
		}
	}
	
	public static void verificaJogabilidade(Jogabilidade verificaJogabilidade)throws ObjetoException{
		if(verificaJogabilidade == null){
			throw new ObjetoException("Jogabilidade não pode ser nula.");
		}
	}
	
	 
	
}	