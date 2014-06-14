package bluehberger.cipher;

/**
 * Diese Interface ist f�r Verschl�sselungsklassen.
 * 
 * @author Gerald Bl�hberger
 */
public interface Cipher
{

	/**
	 * Verschl�sselt den text
	 * 
	 * @param text den man verschl�sseln will
	 * @return verschl�sselter Text
	 */
	public String encrypt(String text);

	/**
	 * Entschl�sselt den text
	 * 
	 * @param text den man entschl�sseln will
	 * @return entschl�sselter Text
	 */
	public String decrypt(String text);

}
