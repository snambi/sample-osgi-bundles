package bundle1.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PublicATest.class, PrivateBTest.class})
public class Bundle1AllTests {
	// Why do we need this class???
}
