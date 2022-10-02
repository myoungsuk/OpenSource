package OpenSource220928;

import java.util.Scanner;

class Seat {
    private String seat[];

    public Seat() {
        seat = new String[10];
        for (int i = 0; i < seat.length; i++) {
            seat[i] = "---";
        }
    }

    public void Show() {
        for (int i = 0; i < seat.length; i++) {
            System.out.print(seat[i] + " ");
        }
        System.out.println();
    }

    public void Set(String name, int num) {
        seat[num - 1] = name;
    }

    public boolean reSet(String name) {
        for (int i = 0; i < seat.length; i++) {
            if (name.equals(seat[i])) {
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}


class Practice12 {
    Scanner sc = new Scanner(System.in);
    private Seat s[];
    private String seatGrade[] = {"S", "A", "B"};

    public Practice12() {
        s = new Seat[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Seat();
        }

    }

    public void Reserve() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int grade = sc.nextInt();
        System.out.print(seatGrade[grade - 1] + ">>");
        s[grade - 1].Show();

        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int num = sc.nextInt();
        s[grade - 1].Set(name, num);
    }

    public void Check() {
        for (int i = 0; i < s.length; i++) {
            System.out.print(seatGrade[i] + ">>");
            s[i].Show();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void Cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>>");
        int grade = sc.nextInt();
        System.out.print(seatGrade[grade - 1] + ">>");
        s[grade - 1].Show();

        System.out.print("이름>>>");
        String name = sc.next();

        boolean result = s[grade - 1].reSet(name);
        if (result == true)
            System.out.println("<<<취소를 완료하였습니다.>>>");
        else
            System.out.println("존재하지 않는 정보입니다.");
    }

    public void Run() {
        int option;
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Reserve();
                    break;
                case 2:
                    Check();
                    break;
                case 3:
                    Cancel();
                    break;
                case 4:
                    return;
            }
        }
    }
}

