package ru.spqr.addressbook.tests;

import org.testng.annotations.Test;
import ru.spqr.addressbook.model.ContactCreation;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().selectContact("8");
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillingContactForms(new ContactCreation("Corvus",
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
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactsPage();
    }
}
