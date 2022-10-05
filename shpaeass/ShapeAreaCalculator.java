package java10M.week1.day5.shpaeass;

public class ShapeAreaCalculator  {
    private Shape shape;

    public ShapeAreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public void printArea() {
        System.out.println("면적 : " + shape.calculateArea());
    }
}
