import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class positiveAdminLoginTest {

    @BeforeMethod

   public void setUp(){
        Browser.open("chrome");
    }

    @AfterMethod

    public void tearDown() {
        Browser.quit();
    }

    @Test
     public void logIn(){


    }

}
