package ru.spqr.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.spqr.addressbook.model.ContactCreation;

import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        if(! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactCreation("Corvus",
                    "Corax",
                    "Primarch",
                    "Nevermore",
                    "Воронья Гвардия",
                    "Улетел куда-то, я хз",
                    "Дом там, где война",
                    "1212643123",
                    "512554124",
                    "6551234",
                    "twergefgh@fsdf.com",
                    "1653465346.ru",
                    "16",
                    "September",
                    "2290",
                    "Планета Деливеренс",
                    "89029219285",
                    "Фанат Вархаммера"));
        }
        List<ContactCreation> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() -1);
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
        List<ContactCreation> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());
    }
}
