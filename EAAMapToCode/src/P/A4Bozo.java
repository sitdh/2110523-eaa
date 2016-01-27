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

	public B4BozoClothes getRentCar() {
		return cloth;
	}

	public void setRentCar(B4BozoClothes cloth) {
		this.cloth = cloth;
	}

}
