import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivam.rai\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.get("https://demoqa.com/elements");
        homePage.selectTextBox();
    }
}
