import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGgg {

    WebDriver driver;

    @BeforeMethod
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//Mvn-Project-New//drivers//chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    void go_to_twitter() {

        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());
    }
    @Test
    void go_to_amazon() {


        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
        WebElement elements =driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select=new Select(elements);
        select.selectByIndex(5);

    }
    @AfterMethod

    void go_to_facebook() {


        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());
    }

}

