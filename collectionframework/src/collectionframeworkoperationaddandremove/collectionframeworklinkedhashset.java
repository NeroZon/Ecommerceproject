package collectionframeworkoperationaddandremove;

import java.util.LinkedHashSet;
import java.util.Set;

public class collectionframeworklinkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> LHS = new LinkedHashSet<Integer> ();
		LHS.add(10);
		LHS.add(5);
		LHS.add(9);
		
		System.out.println(""+LHS);

		
		LHS.add(21);
		LHS.add(31);
		
		System.out.println(""+LHS);
		
		

	}

}
