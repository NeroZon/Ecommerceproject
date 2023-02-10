package collectionframeworkoperationaddandremove;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(100);
		number.add(200);
		number.remove(1);
	    number.add(200);
	    number.add(350);
	    
		
		System.out.println(""+number);

	}

}
