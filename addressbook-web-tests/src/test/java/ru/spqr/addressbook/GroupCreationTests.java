package ru.spqr.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Group1", "Corvus Corax", "123"));
        submitGroupCreation();
        returnToGroupPage();
        wd.findElement(By.linkText("Logout")).click();
    }

}
