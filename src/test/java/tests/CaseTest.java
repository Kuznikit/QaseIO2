package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectDetailsPage;


public class CaseTest extends BaseTest {
    @Test
    public void testCaseShouldBeCreated() {
        new LoginPage()
                .open()
                .login("kuznikit@gmail.com", "Qazxcv123")
                .openProject("ABC")
                .createTestCase("QaseIOTest", "Draft");
        //new ProjectDetailsPage()
        //        .createDropDown("Draft");
        //open project by name ABC
        //create case
        //validate case info
        //
    }
}
