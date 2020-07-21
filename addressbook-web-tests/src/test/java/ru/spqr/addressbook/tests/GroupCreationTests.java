package ru.spqr.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.spqr.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(new GroupData("Group1", null, null));
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
