
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void performQuack(){
		
		
		quackBehavior.quack();
		
		
	}
	
	public void performFly() {
		
		
		flyBehavior.fly();
		
	}
	
	
	public void swim() {
		System.out.println("All ducks can fly");
	}
	
	
	public abstract String display();
	
	
}
