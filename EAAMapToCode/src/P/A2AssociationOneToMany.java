package P;

import java.util.ArrayList;
import java.util.List;

public class A2AssociationOneToMany extends AMaster {
	
	public List<B2AssociationOneToManyInput> listOfB3;
	
	public A2AssociationOneToMany() {
		listOfB3 = new ArrayList<B2AssociationOneToManyInput>();
	}
	
	public int getSumNumberOfBElements() {
		int totalNumberOfElements = 0;
		
		for(B2AssociationOneToManyInput b : listOfB3) {
			totalNumberOfElements += b.getbVar1();
		}
		return totalNumberOfElements;
	}

}
