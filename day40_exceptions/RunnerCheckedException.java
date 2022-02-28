package day40_exceptions;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailCheckedException {
		String email="kubilay@gomail.com";
		
		
		mailDogrula(email);

	}

	private static void mailDogrula(String email) throws InvalidEmailCheckedException {
		if (email.contains("gmail@com")|| email.contains("@hotmail.com")) {
			System.out.println("mailiniz basariyla kaydedildi.");
		}else {
			throw new InvalidEmailCheckedException("email uygun degil");
		}
		
	}

}
