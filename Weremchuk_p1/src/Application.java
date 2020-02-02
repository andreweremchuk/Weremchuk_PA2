import java.util.Scanner;

public class Application {
	public static void main (String[] args)
	{
		//The beginning of this program will prompt the user what to do
		System.out.println("This program will take a 4 digit input and encrypt it.");
		System.out.println("Please enter the four digit number: ");
		//scans the input in as a string and will be converted to 4 ints later
		Scanner sc = new Scanner(System.in);
		String userNumber = sc.nextLine();
		
		//declare an object of the other class/method
		Encrypter encrypterObject = new Encrypter();
		encrypterObject.encrypt(userNumber);
		
		//prompts the user with instructions
		System.out.println("This program will take a 4 digit input and then decrypt it.");
		System.out.println("Please enter the four digit number: ");
		String userNumber2 = sc.nextLine();
		
		//declare an object of the other class/method
		Decrypter decrypterObject = new Decrypter();
		decrypterObject.decrypt(userNumber2);
	}
}
