package tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

import tutorial.Greeting;
import tutorial.GreetingServiceImpl;

public class GreetingServiceImplTest {

	@Test
	public void test() {
		GreetingServiceImpl SUT = new GreetingServiceImpl();
		Greeting hello = SUT.hello();
		assertEquals("Hello", hello.getGreeting());
		assertEquals("World", hello.getName());
	}

}
