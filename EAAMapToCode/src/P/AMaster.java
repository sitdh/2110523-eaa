package P;

public class AMaster {

	public int aVar1;
	private int aVar2;
	protected String aVar3;
	
	public AMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getaVar1() {
		return aVar1;
	}

	public void setaVar1(int aVar1) {
		this.aVar1 = aVar1;
	}

	public int getaVar2() {
		return aVar2;
	}

	public void setaVar2(int aVar2) {
		this.aVar2 = aVar2;
	}

	public String getaVar3() {
		return aVar3;
	}

	public void setaVar3(String aVar3) {
		this.aVar3 = aVar3;
	}

	public int getSummationOfVar1andVar2() {
		return getaVar1() + getaVar2();
	}
}
