package EstyWeddingParty;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.*;


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



    @Test
    public void TestCase900() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        WebElement weddingAndPartyLink = driver.findElement(By.xpath(" //a//*[contains(text(),'Wedding & Party')]"));
        weddingAndPartyLink.click();
        WebElement sortByButton = driver.findElement(By.xpath("//div[@class='wt-show-lg wt-hide-xs']"));
        sortByButton.click();
        WebElement lowestPriceButton = driver.findElement(By.xpath("//a[contains(text(),'Lowest Price')]"));
        Thread.sleep(1000);
        lowestPriceButton.click();
        Thread.sleep(1000);
        List<WebElement> allPrices = driver.findElements(By.xpath("//p[@class='wt-text-title-01']//span[@class='currency-value'][1]"));
        List<Double> actualResult = new ArrayList<>();
        List<Double> expectedResult = new ArrayList<>();
        for(int i = 4; i< allPrices.size();i++){
            actualResult.add(Double.parseDouble(BrowserUtils.getText(allPrices.get(i))));
            expectedResult.add(Double.parseDouble(BrowserUtils.getText(allPrices.get(i))));
        }
        Collections.sort(expectedResult);
        System.out.println(expectedResult);
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,expectedResult);

    }
}
