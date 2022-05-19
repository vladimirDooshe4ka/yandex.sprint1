package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class MainPage extends CommonElements {

    //Ожидаемые переменные

    public static final String[] textOfQuestionValue= { // Массив ожидаемых ответов на вопросы из блока "О важном"
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."

    };


    //Элементы
    public static final SelenideElement headerOfPage = $(byClassName("Home_Header__iJKdX"));
    public static final SelenideElement firstHeaderDescription = $(byXpath("//div[text()='Привезём его прямо к вашей двери,']")); // Первое описание заголовка "Самокат на пару дней"
    public static final SelenideElement secondHeaderDescription = $(byXpath("//div[text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")); // Второе описание заголовка "Самокат на пару дней"
    public static final ElementsCollection modelScooterDescription = $$(byCssSelector(".Home_Row__jdQW2")); // Описание модели самоката в блоке представления самоката
    public static final SelenideElement scooterImgScheme = $(byXpath("//div[@class='Home_BluePrint__TGX2n']")); // Картинка скутера в виде схемы
    public static final SelenideElement scooterImgReal = $(byXpath("//div[@class='Home_Scooter__3YdJy']")); // Картинка скутера в виде реального фото
    public static final SelenideElement titleOfRoadMap = $(byXpath("//div[.='Как это работает']")); // Поиск заголовка блока roadmap
    public static final ElementsCollection numberOfPointRoadmap = $$(byCssSelector(".Home_StatusCircle__3_aTp")); // Номер шага в кружке Roadmap`а "как это работает"
    public static final ElementsCollection titleOfPointRoadmap = $$(byXpath("//div[@class='Home_Status__YkfmH']")); // Заголовок шага в Roadmap`а "как это работает"
    public static final ElementsCollection descriptionOfPointRoadmap = $$(byXpath("//div[@class='Home_StatusDescription__3WGl5']")); // Описание шага в Roadmap`а "как это работает"
    public static final SelenideElement titleFAQ = $(byXpath("//div[.='Вопросы о важном']")); // Заголовок блока ответов на вопросы "Вопросы о важном"
    public static final SelenideElement orderRoadMapButton = $(byCssSelector(".Button_Button__ra12g.Button_UltraBig__UU3Lp")); // Кнопка "Заказать" в блоке "Как это работает"
    public static final ElementsCollection questionButton = $$(byXpath("//div[@class='accordion__button']")); // Список вопросов в разделе "О важном"
    public static final ElementsCollection questionValue = $$(byXpath("//div[@class='accordion__panel']")); // Открывающиеся ответы на вопросы из блока "О важном"




    public static void testQuestionValueResult(int i){ //Метод принимает целое число - номер вопроса начиная с 1цы
        clickQuestionButton(i);    // Клик по вопросу из блока "О важном".
        questionValue.get(i-1).shouldBe(Condition.visible);   // Проверка что текст ответа на вопрос видимый.
        questionValue.get(i-1).shouldHave(Condition.exactText(textOfQuestionValue[i-1]));   // Сравнение текста ответа на вопрос, с ожидаемым текстом
    }



    public static void clickOrderRoadMapButton(){ // Клик по кнопке "Заказать" в блоке "Как это работает"
        orderRoadMapButton.click();

    }

    public static void clickQuestionButton(int i ){ // Метод принимает целове число - номер вопроса начиная с 1цы.
        questionButton.get(i-1).click();     // Метод кликает по вопросу под номером i
    }



}
