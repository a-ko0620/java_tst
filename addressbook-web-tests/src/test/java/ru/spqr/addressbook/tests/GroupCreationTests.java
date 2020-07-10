package ru.spqr.addressbook.tests;

import org.testng.annotations.*;
import ru.spqr.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("Group1", null, null));
    }

}
