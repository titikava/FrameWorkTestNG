package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    //проверяем этим тестом произошел ли переход на страницу листинга
    @Test
    public void checkIsRedirectToListing() throws InterruptedException {
        //открываем страницу
        basePage.open(REALT_HOME_PAGE);
        Thread.sleep(30000);
        //используем методы, созданные ранее для этой страницы
        realtHomePage
                .enterCountRooms()
                .clickToFind();
        Thread.sleep(10000);
        //считаем карточки товаров
        realtListingPage.checkCountCards();
    }

}
