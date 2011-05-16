package bundle1.tests;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import bundle1.privateapi.PrivateB;

public class PrivateBTest {
	
	private static PrivateB b;
	
	@BeforeClass
	public static void setup(){
		b = new PrivateB();
	}
	
	@Test
	public void testZero(){
		String status =b.getStatus(0);
		Assert.assertEquals("zero not returned", status, "zero");
	}

	@Test
	public void testPositive(){
		String status =b.getStatus(10);
		Assert.assertEquals("+ve not returned", status, "+ve");
	}

	@Test
	public void testNegative(){
		String status =b.getStatus(-10);
		Assert.assertEquals("-ve not returned", status, "-ve");
	}
}
