package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().gotoAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("First Name", "Last Name", "Address", "88005553535", "e-mail@test.test", "test1"), true);
        app.getContactHelper().submitNewContactForm();
        app.getNavigationHelper().gotoHome();
    }
}
