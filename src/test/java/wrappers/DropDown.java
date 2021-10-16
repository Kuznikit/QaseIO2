package wrappers;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropDown {
    public static final String DROPDOWN = "//*[@id='%s']//descendant::*[@class=' css-2b097c-container']";
    public static final String DROPDOWN_DEPLOYED = ".css-1gg2qke-menu";
    String dropDownName;
    public DropDown(String field) {
        this.dropDownName = field;
    }

    public void select(String option) {
        $(By.xpath(String.format(DROPDOWN, dropDownName))).click();
        $$(DROPDOWN_DEPLOYED).findBy(Condition.text(option)).click();
    }
}

