package P;

public class A4DependencyCarRentalService {
	
	public B4DependencyCarForRent rentCar;
	
	public A4DependencyCarRentalService() {
		
	}

	public B4DependencyCarForRent getRentCar() {
		return rentCar;
	}

	public void setRentCar(B4DependencyCarForRent rentCar) {
		this.rentCar = rentCar;
	}
	
	public String getCarBrand() {
		return rentCar.getCarBrand();
	}
	
	public String getCardEngineName() {
		return rentCar.getCarEngineName();
	}

}
