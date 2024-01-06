class Box {
    int width = 13;
    int height = 29;
    int depth = 16;

    void display() {
        System.out.println("Volume of box: " + width * height * depth);
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.display();
    }
}
