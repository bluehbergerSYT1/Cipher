package bluehberger.cipher;

/**
 * Die Klasse SubstitutionCipher soll eine allgemeine Substitionsverschl�sselung
 * darstellen.
 * 
 * @author Gerald Bl�hberger
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
