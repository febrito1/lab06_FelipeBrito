/*Felipe Ricardo de Brito Ramos - 115210767 - TURMA: 1 */
package exceptions;

public class ObjetoException extends Exception{
	
	
	public ObjetoException() {
		super("Objeto inv�lido");
		
	}

	public ObjetoException(String mensagem) {
		super(mensagem);
		
	}
}
