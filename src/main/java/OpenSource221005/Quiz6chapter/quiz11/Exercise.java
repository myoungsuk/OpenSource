package OpenSource221005.Quiz6chapter.quiz11;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" >> ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        while (true) {
            System.out.print("명령: ");
            String change = sc.nextLine();
            if (change.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            String[] voca = change.split("!");
            if (voca.length != 2)
                System.out.println("잘못된 명령입니다!");
            if (voca[0].length() == 0 || voca[1].length() == 0) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            // 바꿀 단어가 문장에 없으면 -1을 반환
            int index = sb.indexOf(voca[0]);
            if (index == -1) {
                System.out.println("찾을 수 없습니다!");
                continue;
            }
            sb.replace(index, index + voca[0].length(), voca[1]);
            System.out.println(sb.toString());


        }
    }
}
