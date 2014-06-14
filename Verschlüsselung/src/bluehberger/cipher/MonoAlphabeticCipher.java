package bluehberger.cipher;

public class MonoAlphabeticCipher implements Cipher
{

	private static final String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	private String secretAlphabet;

	public MonoAlphabeticCipher()
	{
		secretAlphabet = alphabet;
	}

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
