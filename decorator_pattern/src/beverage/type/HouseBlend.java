package beverage.type;

import beverage.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super.description = "houseblend";
	}

	@Override
	public double cost() {
		return .89;
	}
	
}
