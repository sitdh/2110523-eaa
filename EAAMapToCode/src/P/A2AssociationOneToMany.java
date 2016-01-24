package P;

import java.util.ArrayList;
import java.util.List;

public class A2AssociationOneToMany extends AMaster {
	
	public List<B3AssociationOneToManyInput> listOfB3;
	
	public A2AssociationOneToMany() {
		listOfB3 = new ArrayList<B3AssociationOneToManyInput>();
	}
	
	public int getSumNumberOfBElements() {
		int totalNumberOfElements = 0;
		
		for(B3AssociationOneToManyInput b : listOfB3) {
			totalNumberOfElements += b.getbVar1();
		}
		return totalNumberOfElements;
	}

}
