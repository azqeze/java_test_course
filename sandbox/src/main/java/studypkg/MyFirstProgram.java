package studypkg;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Zdarova");
        System.out.println();

        Point p = new Point(1,2,3,4);
        System.out.println("Расстояние между точкой A с координатами " + p.p1 + " и точкой B с координатами "+ p.p2 + " = " + p.distance());
    }
}