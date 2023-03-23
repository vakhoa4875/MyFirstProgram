package bro_code;

public class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("This fish is hunting the smaller fish.");
		
	}

	@Override
	public void flee() {
		System.out.println("This fish is hunted by bigger fish");
		
	}
	
	
}
