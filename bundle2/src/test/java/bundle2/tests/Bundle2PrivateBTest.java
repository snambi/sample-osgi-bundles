package bundle2.tests;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import bundle2.privateapi.PrivateB;

public class Bundle2PrivateBTest {
	
	private static PrivateB b;
	
	@BeforeClass
	public static void setUp(){
		b = new PrivateB();
	}

	@Test
	public void getValueZero(){
		String result = b.getValue(0);
		Assert.assertEquals("zero not returned", result, "ZERO");
	}
	
	@Test
	public void getValuePositive(){
		String result = b.getValue(10);
		Assert.assertEquals("+ve not returned", result, "POSITIVE");
	}

	@Test
	public void getValueNegative(){
		String result = b.getValue(-10);
		Assert.assertEquals("-ve not returned", result, "NEGATIVE");
	}
}
