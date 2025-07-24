package BaseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass1 {

	
	
	@AfterSuite()
	public void configAs2() throws Throwable {
		System.out.println("==disconnected to Db, Backup the report==");
		
	}
	@AfterSuite()
	public void configAs3() throws Throwable {
		System.out.println("==disconnected to Db, Backup the report==");		
	}

	@BeforeMethod()
	public void configBM2() throws Throwable {
		System.out.println("===login===");	
	}
	@BeforeSuite()
	public void configBS() throws Throwable {
		System.out.println("===connect to Db , Report config===");
	}
	
	@BeforeClass()	
		public void configBC() {
		System.out.println("==launch the Browser==");
	}

	@BeforeSuite()
	public void configBS2() {
		System.out.println("===connect to Db , Report config===");	
	}
	
	@BeforeClass()
		public void configBC1() {
		System.out.println("==launch the Browser==");

	}
		@BeforeSuite()
		public void configBS3() throws Throwable {
			System.out.println("===connect to Db , Report config===");
		}
	

	@AfterMethod()
	public void configAM() {
		System.out.println("==logout==");
	}
	@AfterClass()
	public void configAC() {
		System.out.println("==close the browser==");	
	}
	@AfterClass()
	public void configAC1() {
		System.out.println("==close the browser==");	
	}
	
	@AfterMethod()
	public void configAM1() {
		System.out.println("==logout==");
	}
	@AfterMethod()
	public void configAM2() {
		System.out.println("==logout==");
	}

	@AfterSuite()
	public void configAs() {
		System.out.println("==disconnected to Db, Backup the report==");
	}
	
	@BeforeMethod()
	public void configBM() {
		System.out.println("===login===");
	}
	
	@BeforeMethod()
	public void configBM1()  {
		System.out.println("===login===");
	}
	
}
