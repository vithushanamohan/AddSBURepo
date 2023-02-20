package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.DriverInitialization;

public class AddsbuTestcases extends DriverInitialization {
	AddsbuTest adsbuTest = new AddsbuTest();
	
@Test
	public void  AddsbuData() throws InterruptedException, IOException {
	
	
		// TODO Auto-generated method stub
		adsbuTest.Login();
		adsbuTest.AddsbuButton();
		adsbuTest.AddSBUData();
		

	}

}
