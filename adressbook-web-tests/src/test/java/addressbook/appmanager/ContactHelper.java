package addressbook.appmanager;

import addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void backtoHome() {
        click(By.linkText("home page"));
    }

    public void submitNewContactForm() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getFamily());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getNumber());
        type(By.name("email"), contactData.getEmail());
    }

    public void gotoAddNewContactPage() {
        click(By.linkText("add new"));
    }
}