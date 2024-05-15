package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver loadedDriver) {
        this.driver = loadedDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[text()='Text Box']")
    WebElement textBoxButton;

    public void selectTextBox() {
        textBoxButton.click();
    }
}
