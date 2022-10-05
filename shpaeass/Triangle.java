package java10M.week1.day5.shpaeass;

public class Triangle implements Shape{
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height /2;
    }
}
