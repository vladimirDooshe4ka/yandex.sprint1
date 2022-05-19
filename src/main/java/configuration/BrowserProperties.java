package configuration;

public class BrowserProperties {


    public static final String yandexBrowser = "PATH TO YANDEXDRIVER";
    public static final String chromeBrowser = "PATH TO CHROMEDRIVER";


    public static void setBrowser(String browser){
        System.setProperty("webdriver.chrome.driver", browser);
    }
}


