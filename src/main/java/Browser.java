import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Browser {

    public static WebDriver driver;

    public static void open(String chrome) {
        switch (chrome){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Webdrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                //driver.get("http://shop.pragmatic.bg/admin/");
                driver.manage().window().maximize();

        }
    }

    public static void quit() {
    }
}
