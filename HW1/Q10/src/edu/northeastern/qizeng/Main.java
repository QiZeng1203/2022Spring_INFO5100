package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box box = new Box(10.00d, 20.00d, 30.00d);
        printBoxInfo(box);
        double volume = box.calcBoxVolume(box);
        System.out.println("The volume of the box is " + volume);
    }
    private static void printBoxInfo(Box box) {
        System.out.println("The width of the box is " + box.getWidth());
        System.out.println("The height of the box is " + box.getHeight());
        System.out.println("The depth of the box is " + box.getDepth());
    }
}
