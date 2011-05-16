package bundle2.tests;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import bundle2.publicapi.PublicA;

public class Bundle2PublicATest {
	
	private static PublicA a;
	
	@BeforeClass
	public static void setUp(){
		a = new PublicA();
	}

	@Test
	public void convertNullTest(){
		String result = a.convert(null);
		Assert.assertNotNull("result is null",  result);
	}
}
