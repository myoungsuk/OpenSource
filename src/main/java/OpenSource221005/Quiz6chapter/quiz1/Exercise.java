package OpenSource221005.Quiz6chapter.quiz1;


class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + this.x +" ," + this.y + ")";
    }

    public boolean equals(Object obj) {
        MyPoint m = (MyPoint)obj;
        if(x==m.x && y == m.y)
            return true;
        else
            return false;

    }
}


public class Exercise {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3 ,50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);

        if(p.equals(q)){
            System.out.println("같은 점");
        }
        else{
            System.out.println("다른 점");
        }
    }
}
