package Register;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import Base.BasicWarap;

public class RegisterPage extends BasicWarap {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void RegisterUser(String Button, String NameComplet, String Email, String CellPhone, String Password,String EmailFace
			, String PasswordFace) throws InterruptedException{
		try {
			Thread.sleep(5000);
			click(RegisterLocator.LOCATOR_REGISTER);
			if(Button.equals("User")) {
			type(NameComplet, RegisterLocator.LOCATOR_NAME_COMPLET);
			type(Email, RegisterLocator.LOCATOR_EMAIL);
			type(CellPhone, RegisterLocator.LOCATOR_CELL_PHONE);
			type(Password, RegisterLocator.LOCATOR_PASSWORD);
			type(Password, RegisterLocator.LOCATOR_CONFIRMATION_PASSWORD);
			click(RegisterLocator.LOCATOR_I_AGREE);
			Thread.sleep(5000);
			click(RegisterLocator.LOCATOR_BUTTON_REGISTER);
			}if(Button.equals("userFace")) {
				
				click(RegisterLocator.LOCATOR_REGISTERFACE);
				String mainTab = driver.getWindowHandle();
				Set<String> handles = driver.getWindowHandles();
				for (String actual: handles) {
					if(!actual.equalsIgnoreCase(mainTab)) {
						driver.switchTo().window(actual);
					}
				}
				Thread.sleep(3000);
				type(EmailFace, RegisterLocator.LOCATOR_EMAIL_FACE);
				type(PasswordFace, RegisterLocator.LOCATOR_PASSWORD_FACE);
				
				click(RegisterLocator.LOCATOR_BUTTON_LOGIN_FACE);
			}
			
		
			
		
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
	}

}
