package Register;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Base.BaseData;

public class RegisterTest {
	
	private WebDriver driver;
	RegisterPage registerPage;
	

	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.visit("https://www.productosok.com");
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	

	@Test
	public void test() throws InterruptedException{
		registerPage.RegisterUser(BaseData.NAME_COMPLET , BaseData.EMAIL , BaseData.CELL_PHONE, BaseData.PASSWORD);
	}

}
