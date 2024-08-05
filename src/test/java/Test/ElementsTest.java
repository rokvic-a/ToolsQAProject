package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL);
        landingPage.clickOnElementsCard();

    }

    @Test
    public void userCanFillOutTextBoxForm() {
        elementsPage.clickOnTextBoxButton();
        textBoxPage.inputFullName("Aleksandar Rokvic");
        textBoxPage.inputEmail("aleksandarokvic@gmail.com");
        textBoxPage.inputAddress("Milana Ilica 51");
        textBoxPage.inputPermanentAddress("Indjija");
        textBoxPage.scroll();
        textBoxPage.clickOnSubmitButton();
    }

    @Test
    public void userCanCheckAllOptions() {
        elementsPage.clickOnCheckBoxButton();
        checkBoxPage.clickOnToggleButton();
        checkBoxPage.clickOnCheckAllOptions();
        String expectedResult = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        Assert.assertEquals(checkBoxPage.actualResult(), expectedResult);
    }

    @Test
    public void userCanClickOnRadioButtonYes() {
        elementsPage.clickOnRadioButton();
        radioButtonPage.clickOnYesRadioButton();

        Assert.assertTrue(radioButtonPage.isRadioButtonYesSelected());
    }

    @Test
    public void userCanClickOnImpressiveRadioButton() {
        elementsPage.clickOnRadioButton();
        radioButtonPage.clickOnImpressiveRadioButton();

        Assert.assertTrue(radioButtonPage.isRadioButtonImpressiveSelected());
    }

    @Test
    public void userCanFillWebTables() {
        elementsPage.clickOnWebTablesButton();
        webTablesPage.inputData();
    }

    @Test
    public void userCanPerformDoubleClick() {
        elementsPage.clickOnButtons();
        String expected = "You have done a double click";
        buttonsPage.performDoubleClick();

        Assert.assertEquals(buttonsPage.getDoubleClickMessage(), expected);
    }

    @Test
    public void userCanPerformRightClick() {
        String expected = "You have done a right click";
        elementsPage.clickOnButtons();
        buttonsPage.performRightClick();

        Assert.assertEquals(buttonsPage.getRightClickMessage(), expected);
    }

    @Test
    public void userCanPerformDynamicClick() {
        String expected = "You have done a dynamic click";
        elementsPage.clickOnButtons();
        buttonsPage.performClick();

        Assert.assertEquals(buttonsPage.getDynamicClickMessage(), expected);

    }

    @Test
    public void userCanClickOnButtonAfterFiveSeconds() {
        elementsPage.clickOnDynamicPropertiesButton();
        dynamicPropertiesPage.clickOnWaitButton();

        Assert.assertTrue(dynamicPropertiesPage.isElementVisible());
    }
}
