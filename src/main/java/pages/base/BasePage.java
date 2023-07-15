package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;
//создаем родительский класс, от которогу будут наследоватся все страницы (классы) в последующем
//и прописываем ему какие-то дефолтные параметры и создаем методы
public class BasePage {
    protected WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;

    }

    public void open(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
