package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LandingPage extends BaseTest {

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    List<WebElement> cards;

    public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }

    //---------------------------------------------------------

    public void clickOnElementsCard() {
        for(int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Elements")) {
                getCards().get(i).click();
            }
        }
    }

    public void clickOnFormsCard() {
        for(int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Forms")) {
                getCards().get(i).click();
            }
        }
    }

    public void clickOnAlertsCard() {
        for(int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Alerts, Frame & Windows")) {
                getCards().get(i).click();
            }
        }
    }

    public void clickOnWidgetsCard() {
        for(int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Widgets")) {
                getCards().get(i).click();
            }
        }
    }

    public void clickOnInteractionsCard() {
        for(int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Interactions")) {
                getCards().get(i).click();
            }
        }
    }

    public void clickOnBookStoreCard() {
        for(int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Book Store Application")) {
                getCards().get(i).click();
            }
        }
    }




}
