package Register;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import Base.BasicWarap;

public class RegisterPage extends BasicWarap {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void RegisterUser(String NameComplet, String Email, String CellPhone, String Password) throws InterruptedException{
		try {
			Thread.sleep(5000);
			click(RegisterLocator.LOCATOR_REGISTER);
			Thread.sleep(5000);
			type(NameComplet, RegisterLocator.LOCATOR_NAME_COMPLET);
			type(Email, RegisterLocator.LOCATOR_EMAIL);
			type(CellPhone, RegisterLocator.LOCATOR_CELL_PHONE);
			type(Password, RegisterLocator.LOCATOR_PASSWORD);
			type(Password, RegisterLocator.LOCATOR_CONFIRMATION_PASSWORD);
			click(RegisterLocator.LOCATOR_I_AGREE);
			Thread.sleep(5000);
			click(RegisterLocator.LOCATOR_BUTTON_REGISTER);
		
			
		
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
	}

}
