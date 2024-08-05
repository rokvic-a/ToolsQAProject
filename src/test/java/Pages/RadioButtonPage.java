package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BaseTest {

    public RadioButtonPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "yesRadio")
    public WebElement yesRadioButton;

    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadioButton;

    //-------------------------------------------

    public void clickOnYesRadioButton() {
        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(By.id("yesRadio"))).click().perform();
    }

    public void clickOnImpressiveRadioButton() {
        Actions act = new Actions(driver);
        act.moveToElement(impressiveRadioButton).click().perform();
    }

    public boolean isRadioButtonYesSelected() {
        return yesRadioButton.isSelected();
    }

    public boolean isRadioButtonImpressiveSelected() {
        return impressiveRadioButton.isSelected();
    }

}
