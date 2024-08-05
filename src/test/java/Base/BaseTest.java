package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public LandingPage landingPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public FormsPage formsPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        landingPage = new LandingPage(driver);
        elementsPage = new ElementsPage();
        textBoxPage = new TextBoxPage();
        checkBoxPage = new CheckBoxPage();
        radioButtonPage = new RadioButtonPage();
        webTablesPage = new WebTablesPage();
        buttonsPage = new ButtonsPage();
        dynamicPropertiesPage = new DynamicPropertiesPage();
        formsPage = new FormsPage();


    }

    @AfterClass
    public void tearDown() {
       //driver.quit();
    }

    //---------------HELPER METHODS------------------------

    public String URL = "https://demoqa.com/";


}
