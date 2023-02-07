package set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set03 {
    public static void main(String[] args) {
        //배열을 리스트로 변경
        Integer[] arr = {10, 5, 3, 7, 9, 6, 5};

        //Arrays -> 배열과 관련된 여러 기능이 정의되어있는 클래스
        //리스트로 변경은 했지만 내용 변경은 불가능한 상태.
        List<Integer> list = Arrays.asList(arr);
        //내용변경을 하기 위해선 아래와 같이 객체생성을 해야한다.
        List<Integer> resultList = new ArrayList<>(list);


        //리스트를 배열로 변경
        List<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");
        strList.add("ccc");
        String[] strArr =  strList.toArray(new String[3]);

        System.out.println(Arrays.toString(strArr));
    }
}
