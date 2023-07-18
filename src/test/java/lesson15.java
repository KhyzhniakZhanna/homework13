import config.BaseClass;
import config.Util;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.mainPageObject;

import java.util.List;

public class lesson15 extends BaseClass {
    private static mainPageObject mainpage;


    @BeforeClass
    public static void beforeC() throws InterruptedException {
        driver.get("https://odessa.ithillel.ua/courses/front-end-basic");
        Thread.sleep (3000);
        mainpage=new mainPageObject(driver);
    }

    @Test
    public void test1() {
        System.out.println("Course title: "+mainpage.getCoursetittle().getText());
    }
    @Test
    public void test2() {
        System.out.println("Course rate: "+mainpage.getCourserate().getText());
    }
    @Test
    public void test3() {
        System.out.println("Course description:");
        System.out.println(mainpage.getcoursedescription().getText());
    }

    @Test
    public void test4() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn -small -light cookie-ntf_agreement']")).click();
        Util.scrollToElementVisibilityOf(driver,new By.ByXPath("//*[@id=\"coachesSection\"]"));
        Thread.sleep (2000);
        driver.findElement(By.xpath("//button[@id=\"coachesShowAllButton\"]")).click();

        System.out.println("coaches list:");
        System.out.println(mainpage.getcoacheslist());

    }

    @AfterClass
    public static void afterC() {
        driver.quit();
    }}

