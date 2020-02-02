
public class Encrypter 
{
	public void encrypt (String userNumber)
	{
		//declare an array of size 4 to store the values in
		int userInputArray [] = new int [4];
		
		//for loop iterates through each index and converts it to an int
		for (int i = 0; i < 4; i++)
		{
			char digit = userNumber.charAt(i);
			//each index converts from char to int
			userInputArray [i] = Character.getNumericValue(digit);
		}
				
		//actually encrypt the number
		for (int i = 0; i < 4; i++)
		{
			//encrypts using the given directions
			//a temporary int is used to temporarily store the values while the operations are being applied
			//all new values are stored in original array
			int temporaryInt;
			temporaryInt = userInputArray[i];
			temporaryInt += 7;
			temporaryInt = temporaryInt % 10;
			userInputArray[i] = temporaryInt;
		}
		
		//this is swapping the first and third and second and fourth values
		//uses temporary value
		int temporary2 = 0;
		
		temporary2 = userInputArray[0];
		userInputArray [0] = userInputArray[2];
		userInputArray[2] = temporary2;
		
		temporary2 = userInputArray[1];
		userInputArray[1] = userInputArray[3];
		userInputArray[3] = temporary2;
		
		//prints out the final encrypted digits
		System.out.printf("Enryption: ");
		
		for (int i=0; i < 4; i++)
		{
			System.out.printf("%d", userInputArray[i]);
		}
		
		System.out.printf("%n");
	}
	
}
