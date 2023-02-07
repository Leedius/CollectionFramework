package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StuTest {
    public static void main(String[] args) {
        //학생 다수를 저장할 수 있는 Map객체를 생성
        //key - 학번, value - 학생

        //map객체 생성
        Map<Integer, Student> stuMap = new HashMap<>();

        //학생 3명 객체 생성
        Student s1 = new Student(1001, "김길동", 85);
        Student s2 = new Student(1055, "이길동", 91);
        Student s3 = new Student(1032, "박길동", 88);

        //map에 학생 데이터 저장
        stuMap.put(s1.getStuNum(), s1);
        stuMap.put(s2.getStuNum(), s2);
        stuMap.put(s3.getStuNum(), s3);

        //학번이 2번인 학생의 이름 출력
        System.out.println(stuMap.get(1001).getStuNum());

        //map에 저장된 모든 학생의 점수의 합을 출력
        Set<Integer> keyset = stuMap.keySet();
        int sumScore = 0;
        for (int key : keyset){
            sumScore += stuMap.get(key).getScore();
        }
        System.out.println(sumScore);


    }
}
