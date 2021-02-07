package org.execution;

import org.libGlobal.BaseClass;
import org.locators.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Execution extends BaseClass {
	@BeforeMethod
	public void beforeClass() {
		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		
		
	}

	@Test(dataProvider = "credentials")
	public void tc1(String usr, String pass) {
		LoginPage lp = new LoginPage();
		jsFillText(usr, lp.getTxtUserName());
		jsFillText(pass, lp.getTxtPassword());
		click(lp.getBtnLogin());
		driver.close();
	}
	

	
	
	
	
@DataProvider(name="credentials")
 public Object[][] data() {
		return new Object[][] {
			
			{"CelinaGrace", "devbeu123"}		};
	}
		

@Test()
private void tc4() {
	System.out.println("depends on method executed");
}




		
	
		
	}	
	



	


