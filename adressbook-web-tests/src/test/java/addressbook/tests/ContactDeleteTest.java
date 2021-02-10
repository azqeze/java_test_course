package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase {

    @Test
    public void testContactDelete() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Vasily", "Pupkin", "Mars", "2007", "admin@kremlin.ru", "test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().acceptDeleteContact();
        app.getNavigationHelper().gotoHome();
    }
}
