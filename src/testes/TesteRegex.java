package testes;

public class TesteRegex {

	public static void main(String[] args) {
		

	}

}

class ValidateInput{
	public static boolean validateFirstName (String firstName){
		return firstName.matches("[A-Z][a-zA-Z*]");
		
	}
}
