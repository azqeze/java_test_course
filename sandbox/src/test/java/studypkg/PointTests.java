package studypkg;

import org.junit.Test;
import org.testng.Assert;

public class PointTests {

    @Test
    //Обычный тест
    public void testDistance() {
        Point p = new Point(4, 2, 8, 3);
        Assert.assertEquals(p.distance(), 4.123105625617661);
    }

    @Test
    //Тест с совпадением точек
    public void testDistanceNull() {
        Point p = new Point(4, 2, 4, 2);
        Assert.assertEquals(p.distance(), 0.00);
    }

    @Test
    //Тест который провалится
    public void testDistanceFail() {
        Point p = new Point(4, 3, 8, 3);
        Assert.assertEquals(p.distance(), 4.123105625617661);
    }
}
