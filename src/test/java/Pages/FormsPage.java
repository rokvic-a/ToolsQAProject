package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormsPage extends BaseTest {

    public FormsPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "item-0")
    List<WebElement> practiceForm;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "userEmail")
    public WebElement emailField;

    @FindBy(id = "gender-radio-1")
    public WebElement genderRadioButton;

    @FindBy(id = "userNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement birthDateInput;

    @FindBy(id = "subjectsContainer")
    public WebElement subjectsField;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement hobbiesCheckbox;

    @FindBy(id = "uploadPicture")
    public WebElement pictureUploadButton;

    @FindBy(id = "currentAddress")
    public WebElement addressField;

    @FindBy(id = "state")
    public WebElement stateDropdown;

    @FindBy(id = "city")
    public WebElement cityDropdown;

    @FindBy(id = "submit")
    public WebElement submitButton;

    //---------------------------------------

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", stateDropdown);

    }

    public void clickOnPracticeForm() {
        practiceForm.get(1).click();
    }

    public void clickOnMaleGender() {
        Actions actions = new Actions(driver);
        actions.moveToElement(genderRadioButton).click().perform();
    }

    public void selectState() {
        stateDropdown.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }

    public void selectCity() {
    
    }

    public void fillStudentRegistrationForm() {
        firstNameField.clear();
        firstNameField.sendKeys("Aleksandar");
        lastNameField.clear();
        lastNameField.sendKeys("Rokvic");
        emailField.clear();
        emailField.sendKeys("aleksandarokvic@gmail.com");
        clickOnMaleGender();
        mobilePhoneNumber.clear();
        mobilePhoneNumber.sendKeys("1234567891");
        //birthDateInput.clear();
        //birthDateInput.sendKeys("15/Sep/1995");
        //subjectsField.clear();
       // subjectsField.sendKeys("Manual Testing, SQL, Java OOP, Selenium");
        //hobbiesCheckbox.click();
        pictureUploadButton.sendKeys("C:\\Users\\rokvaa\\Desktop");
        addressField.clear();
        addressField.sendKeys("Indjija");
        scroll();
        selectState();
        selectCity();
        submitButton.click();
    }
}
