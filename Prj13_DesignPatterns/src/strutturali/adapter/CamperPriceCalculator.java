package strutturali.adapter;

public class CamperPriceCalculator implements PriceCalculator {

	private int age;
	private int km;
	private int avgPrice = 7000;
	
	public CamperPriceCalculator(int age, int km) {
		this.age = age;
		this.km = km;
	}
	
	@Override
	public String calculatePrice() {
		return (avgPrice - (age * 100)-(km/100))+"€";
	}

}
