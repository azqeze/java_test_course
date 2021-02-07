package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.*;

public class AddContactTest extends TestBase {

    @Test
    public void testAddContact() throws Exception {
        app.getContactHelper().gotoAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("First Name", "Last Name", "Address", "88005553535", "e-mail@test.test"));
        app.getContactHelper().submitNewContactForm();
        app.getContactHelper().backtoHome();
    }
}
