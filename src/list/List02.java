package list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        //정수를 여러개 저장할 수 있는 list
        //List의 저장될 데이터의 자료형으로 기본 자료형은 불가
        //기본 자료형은 래퍼클래스를 사용
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(100);

    }
}
