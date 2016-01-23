package P;

public class BMasterClass {
	
	public int bVar1;
	private int bVar2;
	protected String bVar3;
	
	public BMasterClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getbVar1() {
		return bVar1;
	}

	public void setbVar1(int bVar1) {
		this.bVar1 = bVar1;
	}

	public int getbVar2() {
		return bVar2;
	}

	public void setbVar2(int bVar2) {
		this.bVar2 = bVar2;
	}

	public String getbVar3() {
		return bVar3;
	}

	public void setbVar3(String bVar3) {
		this.bVar3 = bVar3;
	}
	
	public int getSummationOfVar1andVar2() {
		return this.bVar1 + this.bVar2;
	}

}
