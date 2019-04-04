package beverage.type;

import beverage.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		super.description = "espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	
}
