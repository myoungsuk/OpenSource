package OpenSource220928;

import java.util.Scanner;

class Rectangle5 {
    int width;
    int height;
    public int getArea() {
        return width*height;
    }
    public static void main(String[] args) {
        Rectangle5 rect = new Rectangle5();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");

        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();


        System.out.println("사각형의 면적은 " + rect.getArea());

        scanner.close();
    }
}
