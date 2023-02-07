package map;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "홍길동");
        map.put(2, "홍길동");
        map.put(3, "김길동");
        map.put(3, "박길동");

        //데이터 조회
        //map데이터는 key값으로 불러올 수 있다
        System.out.println(map.get(1));     //홍길동
        //key가 중복이 되면 데이터가 최신것으로 덮어 씌어진다.
        System.out.println(map.get(3));     //박길동

        //모든데이터를 조회

        //map데이터 삭제
        map.remove(2);

    }
}
