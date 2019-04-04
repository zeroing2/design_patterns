package main;

import beverage.Beverage;
import beverage.decorator.type.Mocha;
import beverage.decorator.type.Whip;
import beverage.type.Espresso;
import beverage.type.HouseBlend;

public class main {

	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		Beverage beverage2 = new HouseBlend();
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		beverage1 = new Whip(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
	}

}
