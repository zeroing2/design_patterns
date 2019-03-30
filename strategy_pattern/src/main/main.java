package main;

import behavior_class.FlyRocketPowered;
import child_class.MallardDuck;
import child_class.ModelDuck;
import parent_class.Duck;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
