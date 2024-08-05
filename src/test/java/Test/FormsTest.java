package Test;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FormsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL);
        landingPage.clickOnFormsCard();
    }

    @Test
    public void userCanFillOutRegistrationForm() {
        formsPage.clickOnPracticeForm();
        formsPage.fillStudentRegistrationForm();
    }
}
