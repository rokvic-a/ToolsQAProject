package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicPropertiesPage extends BaseTest {

    public DynamicPropertiesPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "enableAfter")
    public WebElement waitButton;

    @FindBy(id = "visibleAfter")
    public WebElement visibleButton;

    //-----------------------------------

    public void clickOnWaitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(waitButton));
        waitButton.click();
    }

    public boolean isElementVisible() {
        return visibleButton.isDisplayed();
    }
}
