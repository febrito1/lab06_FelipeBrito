/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package exceptions;

public class StringException extends Exception{
	

	public StringException(){
		super("O nome não pode vazio ou nulo.");
	}
	
	public StringException(String mensagem){
		super(mensagem);
	}

}

		
	
