package config;

import org.openqa.selenium.WebDriver;

public class BaseClass {
   static public WebDriver driver=ConfigurationWebDriver.createdriver(Webdrivers.CHROME_INCOGNITO);



}
