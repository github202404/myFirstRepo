package testPackage;
import java.util.Scanner;

public class SimpleHelloWorld {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		SimpleHelloWorld shw = new SimpleHelloWorld();
		String inputChar;
		int i;
		
		for (i = 0; i < 5; i++) {
			System.out.print("Guess a character:  ");			
			inputChar = scan1.nextLine();
			
			if (shw.getWhatever(inputChar).equals("correct")) {
				System.out.println("Bingo");
				break;
			}
		}
		
		if (i == 5) {
			System.out.print("Sorry, this is done...");
		}
		
		scan1.close();
	}
	
	public String getWhatever(String s){
        String sResult;

		if (s.equals("a")) {
        	sResult = "correct";
        } else {
        	sResult = "not correct";
        }	

		return sResult;
		
    }
}
