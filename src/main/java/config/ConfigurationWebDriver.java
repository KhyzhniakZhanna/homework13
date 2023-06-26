package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ConfigurationWebDriver {
   static WebDriver driver=null;
public static WebDriver createdriver(Webdrivers webdrivers) {
    switch (webdrivers) {
        case CHROME -> createChrome();
        case CHROME_INCOGNITO -> createChromeIncognito();
        case FIREFOX -> createFireFox();
    }
    return driver;
}

    private static void createFireFox() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new FirefoxDriver(options);
    }

    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        
    }


//    ChromeOptions options = new ChromeOptions();
//      options.addArguments("--remote-allow-origins=*");
//      options.addArguments("--start-maximized");
//    //  options.addArguments("--incognito");
//    WebDriver driver = new ChromeDriver(options);
//      driver.get("https://odessa.ithillel.ua/");
//        System.out.println("Title name is: "+driver.getTitle());
//        Thread.sleep(3000);
//        driver.findElement(By.id("btn-consultation-hero"));
//
//           driver.quit();

}


