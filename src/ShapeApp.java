public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());


        var rectangle = new Reactangle();
        System.out.println(rectangle.getCorner());
        // Super method
        System.out.println(rectangle.getParentCorner());
    }
}
