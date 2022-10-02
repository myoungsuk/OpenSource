package OpenSource220928;

import java.util.ArrayList;
import java.util.Scanner;

class Player{
    String name;
    String word;

    void sayWord() {
        System.out.println(name + ">>");
        Scanner sc = new Scanner(System.in);
        word = sc.next();
    }
    void setName(String name) {
        this.name = name;
    }
    void setWord(String word) {
        this.word = word;
    }
    String getWord(){
        return word;
    }
    String getName(){
        return name;
    }
    boolean succeed(char lastChar) {
        return (this.word.charAt(0) == lastChar);
    }
}

public class WordGameApp {

    public static void main(String[] args) {

        ArrayList<Player> player = new ArrayList<Player>();

        Scanner sc = new Scanner(System.in);

        Player p;
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int playerNum = sc.nextInt();

        for(int i = 0; i<playerNum; i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            p=new Player();
            p.setName(sc.next());
            player.add(p);
        }

        System.out.println("시작하는 단어는 아버지입니다.");

        int i = 0;
        int j, k;
        int lastIndex;

        while(true) {
            j = i % playerNum;
            System.out.print(player.get(j).getName() + ">>");
            player.get(j).setWord(sc.next());

            if(i == 0) {
                if(!player.get(j).succeed('지')) {
                    System.out.println(player.get(j).getName() + "이 졌습니다.");
                    break;
                }
            }
            else {
                k = ( i - 1) % playerNum;
                lastIndex = player.get(k).getWord().length() -1;

                if(!player.get(j).succeed(player.get(k).getWord().charAt(lastIndex))){
                    System.out.println(player.get(j).getName()+"이 졌습니다.");
                    break;
                }

            }
            i++;
        }

    }
}
