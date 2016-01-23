package P;

public class ABController {
	
	public ABController() {
	
	}
	
	public void testA2B2Association() {
		
		B2 bb = new B2();
		bb.setbVar1(20);
		bb.setbVar2(10);
		
		A2 aa = new A2();
		aa.linkB2 = bb;
		
		assert bb.getSummationOfVar1andVar2() == aa.getSumationOfB2();
		System.out.println(String.format("Total of value: %d", aa.getSumationOfB2()));
		
	}
	
	public void testA3B3Association1toMany() {
		
		A3 a3 = new A3();
		
		for(int i = 0; i < 2; i++) {
			B3 bb1 = new B3();
			bb1.setbVar1(10 * (i + 1));
			bb1.setbVar2(20);
			a3.listOfB3.add(bb1);
		}
		
		int summationOfVar1 = 0;
		
		for(B3 b : a3.listOfB3) {
			System.out.println(String.format("Variable 1 has number %d", b.getbVar1()));
			summationOfVar1 += b.getbVar1();
		}
		
		System.out.println(String.format("Total of summation: %d", summationOfVar1));
		
	}

	public static void main(String[] args) {
		
		ABController abController = new ABController();
		
		abController.testA2B2Association();
		abController.testA3B3Association1toMany();

	}

}
