package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseTest {

    public TextBoxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    public WebElement userNameField;

    @FindBy(id = "userEmail")
    public WebElement userEmailField;

    @FindBy(id = "currentAddress")
    public WebElement addressField;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    //--------------------------------------------

    public void inputFullName(String fullname) {
        userNameField.clear();
        userNameField.sendKeys(fullname);
    }

    public void inputEmail(String email) {
        userEmailField.clear();
        userEmailField.sendKeys(email);
    }

    public void inputAddress(String address) {
        addressField.clear();
        addressField.sendKeys(address);
    }

    public void inputPermanentAddress(String permAddress) {
        permanentAddressField.clear();
        permanentAddressField.sendKeys(permAddress);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", submitButton);
    }
}
