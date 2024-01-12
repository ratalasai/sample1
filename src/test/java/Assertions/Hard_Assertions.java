package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions {

	@Test
	
	public void HardAssertions() {
		
		String name = "sai";
		Assert.assertEquals(name,"sai");        //AssretEquals....
		System.out.println("Test 1");
		
		String coffee = "Filter";
		Assert.assertEquals(coffee,"Filter");
		System.out.println("Test 2");
		
		String man = "sai";
		boolean b = name.equals(man);
		Assert.assertTrue(b); 	                //AssertTrue....
		System.out.println("True test");
		
		boolean bool = name.equals(coffee);
		Assert.assertFalse(bool);				//AssertFalse....
		System.out.println("False test");
		
		
	}
	
	
}
