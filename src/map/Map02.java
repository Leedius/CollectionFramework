package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(22, "김자바");
        map.put(55, "최자바");
        map.put(30, "윤자바");


        //map 전체 데이터 조회
        //1. map에 저장된 모든 키 정보 조회
        //ketSet() : map에 저장된 키들을 set형태(순서대로 배열)로 리턴
        Set<Integer> keySet = map.keySet();

        for(int key  : keySet){
            System.out.println("key - " + key + " / value = " + map.get(key));
        }

    }
}
