package allThingsLoop;

public class ForEachLoop {

	public static void main(String[] args) {
	int tesla[]= {1,2,3,4,5,6,7};   //We made an array called TESLA using array initializer 
	int total =0; //Variable named TOTAL and set equal to ZERO 
		
	for(int i: tesla) {             
	total+=i; 
	}

	System.out.println(total); 
		
	}

}
