package allThingsLoop;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		int a = 10;
		do{
			
			System.out.println("Hey hi planet earth, loop is done!"); //If above While loop was done then we don't get print out
			                                                           //because condition got triggered 
		} while(a < 10);  /*Condition is equal to true 
	   but in Do While Loop it will be executed at least once regardless of initial condition is true or NOT so we get print out*/
	}

}
