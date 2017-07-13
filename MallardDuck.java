
public class MallardDuck extends Duck {

	@Override
	public String display() {

	
	return "Benim adım Mallard Duck!!!";
	
	}
	
	
	public MallardDuck() {

	flyBehavior = new FlyWithWings();
	quackBehavior = new Quack();
	
	}

}
