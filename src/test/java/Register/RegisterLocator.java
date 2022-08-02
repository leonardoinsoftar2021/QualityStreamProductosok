package Register;

import org.openqa.selenium.By;

public class RegisterLocator {
	
	public static final By LOCATOR_REGISTER = By.xpath("/html/body/app-root/app-main-home/app-nav-bar/nav/div[2]/div/div[1]/button");
	public static final By LOCATOR_NAME_COMPLET = By.name("input-nombre");
	public static final By LOCATOR_EMAIL = By.id("input-loginUser");
	public static final By LOCATOR_CELL_PHONE = By.id("telefono");
	public static final By LOCATOR_PASSWORD = By.id("input-password");
	public static final By LOCATOR_CONFIRMATION_PASSWORD = By.id("input-cpassword");
	public static final By LOCATOR_I_AGREE = By.id("term");
	public static final By LOCATOR_BUTTON_REGISTER = By.xpath("/html/body/ngb-modal-window/div/div/app-register-modal/div/form/div[9]/button");
	
}
