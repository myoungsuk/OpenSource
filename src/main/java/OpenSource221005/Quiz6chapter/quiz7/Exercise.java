package OpenSource221005.Quiz6chapter.quiz7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String a = sc.nextLine();
            if(a.equals("그만")) {
                System.out.print("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(a, " ");
            int n = st.countTokens();
            System.out.println("어절 개수는 " + n);

        }
    }
}
