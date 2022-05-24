package EstyWeddingParty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WeddingPartyAutomation {
    //you can start creating your automation codes here\
    //just create a Test annotation and add you code inside that method
    //I will create a BrowserUtils Class to create our first utils
    //Do not forget to PULL and PUSH codes before and after finishing working
    //I am going to add the steps for pulling and pushing in the TEXT file inside the NOTES package
    //Sincerely Nuradil!

    @Test
    public void EtsyPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");


    }


}
