package parent_class;

import behavior_interface.FlyBehavior;
import behavior_interface.QuackBehavior;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public Duck(FlyBehavior fly, QuackBehavior quack) {
		this.flyBehavior = fly;
		this.quackBehavior = quack;
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("swim...");
	}
}
