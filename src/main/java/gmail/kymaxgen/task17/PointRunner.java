package gmail.kymaxgen.task17;



public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(56, -12);
        Point secondPoint = new Point(-106, 78);
        System.out.printf("Distance: %.2f \n", firstPoint.calculateDistance(secondPoint));
        secondPoint.setxCoordinate(85);
        secondPoint.setyCoordinate(-162);
        System.out.printf("Distance: %.2f \n", firstPoint.calculateDistance(secondPoint));

        System.out.println("Порівняння двох об'єктів перша та друга точки: " + firstPoint.equals(secondPoint));
        Point thirdPoint = (Point) firstPoint.clone();
        System.out.println("Порівняння двох об'єктів перша та третя точки: " + firstPoint.equals(thirdPoint));
        Point fourthPoint = new Point(secondPoint);
        System.out.println("Порівняння двох об'єктів друга та четверта точки: " + secondPoint.equals(fourthPoint));
        System.out.println("Друга точка: " + secondPoint);
        System.out.println("Четверта точка: " + fourthPoint);

    }
}
