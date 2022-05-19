import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava {
	// Para usar métodos de la biblioteca Random, deberás crear una instancia de Random
	Random rand = new Random();
	char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 
		'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	/*Metodo que devuelva arreglo con 10 numeros aleatorios*/
	public ArrayList<Integer> getTenRolls() {  
        // Generate random integers in range 0 to 999
        int rand_int1;
	ArrayList<Integer> arrayInt = new ArrayList<Integer>(14);
	for(int i=0; i<=10; i++) {
		rand_int1 = rand.nextInt(21);
		arrayInt.add(rand_int1);
	}
	return arrayInt;
	}

	// Generar arreglo aleatorio de letras del alfabeto
	public char getRandomLetter() {
		int num = getNumberRandom();
		char letter = alfabeto[num];
		// System.out.println(alfabeto[num]);
		return letter;
	}

	// Generar numero aleatorio 
	public int getNumberRandom() {
	int num_aleatorio = rand.nextInt(26);
	return num_aleatorio;
	}

	// Generar cadena de 8 caracteres - String
	public char[] generatePassword() {
	char[] letterChar = new char[8];
	for(int i=0;i<8;i++) {
		letterChar[i]=getRandomLetter();
	}
	return letterChar;
	}
	
	// Generar una matriz de passwords
	public void getNewPasswordSet(int longitud) {
	 System.out.println("Generate new passwords working");
	 String[][] matrizPasswords = new String[longitud][longitud];
	 for(int i=0; i<longitud;i++) {
		 for (int y=0; y < longitud; y++) {
      			matrizPasswords[i][y]=String.valueOf(generatePassword());
			System.out.println(matrizPasswords[i][y]);
    		}
	 }
	 System.out.println("..................... finish game");

	}
}
