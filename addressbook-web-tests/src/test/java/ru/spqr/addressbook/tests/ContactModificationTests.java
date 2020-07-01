package ru.spqr.addressbook.tests;

import org.testng.annotations.Test;
import ru.spqr.addressbook.model.ContactCreation;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillingContactForms(new ContactCreation("Rogal",
                "Dorn",
                "Primarch",
                "Builder",
                "Имперские кулаки",
                "Одна рука осталась",
                "Терра",
                "1212643123",
                "512554124",
                "6551234",
                "twergefgh@fsdf.com",
                "1653465346.ru",
                "16",
                "September",
                "2290",
                "Святая терра",
                "89029219285",
                "Притворяется мертвым"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactsPage();
    }
}
