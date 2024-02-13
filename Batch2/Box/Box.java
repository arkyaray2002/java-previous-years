package Batch2;

class Box {
    private double length;
    private double breadth;
    private double height;

    // Parameterized constructor
    public Box(double breadth) {
        this.breadth = breadth;
        this.length = 0.0; // Assuming default length is 0
        this.height = 0.0; // Assuming default height is 0
    }

    // Method to set length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to set height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate volume
    public double volume() {
        return length * breadth * height;
    }
}


