package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends BaseTest {

    public CheckBoxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".rct-icon.rct-icon-expand-close")
    public WebElement toggleButton;

    @FindBy(css = ".rct-icon.rct-icon-uncheck")
    public WebElement checkAllOptions;

    @FindBy(id = "result")
    public WebElement result;

    //------------------------------------------------------

    public void clickOnToggleButton() {
        toggleButton.click();
    }

    public void clickOnCheckAllOptions() {
        checkAllOptions.click();
    }

    public String actualResult() {
        return result.getText();
    }

    public String expectedResult = " \"You have selected :\\n\" +\n" +
            "                \"home\\n\" +\n" +
            "                \"desktop\\n\" +\n" +
            "                \"notes\\n\" +\n" +
            "                \"commands\\n\" +\n" +
            "                \"documents\\n\" +\n" +
            "                \"workspace\\n\" +\n" +
            "                \"react\\n\" +\n" +
            "                \"angular\\n\" +\n" +
            "                \"veu\\n\" +\n" +
            "                \"office\\n\" +\n" +
            "                \"public\\n\" +\n" +
            "                \"private\\n\" +\n" +
            "                \"classified\\n\" +\n" +
            "                \"general\\n\" +\n" +
            "                \"downloads\\n\" +\n" +
            "                \"wordFile\\n\" +\n" +
            "                \"excelFile\";";


}
