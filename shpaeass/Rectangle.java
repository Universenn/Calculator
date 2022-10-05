package java10M.week1.day5.shpaeass;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return width*height;
    }
}


