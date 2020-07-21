package ru.spqr.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.spqr.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletionTests() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("Group1", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);
    }
}
