package gmail.kymaxgen.task17;

public class Point implements Cloneable {
    private int xCoordinate;
    private int yCoordinate;

    public Point(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
        System.out.println("Point has been created on coordinates: " + x + ", " + y);
    }

    public Point (Point point) {
        xCoordinate = point.getxCoordinate();
        yCoordinate = point.getyCoordinate();
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return ("Точка з координатами x: " + getxCoordinate() + ", y: " + getyCoordinate());
    }


    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point point)) return false;
        if (getxCoordinate() != point.getxCoordinate()) return false;
        return (getyCoordinate() == point.getyCoordinate());
    }*/

    @Override
    public int hashCode() {
        int result = getxCoordinate();
        result = 31 * result * getyCoordinate();
        return result;
    }

    public double calculateDistance(Point thatPoint) {
        int xBasic = this.getxCoordinate();
        int yBasic = this.getyCoordinate();
        int thatX = thatPoint.getxCoordinate();
        int thatY = thatPoint.getyCoordinate();
        return Math.sqrt(Math.pow(xBasic - thatX, 2) + Math.pow(yBasic - thatY, 2));
    }

    public double calculateDistance(int xCoordinate, int yCoordinate) {
        int xBasic = this.getxCoordinate();
        int yBasic = this.getyCoordinate();
        return Math.sqrt(Math.pow(xBasic - xCoordinate, 2) + Math.pow(yBasic - yCoordinate, 2));
    }

}
