package ru.spqr.addressbook.tests;


import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getContactHelper().selectContact("8");
        app.getContactHelper().deleteContact();
        app.getContactHelper().closeAlert();
    }
}
