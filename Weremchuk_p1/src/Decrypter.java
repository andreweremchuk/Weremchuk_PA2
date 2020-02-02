
public class Decrypter
{
	public void decrypt (String userNumber2)
	{
		//new array declaration of size 4 to store values in
		int userInputArray [] = new int [4];
		
		//for loop iterates through each index and converts it to an int
		for (int i = 0; i < 4; i++)
		{
			char digit = userNumber2.charAt(i);
			userInputArray [i] = Character.getNumericValue(digit);
		}
		
		//the decryption process is the opposite of the encryption process
		//first we begin by swapping the first and third and second and fourth values back to their original positions
		int temporary2 = 0;
		
		//a temporary variable is used to help swap the digits
		temporary2 = userInputArray[0];
		userInputArray [0] = userInputArray[2];
		userInputArray[2] = temporary2;
		
		temporary2 = userInputArray[1];
		userInputArray[1] = userInputArray[3];
		userInputArray[3] = temporary2;
		
		int decryptedNumber = 0;
				
		//attempt inverse mod operation
		System.out.printf("Decryption: ");
		for (int i = 0; i < 4; i++)
		{
			decryptedNumber = (userInputArray[i] - 7 + 10) % 10;
			System.out.printf("%d", decryptedNumber);
		}
	}

}
