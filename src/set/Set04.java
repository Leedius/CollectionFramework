package set;

import java.util.*;

public class Set04 {
    public static void main(String[] args) {
        //List를 Set으로 변경
        List<Double> list = new ArrayList<>();
        list.add(5.5);
        list.add(3.6);
        list.add(9.2);
        list.add(5.5);

        Set<Double> set = new TreeSet<>(list);

        //반복 출력문
        for(double e : set){
            System.out.println(e);
        }

        //다시 리스트로 변경
        list = new ArrayList<>(set);

        for(double e : list){
            System.out.println(e);
        }
    }
}
