
public interface Cryptor {
	
	public void setKey(String myKey);
	
	public String encrypt(String strToEncrypt, String secret);
	
    public String decrypt(String strToDecrypt, String secret);
	
}
