package browserfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TestSuite extends Utility {
    String baseUrl="https://www.amazon.co.uk/";

    @Before
    public void setup(){
        openbrowser(baseUrl);
    }
    @Test
    public void verifyListOfProdct() throws InterruptedException {
        //clear cookies
        clickOnElements(By.xpath("//input[@class='a-button-input celwidget']"));
        // Type "Dell Laptop" in the search box and press enter or click on search Button.
       sendTextToElements(By.xpath("//input[@id='twotabsearchtextbox']"), "Dell Laptop");
       Thread.sleep(400);
       clickOnElements(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @value='Go']"));
       // Click on the checkbox brand dell on the left side.
        clickOnElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/span[contains(text(),'Dell')]"));
        // Verify that the  30(May be different) products are displayed on the page.
        List<WebElement>beforsortList=listOfWebElementsList(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/span[contains(text(),'Dell')]"));
        for(WebElement data:beforsortList){
            String a=data.getText();
            System.out.println(a);
        }
        System.out.println(beforsortList.size());

    }
    @After
    public void tearup(){
      //closebrowser();
    }
}
