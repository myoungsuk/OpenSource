package OpenSource221005.Quiz6chapter.quiz5;


import java.util.Calendar;

public class Exercise {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);

        System.out.println("현재시간은" + hour + "시" + minute + "분 입니다.");

        if(hour > 4 && hour < 12) {
            System.out.println("Good Morning");
        }
        else if(hour >= 12 && hour < 18){
            System.out.println("Good Afternoon");
        }
        else if(hour >= 18 && hour < 22){
            System.out.println("Good Evening");
        }
        else {
            System.out.println("Good night");
        }



    }
}
