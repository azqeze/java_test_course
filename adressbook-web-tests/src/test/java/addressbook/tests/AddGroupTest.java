package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.*;

public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
