package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realt_home.RealtHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

//создаем такой же родительский класс как BasePage, только для наших классов
//создаем экземпляры страницы, что бы с ним работать
public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);


    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE){
            //создание возможности использовать JS
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            //чистим куки
            driver.manage().deleteAllCookies();
            //чистим локал сторадж
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true) //запускается после каждой свиты и он обязательно выполняется
    public void close() {
        if(HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }

}
