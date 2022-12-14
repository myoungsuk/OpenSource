package OpenSource221005.Quiz5chapter.quiz9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack{

    private int size;
    private int index;
    private String [] StackArray;

    public StringStack(int size) {
        this.size = size;
        StackArray = new String [size];
        this.index = -1;

    }

    @Override
    public int length() {
        return index + 1;
    }

    @Override
    public int capacity() {
        return StackArray.length;
    }

    @Override
    public String pop() {

        String popStr;
        if(index == -1)
            return null;
        popStr = StackArray[index];
        index--;
        return popStr;
    }

    @Override
    public boolean push(String val) {
        if (index + 1 < size) {
            index++;
            StackArray[index] = val;
            return true;
        }else{
            return false;
        }

    }
}
public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >>");
        int size = sc.nextInt();
        StringStack Stack = new StringStack(size);

        while(true){
            System.out.print("문자열 입력 >> ");
            String val = sc.next();

            if(val.equals("그만"))
                break;
            if(!Stack.push(val))
            {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i = 0; i < Stack.capacity(); i++)
        {
            System.out.println(Stack.pop()+" ");
        }

    }
}
