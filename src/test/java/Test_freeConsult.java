import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

public class Test_freeConsult extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
       driver.get("https://odessa.ithillel.ua/");
                System.out.println("Title name is: "+driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
// click button
        driver.findElement(By.id("btn-consultation-hero")).click();
        // fill name
       driver.findElement(By.id("input-name-consultation")).click();
     driver.findElement(By.id("input-name-consultation")).sendKeys("dddd");
        // fill mail
        WebElement mail=driver.findElement(By.id("input-email-consultation"));
        mail.click();
        mail.sendKeys("ddd@ff.ff");
        // choose country code
        WebElement phone=driver.findElement(By.className("iti__selected-dial-code"));
        phone.click();
        driver.findElement(By.xpath("//li[@id='iti-0__item-us-preferred']")).click();
        //fill number
        driver.findElement(By.id("input-tel-consultation")).sendKeys("6505141846");
//choose tg
        driver.findElement(By.xpath("//button[@data-name='tg']")).click();
        driver.findElement(By.xpath("//input[@name='tg']")).sendKeys("https://t.me/test");
//choose vb
        driver.findElement(By.xpath("//button[@data-name='vb']")).click();
        driver.findElement(By.xpath("//input[@name='db']")).sendKeys("+16505141846");
        // course
        driver.findElement(By.id("container-input-course-consultation")).click();
        driver.findElement(By.xpath("//li[@data-value='13188']")).click();

        //checkbox
        driver.findElement(By.xpath("//span[@class='checkbox_checkmark']")).click();
        //choose time
     driver.findElement(By.id("listbox-btn-input-consultation-consultation-time")).click();
     driver.findElement(By.xpath("//li[@data-value='1687878000']")).click();


        Thread.sleep (10000);
        driver.quit();
    }

}
