package ru.spqr.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        initContactCreation();
        fillingContactForms(new ContactCreation("Corvus",
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
                                                "Group1",
                                                "Планета Деливеренс",
                                                "89029219285",
                                                "Фанат Вархаммера"));
        submitNewContact();
    }
}
