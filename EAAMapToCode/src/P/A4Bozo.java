package P;

public class A4Bozo {
	
	private B4BozoClothes cloth;
	
	public A4Bozo() {
		
	}
	
	public String getBozoClothBrand() {
		return cloth.getClothBrand();
	}
	
	public String getBozoClothDetails() {
		return cloth.getClothesInformation();
	}

	public B4BozoClothes getBozoClothes() {
		return cloth;
	}

	public void setBozoClothes(B4BozoClothes cloth) {
		this.cloth = cloth;
	}

}
