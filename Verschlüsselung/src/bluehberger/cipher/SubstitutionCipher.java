package bluehberger.cipher;

/**
 * Die Klasse SubstitutionCipher soll eine allgemeine Substitionsverschlüsselung
 * darstellen.
 * 
 * @author Gerald Blühberger
 */
public class SubstitutionCipher extends MonoAlphabeticCipher
{
	/**
	 * Erzeugt ein SubstitutionCipher Objekt
	 * 
	 * @param secretAlphabet
	 */
	public SubstitutionCipher(String secretAlphabet)
	{
		super.setSecretAlphabet(secretAlphabet);
	}

	@Override
	public void setSecretAlphabet(String secretAlphabet)
	{
		super.setSecretAlphabet(secretAlphabet);
	}

}
