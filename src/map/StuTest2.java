package map;

import java.lang.reflect.Array;
import java.util.*;

public class StuTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //map에 학생들의 정보를 저장.
        //key - 반이름, value - 해당 반에 소속된 학생들
        Map<String, List<Student>> map = new HashMap<>();

        //1반에 소속된 학생 3명을 생성
        Student s1 = new Student(1, "김자바", 80);
        Student s2 = new Student(2, "이자바", 90);
        Student s3 = new Student(3, "박자바", 95);

        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        map.put("자바반", list1);

        //2반에 소속된 학생 3명을 생성
        Student s4 = new Student(4, "김캐드", 85);
        Student s5 = new Student(5, "이캐드", 75);
        Student s6 = new Student(6, "박캐드", 90);

        List<Student> list2 = new ArrayList<>();
        list2.add(s4);
        list2.add(s5);
        list2.add(s6);

        map.put("캐드반", list2);

        System.out.println(map.get("자바반"));


        //map의 키값을 set배열로 리턴
        Set<String> keyset = map.keySet();
        int sum;
        double avg;

        //1.모든 반의 반이름과 각 반에 소속된 학생 수 출력
        for (String key : keyset){
            System.out.println("반이름 : " + key + " |  소속된 학생 수 " + map.get(key).size());
        }

        System.out.println("=================================");

        //2.자바반에 소속된 학생들의 평균 점수
        sum = 0;
        avg = 0;
        String searchClassName;
        String name = null;
        System.out.print("반의 이름을 입력 하세요 : ");
        searchClassName = sc.next();
        for(String key : keyset){
            if(key.equals(searchClassName)){
                name = key;
                for(int i = 0; i < map.get(key).size(); i++){
                    sum += map.get(key).get(i).getScore();
                }
                avg = (double) sum / map.get(key).size();
                break;
            }
        }
        System.out.println(name + "에 소속된 학생들의 평균 점수는 : " + avg );

        System.out.println("=================================");

        //3.캐드반 학생 중 점수가 80점 이상 한 학생의 모든 정보 출력
        System.out.print("반의 이름을 입력 하세요 : ");
        searchClassName = sc.next();
        System.out.println(searchClassName+" 학생 중 점수가 80점 이상 한 학생 정보");
        for(Student stu : map.get(searchClassName)){
            if(stu.getScore()>=80){
                System.out.println(stu);
            }
        }

        System.out.println("=================================");

        //4. 모든 학생 중 점수가 가장 높은 학생의 학번 출력
        int max = 0;        //최고점수
        int stuNum = 0;     //최고점수를 지닌 학생의 학번
        Set<String> classNames = map.keySet();
        //map에 저장된 반의 갯수 만큼 반복
        for(String className : classNames){
            //반의 학생수 만큼 반복
            for (Student stu : map.get(className)){        //map.get(className) = list1
                if(stu.getScore()>max){
                    max = stu.getScore();
                    stuNum = stu.getStuNum();
                }
            }
        }
        System.out.println("모든 학생 중 점수가 가장 높은 학생은\n학번은 : " + stuNum + ", 점수는 : " + max);
    }
}
