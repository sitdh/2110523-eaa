package P;

import java.util.ArrayList;
import java.util.List;

public class A3 extends AMaster {
	
	public List<B3> listOfB3;
	
	public A3() {
		listOfB3 = new ArrayList<B3>();
	}
	
	public int getSumNumberOfBElements() {
		int totalNumberOfElements = 0;
		
		for(B3 b : listOfB3) {
			totalNumberOfElements += b.getbVar1();
		}
		return totalNumberOfElements;
	}

}
