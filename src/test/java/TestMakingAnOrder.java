import configuration.BrowserProperties;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import constants.Constant;
import org.junit.*;;
import pages.*;
import testDataExample.OrderData;

import static com.codeborne.selenide.Selenide.*;

public class TestMakingAnOrder {

    public OrderData firstOrderData = new OrderData(); // Тестовые данные для страницы оформления заказа №1
    public OrderData secondOrderDara = new OrderData( //Тестовые данные для страницы оформления заказа №2
            "Комар",
            "Комаров",
            "СПб, улица маяковского 14",
            18,
            "+79934445522",
            27,
            2,
            null,
            null);

    @Before
    public void  setUp(){
        BrowserProperties.setBrowser(BrowserProperties.chromeBrowser);
        Configuration.browserSize = "1920x1080";
        open(Constant.HOME_PAGE_URL);
        MainPage.clickAcceptCookies();
    }

    @Test
    public void TestOfMakingOrderNavButton() {
        MainPage.clickOrderNavButton();
        OrderPage.makingOrder(firstOrderData);
        OrderPage.titleOfModalElement.shouldHave(Condition.text("Заказ оформлен"));
    }

    @Test
    public void TestOfMakingOrderRoadMapButton() {
        MainPage.clickOrderRoadMapButton();
        OrderPage.makingOrder(secondOrderDara);
        OrderPage.titleOfModalElement.shouldHave(Condition.text("Заказ оформлен"));
    }

    @After
    public void CloseBrowser(){
        closeWebDriver();
    }


}
