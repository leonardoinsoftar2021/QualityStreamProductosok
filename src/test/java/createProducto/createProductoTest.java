package createProducto;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Base.BaseData;



public class createProductoTest {

		private WebDriver driver;
		createProductoPage CreateProductoPage;
		

		@Before
		public void setUp() throws Exception {
			CreateProductoPage = new createProductoPage(driver);
			driver = CreateProductoPage.chromeDriverConnection();
			CreateProductoPage.visit("https://www.productosok.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test()throws Exception {
		CreateProductoPage.getIntoUser(BaseData.EMAIL,BaseData.PASSWORD);
		CreateProductoPage.createProduct(BaseData.PRODUCT_CODE, BaseData.PRODUCT_NAME, BaseData.PRICE_PRODUCT, 
				BaseData.DISCOUT_PERCENTAJE, BaseData.LOCAL_PRICE, BaseData.NATIONAL_PRICE, BaseData.DESCRIPTION_PRODUCT,
				BaseData.ENTER_CATEGORIES, BaseData.ENTER_FEATURES);
	}

}
