import configuration.BrowserProperties; // Используется для выбора Браузера в анотации "BeforeClass"
import com.codeborne.selenide.Configuration;
import constants.Constant;
import org.junit.*;;
import pages.MainPage;
import static com.codeborne.selenide.Selenide.*;

public class TestFAQ  {

    @BeforeClass
    public static void  setUp(){
        BrowserProperties.setBrowser(BrowserProperties.chromeBrowser);
        Configuration.browserSize = "1920x1080";
        open(Constant.HOME_PAGE_URL);
        MainPage.clickAcceptCookies();
    }

    @Test
    public void TestFirstQuestionValue(){

        MainPage.testQuestionValueResult(1);
    }

    @Test
    public void TestSecondQuestionValue(){
        MainPage.testQuestionValueResult(2);
    }

    @Test
    public void TestThirdQuestionValue(){
        MainPage.testQuestionValueResult(3);
    }

    @Test
    public void TestFourthQuestionValue(){
        MainPage.testQuestionValueResult(4);
    }

    @Test
    public void TestFifthQuestionValue(){
        MainPage.testQuestionValueResult(5);
    }

    @Test
    public void TestSixthQuestionValue(){
        MainPage.testQuestionValueResult(6);
    }

    @Test
    public void TestSeventhQuestionValue(){
        MainPage.testQuestionValueResult(7);
    }

    @Test
    public void TestEighthQuestionValue(){
        MainPage.testQuestionValueResult(8);
    }

    @AfterClass
    public static void CloseBrowser(){
        closeWebDriver();
    }
}


