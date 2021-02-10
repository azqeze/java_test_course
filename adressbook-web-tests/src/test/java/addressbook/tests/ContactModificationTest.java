package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().startContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Edit", "Edit2", "Edit3", "Edit4", "Edit5", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().backtoHomeFromContactUpdate();
    }
}
