public class FelixCrypt {

	public static void main(String[] args) {
		
		final String secretKey = "halloinfo";
	     
		Cryptor enc = new AES();
		
	    String originalString = "hallo";
	    String encryptedString = enc.encrypt(originalString, secretKey) ;
	    String decryptedString = enc.decrypt(encryptedString, secretKey) ;
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}

}
