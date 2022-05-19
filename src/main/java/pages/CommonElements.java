package pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommonElements {

    /* Навигационная панель*/

    public static final SelenideElement orderNavButton = $(byClassName("Button_Button__ra12g")); // Кнопка "Заказать" в навигационной панели
    public static final SelenideElement yandexLogoNav = $(byXpath("//img[@alt='Yandex']")); // Логотип "Яндекс"
    public static final SelenideElement samokatLogoNav = $(byXpath("//img[@alt='Scooter']")); // Логотип "Самокат"
    public static final SelenideElement statusOrderNavButton = $(byClassName("Header_Link__1TAG7")); // Кнопка "Статус заказа"
    public static final SelenideElement statusOrderSearchInput = $(byCssSelector(".Input_Input__1iN_Z.Header_Input__xIoUq")); // Поле для поиска заказа по номеру в навигационной панели
    public static final SelenideElement statusOrderGoButton = $(byXpath("//button[text()='Go!']")); // Кнопка "Go!" в блоке поиска заказа по номеру

    /* Общие всплывающие элементы на разных страницах*/

    public static final SelenideElement acceptCookiesButton = $(byXpath("//button[@id='rcc-confirm-button']")); // Кнопка принятия кук
    public static final SelenideElement yesConfirmButton = $$(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM")).findBy(text("Да")); // Кнопка "Да" в всплывающем модальном окне
    public static final SelenideElement noConfirmButton = $$(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM")).findBy(text("Нет")); // Кнопка "нет" в всплывающем модальном окне
    public static final SelenideElement titleOfModalElement = $(byXpath("//div[@class='Order_ModalHeader__3FDaJ']")); // Заголово всплывающего модального окна
    public static final SelenideElement modalElement = $(byXpath("//div[@class='Order_Modal__YZ-d3']")); //Всплывающее модальное окно
    public static final SelenideElement previousMonthCalendarButton = $(byXpath("//button[@aria-label='Previous Month']")); // Кнопка "назад" в сплывающем календаре, переносит на предыдущий календарный месяц
    public static final SelenideElement nextMonthCalendarButton = $(byXpath("//button[@aria-label='Next Month']")); // Кнопка "вперед" в сплывающем календаре, переносит на следующий календарный месяц
    public static final ElementsCollection calendarDatesButton = $$(byCssSelector(".react-datepicker__day")); // Кнопки дат в всплывающем календаре


    public static void clickOrderNavButton() { // Клик по кнопке "Заказать" в навигационной панели
        orderNavButton.click();
    }

    public static void clickYandexLogoNav(){
        yandexLogoNav.click();
    }

    public static void clickSamokatLogoNav(){
        samokatLogoNav.click();
    }

    public static void clickStatusOrderNavButton(){
        statusOrderNavButton.click();
    }

    public static void clickAcceptCookies(){ // Клик по кнопку принятия кук "да все привыкли"
        acceptCookiesButton.click();
    }

    public static void clickPreviousMonthCalendarButton(){ // Клик по кнопке предыдущего месяца в календарной форме
        previousMonthCalendarButton.click();
    }

    public static void clickNextMonthCalendarButton(){ // Клик по кнопке следующего месяца в календарной форме
        nextMonthCalendarButton.click();
    }

    public static void clickNoConfirmButton(){  // Клик по кнопке "Нет" в всплывающем модальном окне
        noConfirmButton.click();
        modalElement.shouldNotBe(visible);
    }

    public static void clickYesConfirmButton(){ //Клик по кнопке "Да" в всплывающем модальном окне
        yesConfirmButton.click();
        modalElement.shouldBe(visible);
    }
}
