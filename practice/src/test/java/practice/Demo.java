package practice;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Demo extends BaseClass{
	@Test
	public void createOrg() {
		System.out.println("create org");
	}
	@Test
	public void createContact() {
		System.out.println("create contact");
	}
	@Test
	public void createTrucker() {
		System.out.println("create trucker");
	}

}
