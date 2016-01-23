package P;

public class A2AssociationOneToOne extends AMaster {
	
	public B2 linkB2;
	
	public A2AssociationOneToOne() {
		
	}
	
	public int getSumationOfB2() {
		return linkB2.getSummationOfVar1andVar2();
	}

}
