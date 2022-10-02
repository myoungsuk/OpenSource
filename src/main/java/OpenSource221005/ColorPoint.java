package OpenSource221005;

import OpenSource220928.Point;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }



    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
