public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                3, 4,
                5, 8,
                14, 4);
        System.out.println(triangle.perimeter());
    }
}