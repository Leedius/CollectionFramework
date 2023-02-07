package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Set02 {
    public static void main(String[] args){

        //Set 객체 생성
        Set<String> set = new TreeSet<>();

        //데이터 삽입
        set.add("김자바");
        set.add("최자바");
        set.add("박자바");
        set.add("윤자바");
        set.add("윤자바");

        //일반 for문은 불가하지만 for-each문은 가능
        for(String e : set){
            System.out.println(e);
        }
    }
}
