class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 13;
        breadth = 28;
    }

    int calculateArea() {
        return length * breadth;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("The area is: " + rectangle.calculateArea());
    }
}
