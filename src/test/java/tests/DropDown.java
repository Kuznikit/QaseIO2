package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class DropDown {
    WebDriver driver;
    String label;
    String dropdown = "//div[contains(@text, '%s')]/ancestor::div[contains(@class, 'css-2b097c-container')]";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        //driver.findElement(By.xpath(String.format(dropdown, label))).click();
        $("#statusGroup").click();
        driver.findElement(By.xpath(String.format("//div[@class='%s']", option))).click();
    }
}