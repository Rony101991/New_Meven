import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Game_Shop {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//Mvn-Project-New//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        System.out.println(driver.getTitle());

    }

    @Test
        void go_to_twiter() {


        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//Mvn-Project-New//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());

    }

}









