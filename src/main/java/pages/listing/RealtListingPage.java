package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {
//страница со списоком объявлений

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    //создаем поиск карточек по cssSelector
    private final By card = By.cssSelector("$$(\"[data-index]\")");

    //метод, который считает количество карточек товара и сравнивает с ожидаемым результатом
    public RealtListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(29, countCard);
        return this;
    }
}
