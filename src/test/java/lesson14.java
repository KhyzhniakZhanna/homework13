//import com.google.common.annotations.VisibleForTesting;
import config.BaseClass;
import config.Util;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class lesson14 extends BaseClass {
    @Before
    public void beforeMethod() {
        driver.get("https://odessa.ithillel.ua/");
        System.out.println("TEST RESULTS:");
    }
    @Test
    public void Test() throws InterruptedException {

        driver.findElement(By.xpath("//button[@data-dropdown-trigger='coursesMenu']")).click();
        driver.findElement(By.xpath("//input[@class='search-field_input']")).sendKeys("front");
        Thread.sleep (2000);
        driver.findElement(By.xpath("//*[@id=\"coursesMenuSearchPanel\"]/div[3]/div/ul/li[1]/a/div/p")).click();
                Util.scrollToElementVisibilityOf(driver,new By.ByXPath("//button[@id=\"coachesShowAllButton\"]"));
        driver.findElement(By.xpath("//button[@class='btn -small -light cookie-ntf_agreement']")).click();
        driver.findElement(By.xpath("//button[@id=\"coachesShowAllButton\"]")).click();
        int count=0;
        List<WebElement> webElementList=driver.findElements(By.className("coach-list_item"));
        for (WebElement element : webElementList) {
           count=count+1;
            System.out.println(element.findElement(By.className("coach-card_name")).getText());

        }
        System.out.println("The whole number of teachers is "+count);
    }

    @After
    public void afterMethod() {
       driver.quit();
    }}


