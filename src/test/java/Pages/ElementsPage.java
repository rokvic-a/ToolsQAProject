package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BaseTest {

    public ElementsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "item-0")
    public WebElement textBox;

    @FindBy(id = "item-1")
    public WebElement checkBox;

    @FindBy(id = "item-2")
    public WebElement radioButton;

    @FindBy(id = "item-3")
    public WebElement webTables;

    @FindBy(id = "item-4")
    public WebElement buttons;

    @FindBy(id = "item-5")
    public WebElement links;

    @FindBy(id = "item-6")
    public WebElement brokenLinks;

    @FindBy(id = "item-7")
    public WebElement uploadAndDownload;

    @FindBy(id = "item-8")
    public WebElement dynamicProperties;


    //-------------------------------------------

    public void clickOnTextBoxButton() {
        textBox.click();
    }

    public void clickOnCheckBoxButton() {
        checkBox.click();
    }

    public void clickOnRadioButton() {
        radioButton.click();
    }

    public void clickOnWebTablesButton() {
        webTables.click();
    }

    public void clickOnButtons() {
        buttons.click();
    }

    public void clickOnLinksButton() {
        links.click();
    }

    public void clickOnBrokenLinksButton() {
        brokenLinks.click();
    }

    public void clickOnUploadAndDownloadButton() {
        uploadAndDownload.click();
    }

    public void clickOnDynamicPropertiesButton() {
        dynamicProperties.click();
    }
}
