package tests;

import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTests extends ApplicationManager {

    @Test
    public void test(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnForms().clickBtnPracticeForm();
    }
    @Test
    public void testDelete(){
        WebElement btn = getDriver().findElement(By.cssSelector("selector"));
        btn.click();
    }
    @Test
    public void testClickdelete(){
        WebElement btn = getDriver().findElement(By.cssSelector("selector"));
        btn.click();
        WebElement field = getDriver().findElement(By.cssSelector("selector1"));
        field.sendKeys("data");
    }
}
