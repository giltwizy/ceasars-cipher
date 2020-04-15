package CeasarCipher;

public class Main {	

	public static void main(String[] args) {
		
		String message = "how are you doing yesterday";
		int offset = 12;
		
		
		CaesarsCipher ceasarCipher = new CaesarsCipher();
		
		String cipheredMessage = ceasarCipher.cipher(message, offset);
		
		System.out.println("Original message: "+ message);
		System.out.println("Offset: "+ offset);
		System.out.println("Cipher message: "+cipheredMessage);

	}

}
