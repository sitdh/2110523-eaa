package P;

public class A2 extends AMaster {
	
	public B2 linkB2;
	
	public A2() {
		
	}
	
	public int getSumationOfB2() {
		return linkB2.getSummationOfVar1andVar2();
	}

}
