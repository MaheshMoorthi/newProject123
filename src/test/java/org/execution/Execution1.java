package org.execution;



import org.libGlobal.BaseClass;
import org.locators.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Execution1 extends BaseClass {
	@BeforeMethod
	public void beforeClass() {
		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		
		
	}

	@Test(dataProvider = "credentials")
	public void tc1(String usr, String pass) {
		LoginPage lp = new LoginPage();
		jsFillText(usr, lp.getTxtUserName());
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(usr, "Celina");
		jsFillText(pass, lp.getTxtPassword());
		sa.assertAll();
		click(lp.getBtnLogin());
		driver.close();
	}
	

	
	
	
@DataProvider(name="credentials")
 public Object[][] data() {
		return new Object[][] {
			{"grace", "Abcd"},
			{"celina", "grace"}
					};
	}
		

@Test
private void tc4() {
	System.out.println("depends on method executed");
}




		
	
		
	}	
	



	





