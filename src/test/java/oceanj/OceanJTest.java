package oceanj;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OceanJTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		OceanjStart.main(new String[] {"arg1", "arg2"});
	}

}
