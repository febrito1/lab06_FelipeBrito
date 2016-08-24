/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package exceptions;

public class NumberException extends Exception{
	
	
	public NumberException(){
		super("Número inválido.");
	}
	public NumberException(String mensagem){
		super(mensagem);
	}
	
}
