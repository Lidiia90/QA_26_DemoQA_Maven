package manager.experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CssSelectors {
WebDriver driver;

    @Test
    public void cssTrello(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        WebElement div1 = driver.findElement(By.cssSelector("div[class='card mt-4 top-card']"));
        WebElement div1Xpath = driver.findElement(By.xpath("//div[@class='card mt-4 top-card']"));
        System.out.println(div1.getTagName());

        WebElement div2 = driver.findElement(By.id("fixedban")); //"*[id='fixedban']"
        WebElement div3Xpath = driver.findElement(By.xpath("//*[@id ='fixedban']"));
        System.out.println(div2.getAttribute("style"));
        //WebElement div4 = driver.findElement(By.cssSelector("*[id='fixedban']"));

        driver.findElement(By.tagName("header")); //css "header"   xpath "//header"
        //driver.findElement(By.cssSelector("header"));

       WebElement img = driver.findElement(By.className("banner-image"));  //css * [class='banner-image']
                                                                           // path //*[@class='banner-image']
       System.out.println(img.getLocation());

      // WebElement h5 = driver.findElement(By.linkText("Interactions"));
      // System.out.println(h5.getTagName());

     WebElement headerImg = driver.findElement(By.cssSelector("*[scr='/images/Toolsqa.jpg']"));
                                                            // xpath "//*[@src='/images/Toolsqa.jpg']"
     System.out.println(headerImg.getSize());

        List<WebElement> listDiv = driver.findElements
                (By.cssSelector("div[class='card mt-4 top-card']"));
        System.out.println("size listDiv --> "+listDiv.size());

        driver.quit();
    }
}
