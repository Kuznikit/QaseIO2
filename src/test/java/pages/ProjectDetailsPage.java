package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.DropDown;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class ProjectDetailsPage {
WebDriver driver;
    public void createTestCase(String titleName, String status) {
        $("#title").sendKeys(titleName);
        $("#statusGroup").click();
        $$(By.xpath("//div[contains(@class, 'css-2b097c-container')]")).findBy(Condition.text(status)).click();
    }
    //public void createDropDown (String status){
    //    new DropDown(driver, "Status").select(status);
    //}
}
