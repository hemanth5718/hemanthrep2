package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Sample2 extends BaseClass  {

	@Test
	public void demo3()
	{
		System.out.println("-- pass---");
	}
	
	@Test
	public void demo4()
	{
		Assert.fail();
		System.out.println("-- fail---");
		
	}
}
