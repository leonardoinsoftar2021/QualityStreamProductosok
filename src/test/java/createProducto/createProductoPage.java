package createProducto;

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
			Thread.sleep(5000);
			click(locatorCreateProducto.LOCATOR_GET_INTRO);
			type(Email, locatorCreateProducto.LOCATOR_EMAIL);
			type(Password, locatorCreateProducto.LOCATOR_PASSWORD);
			click(locatorCreateProducto.LOCATOR_START);
		
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
