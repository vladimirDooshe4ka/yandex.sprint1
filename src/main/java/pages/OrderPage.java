package pages;
import testDataExample.OrderData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage extends CommonElements {

    public static final SelenideElement backButton = $(byXpath("//button[text()='Назад']")); // Кнопка "Назад" на второй странице формы заказа
    public static final SelenideElement orderFormButton = $$(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM")).findBy(text("Заказать")); // Кнопка "Заказать" на второй странице формы заказа
    public static final SelenideElement nextButton = $(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM")); // Кнопка "Далее" на первой странице формы заказа
    public static final SelenideElement nameField = $(byXpath("//input[@placeholder='* Имя']")); // Поле "Имя" формы заказа
    public static final SelenideElement surnameField = $(byXpath("//input[@placeholder='* Фамилия']")); // Поле "Фамалия" формы заказа
    public static final SelenideElement addressField = $(byXpath("//input[@placeholder='* Адрес: куда привезти заказ']")); // Поле "Адрес: куда привезти заказ" формы заказа
    public static final SelenideElement subwayField = $(byClassName("select-search__input")); // Поле "Станция метро" формы заказа
    public static final ElementsCollection subwayStationsNames = $$(byClassName("Order_Text__2broi")); // Элементы выпадающего списка поля "Станция метро"
    public static final SelenideElement phoneNumberField = $(byXpath("//input[@placeholder='* Телефон: на него позвонит курьер']")); // Поле "телефон" формы заказа
    public static final SelenideElement dateDeliveryField = $(byXpath("//input[@placeholder='* Когда привезти самокат']")); // Поле даты "Когда привезти самокат" формы заказа
    public static final SelenideElement rentalPeriodField = $(byXpath("//div[@class='Dropdown-control']")); // Поле "Срок аренда" формы заказа
    public static final ElementsCollection rentalPeriodsButton = $$(byXpath("//div[@class='Dropdown-option']")); // Элементы выпадающего списка поля "Срок аренды"
    public static final ElementsCollection scooterColorCheckboxes = $$(byXpath("//input[@class='Checkbox_Input__14A2w']")); // Элементы блока "Цвет самоката". Содержит варианты выбора цветов
    public static final SelenideElement commentForCourierField = $(byXpath("//input[@placeholder='Комментарий для курьера']")); // Поле "Комментарий для курьера" формы заказа



    public static void setOrderFormFirstPage(OrderData orderData){ // Заполнение первой страницы формы заказа. Передается объект класса Тестовых данных
        setNameField(orderData.nameUser);
        setSurnameField(orderData.surnameUser);
        setAddressField(orderData.addressUser);
        setSubwayField(orderData.subwayStationUser);
        setPhoneNumberField(orderData.phoneNumberUser);

    }

    public static void setOrderFormSecondPage(OrderData orderData){ // Заполнение второй страницы формы заказа. Передается объект класса Тестовых данных
        setDateDeliveryField(orderData.deliveryDateUser);
        setRentalPeriodField(orderData.rentalPeriodUser);

        if(orderData.scooterColorUser != null){
            scooterColorCheckboxes.get(orderData.scooterColorUser).click();
        }
        if (orderData.commentForCourierUser != null){
            commentForCourierField.setValue(orderData.commentForCourierUser);
        }
    }

    public static void makingOrder(OrderData orderData){ // Заполнить форму заказа и сделать заказ
        setOrderFormFirstPage(orderData);
        clickNextButton();
        setOrderFormSecondPage(orderData);
        clickOrderFormButton();
        clickYesConfirmButton();

    }

    public static void setNameField(String name){  // Заполнение поля "Имя"
        nameField.setValue(name);
    }

    public static void setSurnameField(String surname){ // Заполнение поля "Фамилия"
        surnameField.setValue(surname);
    }

    public static void setAddressField(String address){ // Заполнение поля "Адрес: куда привезти заказ"
        addressField.setValue(address);
    }

    public static void setSubwayField(Integer stationNumber){ // Заполнение поля "Станция метро" начиная с 1цы
        subwayField.click();
        subwayStationsNames.get(stationNumber-1).click();
    }

    public static void setPhoneNumberField(String phoneNumber){ // Заполнение поля "Телефон"
        phoneNumberField.setValue(phoneNumber);
    }

    public static void clickNextButton(){ // Клик по кнопке "Далее" на первой странице формы заказа
        nextButton.click();
    }

    public static void setDateDeliveryField(Integer date){ // Заполнение поля даты "Когда привезти самокат" начиная с 1цы
        dateDeliveryField.click();
        calendarDatesButton.get(date-1).click();
    }

    public static void setRentalPeriodField(Integer days){ // Заполнения поля "Срок аренды" начиная с 1цы
        rentalPeriodField.click();
        rentalPeriodsButton.get(days-1).click();
    }

    public static void clickOrderFormButton(){ // Клик по кнопке "Заказать" на форме заказа
        orderFormButton.click();
        modalElement.shouldBe(visible);
    }

    public static void clickBackButton(){ // Клик по кнопке "Назад" на второй странице формы заказа
        backButton.click();
    }


}



