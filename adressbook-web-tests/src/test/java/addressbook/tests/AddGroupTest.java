package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.*;

public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.gotoGroupPage();
    }

}
