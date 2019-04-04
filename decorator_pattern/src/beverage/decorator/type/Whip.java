package beverage.decorator.type;

import beverage.Beverage;
import beverage.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .50 + beverage.cost();
	}
}
