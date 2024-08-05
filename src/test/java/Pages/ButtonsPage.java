package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BaseTest {

    public ButtonsPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(xpath = "//button[starts-with(text(),'Click Me')]")
    public WebElement clickButton;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;

    //----------------------------------------

    public void performDoubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
    }

    public void performRightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();
    }

    public void performClick() {
        clickButton.click();
    }

    public String getDoubleClickMessage() {
         return doubleClickMessage.getText();
    }

    public String getRightClickMessage() {
        return rightClickMessage.getText();
    }

    public String getDynamicClickMessage() {
        return dynamicClickMessage.getText();
    }
}
