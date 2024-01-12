package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {
	
	SoftAssert soft = new SoftAssert();
	
	@Test
	
	public void SoftAssertions() {
		
		System.out.println("Test 1");
		
		String name = "sai";
		String domain = "Testing";
		
		soft.assertEquals(name, domain, "Both are not same :");     //AssertEquals....
		System.out.println("Test 2");
	
		String role= "Testing";
		boolean b = role.equals(domain);
		soft.assertTrue(b);											//AssertTrue....
		System.out.println("True test");
		
		boolean bool = name.equals(role);
		soft.assertFalse(bool);										//AssertFalse....
		System.out.println("False test");
		
		soft.assertAll();          //Its uses to how many tests pass how many fail to indicates...
		
		
	}
	
	

}
