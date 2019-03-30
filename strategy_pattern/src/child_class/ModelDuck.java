package child_class;

import behavior_class.FlyNoWay;
import behavior_class.Quack;
import parent_class.Duck;

public class ModelDuck extends Duck {

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		super(new FlyNoWay(), new Quack());
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ModelDuck");
	}

}
