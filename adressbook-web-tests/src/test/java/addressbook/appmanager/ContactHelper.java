package addressbook.appmanager;

import addressbook.model.ContactData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitNewContactForm() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getFamily());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getNumber());
        type(By.name("email"), contactData.getEmail());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(ContactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void gotoAddNewContactPage() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void acceptDeleteContact() {
        wd.switchTo().alert().accept();
    }

    public void startContactModification(int index) {
        wd.findElements(By.xpath("(//img[@alt='Edit'])")).get(index).click();
    }

    public void submitContactModification() {
        click(By.xpath("//input[@name='update']"));
    }

    public void returnToContactPage() {
        click(By.linkText("home page"));
    }

    public void createContact(ContactData contact, boolean creation) {
        gotoAddNewContactPage();
        fillContactForm(contact, creation);
        submitNewContactForm();
        returnToContactPage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();

        // Находим строки в контактах где name = entry
        List<WebElement> strings = wd.findElements(By.name("entry"));
        for (WebElement string : strings) {
            //Находим каждый блок в строке
            List<WebElement> blocks = string.findElements(By.tagName("td"));
            //А вот тут сложна, нам надо как-то из определенных блоков в строке получить текст
            //4 часа страдаем, после чего смотрим как сделано у Лёши
            //Ещё час страдаем разбираясь как у него оно работает и делаем по аналогии
            //Пока делал по аналогии засадил баг, ещё пару часов искал где конкретно, памагити
            if (blocks.size() >= 3) {
                String family = blocks.get(1).getText();
                String name = blocks.get(2).getText();
                int id = Integer.parseInt(string.findElement(By.tagName("input")).getAttribute("value"));
                ContactData contact = new ContactData(id, name, family, null, null, null, null);
                contacts.add(contact);
            }
        }
        return contacts;
    }
}