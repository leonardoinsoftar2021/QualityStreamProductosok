package createProducto;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import Base.BasicWarap;



public class createProductoPage extends BasicWarap {
	
	public createProductoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void getIntoUser(String Email, String Password) throws Exception {
		try {
			Thread.sleep(3000);
			click(locatorCreateProducto.LOCATOR_GET_INTRO);
			type(Email, locatorCreateProducto.LOCATOR_EMAIL);
			type(Password, locatorCreateProducto.LOCATOR_PASSWORD);
			click(locatorCreateProducto.LOCATOR_START);
			Thread.sleep(3000);
			click(locatorCreateProducto.LOCATOR_BUTTON_IMG);
			Thread.sleep(3000);
			click(locatorCreateProducto.LOCATOR_PROFILE);
			Thread.sleep(3000);
			click(locatorCreateProducto.LOCATOR_PRODUCT);
			Thread.sleep(3000);
			click(locatorCreateProducto.LOCATOR_PRODUCT);
		
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

public void createProduct(String codeProduct, String nameProduct, String priceProduct, String discoutPercentaje, 
		String priceLocal, String priceNational, String descriptionProduct, String enterCategories,
		String enterFeatures) throws Exception {
	try {
		click(locatorCreateProducto.LOCATOR_NEW);
		type(codeProduct, locatorCreateProducto.LOCATOR_PRODUCT_CODE);
		type(nameProduct, locatorCreateProducto.LOCATOR_PRODUCT_NAME);
		type(priceProduct, locatorCreateProducto.LOCATOR_PRICE_PRODUCT);
		type(discoutPercentaje, locatorCreateProducto.LOCATOR_DISCOUT_PERCENTAJE);
		type(priceLocal, locatorCreateProducto.LOCATOR_LOCAL_PRICE);
		type(priceNational, locatorCreateProducto.LOCATOR_NATIONAL_PRICE);
		type(descriptionProduct, locatorCreateProducto.LOCATOR_DESCRIPTION);
		File file1 = new File("./src/test/resources/Imagenes/celular2.jpeg");
        String phat1 = file1.getAbsolutePath();
		driver.findElement(locatorCreateProducto.LOCATOR_IMG_PRODUCT).sendKeys(phat1);
		Thread.sleep(3000);
		click(locatorCreateProducto.LOCATOR_BUTTON_NEXT);
		Thread.sleep(3000);
		type(enterCategories, locatorCreateProducto.LOCATOR_ENTER_CATEGORIES);
		Thread.sleep(3000);
		click(locatorCreateProducto.LOCATOR_BUTTON_ADD);
		Thread.sleep(3000);
		type(enterFeatures, locatorCreateProducto.LOCATOR_ENTER_FEATURES);
		Thread.sleep(3000);
		click(locatorCreateProducto.LOCATOR_BUTTON_ADD1);
		Thread.sleep(3000);
		click(locatorCreateProducto.LOCATOR_BUTTON_NEXT);
		File file2 = new File("./src/test/resources/Imagenes/baseplus.png");
        String phat2 = file2.getAbsolutePath();
       
        driver.findElement(locatorCreateProducto.LOCATOR_IMG_PRODUCT1).sendKeys(phat2);
        
	
		
		
	
	}catch (NoSuchElementException e) {
		System.out.println("Error: "+e);
	}catch(ElementClickInterceptedException e) {
		System.out.println("Error: "+e);
	}catch (Exception e) {
		System.out.println("Error: "+e);
	}
}
}
