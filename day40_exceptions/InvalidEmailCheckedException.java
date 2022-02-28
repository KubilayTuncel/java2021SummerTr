package day40_exceptions;

public class InvalidEmailCheckedException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //java Exception larin tekrarsiz olmasi icin her exception'a uniqe bir kod verir.

	InvalidEmailCheckedException(String message){
		super(message);
	}

}
