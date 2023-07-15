package common;

public class Config {
    public static final String PLATFORM_AND_BROWSER = "win_chrome";
    //Чистит браузер от куков и сешн сторадж(если true, то очищаются куки
    public static final boolean CLEAR_COOKIES_AND_STORAGE = true;
    //Когда тесты выполнены происходит закрытие браузера (если тру - браузер закрывается)
    public static final boolean HOLD_BROWSER_OPEN = true;
}
