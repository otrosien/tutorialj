package tutorial;

final class GreetingServiceImpl implements GreetingService {

	@Override
	public Greeting hello() {
		Greeting g = new Greeting();
		g.setGreeting("Hello");
		g.setName("World");
		return g;
	}

}
