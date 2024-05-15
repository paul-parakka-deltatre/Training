import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivam.rai\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }
    @Test
    public void test1() {
        driver.get("https://demoqa.com/elements");
        homePage.selectTextBox();
    }
}
