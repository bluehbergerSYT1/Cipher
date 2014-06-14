package bluehberger.cipher;

/**
 * Die Klasse MonoAlphabeticCipher setzt das Geheimalphabet immer auf das
 * Ausgangsalphabet (abcdefghijklmnopqrstuvwxyzäöüß) wodurch bei dieser Klasse
 * keine Verschlüsselung stattfindet. Trotzdem können die beiden Methoden
 * encrypt und decrypt mit jedem Geheimalphabet arbeiten, da ja eine Subklassen
 * diese Methoden nicht implementieren, das Geheimalphabet je nach Klasse aber
 * anders gesetzt wird.
 * 
 * @author Gerald Blühberger
 */
public class MonoAlphabeticCipher implements Cipher
{

	private static final String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	private String secretAlphabet;

	/**
	 * Erzeugt ein MonoAlphabeticCipher Objekt
	 */
	public MonoAlphabeticCipher()
	{
		secretAlphabet = alphabet;
	}

	/**
	 * setzt das secetAlphabet
	 * 
	 * @param secretAlphabet geheimes Alphabet
	 */
	protected void setSecretAlphabet(String secretAlphabet)
	{
		secretAlphabet = secretAlphabet.toLowerCase();

		String newSecret = "";

		for (int i = 0; i < this.secretAlphabet.length(); i++)
		{
			if(i < secretAlphabet.length())
				newSecret += secretAlphabet.charAt(i);
			else
				newSecret += this.secretAlphabet.charAt(i);
		}
		this.secretAlphabet = newSecret;
	}

	@Override
	public String encrypt(String text)
	{

		String encrypt = "";
		for (int i = 0; i < text.length(); i++)
		{
			char c = text.toLowerCase().charAt(i);
			int index = alphabet.indexOf(c);

			if(index == -1)
			{
				encrypt += c;
			}
			else
			{
				Character c2 = secretAlphabet.charAt(index);
				if(Character.isUpperCase(text.charAt(i)))
					encrypt += c2.toString().toUpperCase();
				else
					encrypt += c2;
			}

		}

		return encrypt;
	}

	@Override
	public String decrypt(String text)
	{
		String decrypt = "";
		for (int i = 0; i < text.length(); i++)
		{
			char c = text.toLowerCase().charAt(i);
			int index = secretAlphabet.indexOf(c);

			if(index == -1)
			{
				decrypt += c;
			}
			else
			{
				Character c2 = alphabet.charAt(index);
				if(Character.isUpperCase(text.charAt(i)))
					decrypt += c2.toString().toUpperCase();
				else
					decrypt += c2;
			}

		}

		return decrypt;
	}

}
