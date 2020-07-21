package ru.spqr.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.spqr.addressbook.model.ContactCreation;
import ru.spqr.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitNewContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillingContactForms(ContactCreation contactCreation) {
        type(By.name("firstname"), contactCreation.getFirstName());
        type(By.name("lastname"), contactCreation.getLastName());
        type(By.name("nickname"), contactCreation.getNickName());
        type(By.name("title"), contactCreation.getTitle());
        type(By.name("company"), contactCreation.getCompany());
        type(By.name("address"), contactCreation.getAddress());
        type(By.name("home"), contactCreation.getHome());
        type(By.name("mobile"), contactCreation.getMobile());
        type(By.name("work"), contactCreation.getWork());
        type(By.name("fax"), contactCreation.getFax());
        type(By.name("email"), contactCreation.getEmail());
        type(By.name("homepage"), contactCreation.getHomePage());
        select(By.name("bday"), contactCreation.getBirthDay());
        select(By.name("bmonth"), contactCreation.getBirthMonth());
        type(By.name("byear"), contactCreation.getBirthYear());
        type(By.name("address2"), contactCreation.getAddress2());
        type(By.name("phone2"), contactCreation.getPhone());
        type(By.name("notes"), contactCreation.getNotes());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void selectContact(int index) {
        wd.findElements(By.name("name=selected[]")).get(index).click();
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void returnToContactsPage() {
        click(By.linkText("home page"));
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactCreation contact) {
        initContactCreation();
        fillingContactForms(contact);
        submitNewContact();
        returnToContactsPage();
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactCreation> getContactList() {
        List<ContactCreation> contacts = new ArrayList<ContactCreation>();
        List<WebElement> line = wd.findElements(By.cssSelector("tr[name = entry]"));
        for (WebElement element : line) {
            List<WebElement> elements = element.findElements(By.tagName("td"));
            String firstName = elements.get(2).getText();
            String lastName = elements.get(1).getText();
            ContactCreation contact = new ContactCreation(firstName, lastName, null, null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null);
            contacts.add(contact);
        }
        return contacts;
    }
}
