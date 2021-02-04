package addressbook;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    gotoGroupPage();
  }

}
