package strutturali.adapter;

public class Adapter implements PriceCalculator {

	PriceCalculator USAPriceCalculator; 
	
	public Adapter(PriceCalculator calculator) {
		this.USAPriceCalculator = calculator;
	}
	
	@Override
	public String calculatePrice() {
		//si,maèbrutto, TODO perchè è brutto
		return USAPriceCalculator.calculatePrice().replace("€", "$");
	
	}

}
