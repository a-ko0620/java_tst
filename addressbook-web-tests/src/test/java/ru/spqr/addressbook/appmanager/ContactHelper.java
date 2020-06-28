package ru.spqr.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.spqr.addressbook.model.ContactCreation;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
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
        select(By.name("new_group"), contactCreation.getGroup());
        type(By.name("address2"), contactCreation.getAddress2());
        type(By.name("phone2"), contactCreation.getPhone());
        type(By.name("notes"), contactCreation.getNotes());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }
}
