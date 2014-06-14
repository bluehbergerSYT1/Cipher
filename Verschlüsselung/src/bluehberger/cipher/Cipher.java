package bluehberger.cipher;

/**
 * Diese Interface ist für Verschlüsselungsklassen.
 * 
 * @author Gerald Blühberger
 */
public interface Cipher
{

	/**
	 * Verschlüsselt den text
	 * 
	 * @param text den man verschlüsseln will
	 * @return verschlüsselter Text
	 */
	public String encrypt(String text);

	/**
	 * Entschlüsselt den text
	 * 
	 * @param text den man entschlüsseln will
	 * @return entschlüsselter Text
	 */
	public String decrypt(String text);

}
