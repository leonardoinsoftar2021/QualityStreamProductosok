package createProducto;

import org.openqa.selenium.By;

public class locatorCreateProducto {
	
	public static final By LOCATOR_GET_INTRO = By.xpath("/html/body/app-root/app-main-home/app-nav-bar/nav/div[2]/div/div[2]/button");
	public static final By LOCATOR_EMAIL = By.id("input-loginUser");
	public static final By LOCATOR_PASSWORD = By.id("input-password");
	public static final By LOCATOR_START = By.xpath("/html/body/ngb-modal-window/div/div/app-login/div/div/form/div[3]/button");
	public static final By LOCATOR_BUTTON_IMG = By.xpath("/html/body/app-root/app-main-home/app-nav-bar/nav/div[2]/div/div[4]/div/div/img");
	public static final By LOCATOR_PROFILE = By.xpath("/html/body/app-root/app-main-home/app-nav-bar/nav/div[2]/div/div[4]/ul/li[1]/label");
	public static final By LOCATOR_PRODUCT = By.xpath("//*[@id=\"menuToggle\"]/div/div/nb-menu/ul/li[5]/a/span");
	public static final By LOCATOR_NEW = By.xpath("/html/body/app-root/ngx-pages/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/app-list-products/div/div/nb-card/nb-card-body/div/div[1]/button");
	public static final By LOCATOR_PRODUCT_CODE = By.cssSelector("input[formcontrolname=\"code\"]");
	public static final By LOCATOR_PRODUCT_NAME = By.cssSelector("input[formcontrolname=\"name_product\"]");
	public static final By LOCATOR_PRICE_PRODUCT = By.id("price");
	public static final By LOCATOR_DISCOUT_PERCENTAJE = By.id("discountPercentage");
	public static final By LOCATOR_LOCAL_PRICE = By.id("shipLocal");
	public static final By LOCATOR_NATIONAL_PRICE = By.id("shipNational");
	public static final By LOCATOR_DESCRIPTION = By.id("descriptionUser");
	public static final By LOCATOR_IMG_PRODUCT = By.xpath("//*[@id=\"ngwizard\"]/div[1]/ng-wizard-step[1]/div/div/div[1]/input-file/div/div/div/input");
	public static final By LOCATOR_BUTTON_NEXT = By.xpath("//*[@id=\"ngwizard\"]/div[2]/div/button[2]");
	public static final By LOCATOR_ENTER_CATEGORIES = By.xpath("//*[@id=\"ngwizard\"]/div[1]/ng-wizard-step[2]/div/div/div[2]/div[1]/div/ng-autocomplete/div/div[1]/input");
	public static final By LOCATOR_BUTTON_ADD = By.xpath("//*[@id=\"ngwizard\"]/div[1]/ng-wizard-step[2]/div/div/div[2]/div[2]/button");
	public static final By LOCATOR_ENTER_FEATURES = By.xpath("//*[@id=\"ngwizard\"]/div[1]/ng-wizard-step[2]/div/div/div[3]/div[1]/div/ng-autocomplete/div/div[1]/input");
	public static final By LOCATOR_BUTTON_ADD1 = By.xpath("//*[@id=\"ngwizard\"]/div[1]/ng-wizard-step[2]/div/div/div[3]/div[2]/button");
	public static final By LOCATOR_IMG_PRODUCT1 = By.cssSelector("button[class=\"mat-button-ripple mat-ripple\"]");
}
