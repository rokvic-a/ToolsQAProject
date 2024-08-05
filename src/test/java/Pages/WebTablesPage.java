package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage extends BaseTest {

    public WebTablesPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "userEmail")
    public WebElement userEmailField;

    @FindBy(id = "age")
    public WebElement ageField;

    @FindBy(id = "salary")
    public WebElement salaryField;

    @FindBy(id = "department")
    public WebElement departmentField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    //-------------------------------------

    public void inputData() {
        addButton.click();
        firstNameField.clear();
        firstNameField.sendKeys("Aleksandar");
        lastNameField.clear();
        lastNameField.sendKeys("Rokvic");
        userEmailField.clear();
        userEmailField.sendKeys("aleksandarokvic@gmail.com");
        ageField.clear();
        ageField.sendKeys("28");
        salaryField.clear();
        salaryField.sendKeys("0");
        departmentField.clear();
        departmentField.sendKeys("IT Department");
        submitButton.click();
    }


}
