package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

public static WebDriver driver;

    public static void getDriver() {
        if (driver == null) {
            System.out.println("Driver seçimine gelindi");
            switch (ConfigReader.browser) {
                case "chrome":
                    System.out.println("Chrome driver seçildi");
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--disable-notifications");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    System.out.println("Firefox driver seçildi");
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--disable-notifications");
                    driver = new FirefoxDriver(firefoxOptions);

            }
        }
        System.out.println("Driver büyütüldü");
        driver.manage().window().maximize();
        driver.get(ConfigReader.url);
    }

    public static void closeDriver() {
        if (driver != null) {
            System.out.println("Driver kapatıldı");
            driver.quit();
            driver = null;
        }
    }


}

