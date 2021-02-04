package addressbook;

import org.testng.annotations.*;

public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        gotoGroupPage();
    }

}
