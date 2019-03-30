package child_class;

import behavior_class.FlyWithWings;
import behavior_class.Quack;
import parent_class.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
		super(new FlyWithWings(), new Quack());
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}