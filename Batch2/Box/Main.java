package Batch2;

public class Main {
    public static void main(String[] args) {
        // Creating a Box object with breadth as 5
        Box box = new Box(5.0);

        // Setting length and height of the box
        box.setLength(10.0);
        box.setHeight(3.0);

        // Calculating and printing volume of the box
        System.out.println("Volume of the box: " + box.volume());
    }
}