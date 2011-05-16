package bundle1.tests;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import bundle1.publicapi.PublicA;

public class PublicATest {
	
	static PublicA a;
	
	@BeforeClass
	public static void setUp(){
		a = new PublicA();
		System.out.println("TestCase setup complete");
	}
	
	@Test
	public void getValueNullTest(){
		String result = a.getValue("");
		Assert.assertEquals("Null not returned" ,null, result );
	}
	
	@Test
	public void getDateValueTest(){
		String result = a.getValue(null);
		Assert.assertNotNull( "Date should be returned", result);
	}
	
	@Test
	public void getValueSpecialCase(){
		String result = a.getValue( "TEST" );
		Assert.assertEquals( "Value should be TEST99","TEST99",result);
	}

}
