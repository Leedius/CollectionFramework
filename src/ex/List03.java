package ex;


import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        //Man 객체가 다수 저장될 수 있는 리스트 생성
        List<Man> list = new ArrayList<>();

        //Man에 대한 객체 생성
        Man m1 = new Man("김", 20);
        Man m2 = new Man("이", 30);
        Man m3 = new Man("박", 40);

        //리스트에 객체 저장
        list.add(m1);
        list.add(m2);
        list.add(m3);

        //list에 저장된 모든 Man 객체의 정보 출력
        for(int i = 0; i<list.size(); i++){
            //list의 저장되 있는 자료형Man의 i번째 정보 출력
            //get을 사용하면 toString이 실행. get()뒤에 .toString이 숨겨져 있음
            System.out.println(list.get(i));
        }

        //복습 : 자료형 e : 반복할 배열 -> 반복할 배열에서 하나씩 빼서 e에 대입
        for(Man e : list){
            System.out.println(e);
        }

        //list에 저장된 사람들 중에 이름이 "김"인 사람을 찾아서
        //그 사람의 나이를 출력하세요.


        for(int i = 0; i < list.size(); i++){
            //list에서 i번째 사람을 뽑아서 그 사람의 이름을 읽은뒤 "김"과 같은지 비교
            if(list.get(i).getName().equals("김")){
                System.out.println(list.get(i).getAge());
            }
        }

        //list에서 사람을 차례 대로 뽑아 자료형 Man에 객체e에 대입
        for(Man e : list){
            if(e.getName().equals("김")){
                System.out.println(e.getAge());
            }
        }


    }
}

class Man{
    private String name;
    private int age;

    //매개변수 값으로 초기값을 갖는 생성자
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString() 오버라이딩
    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Stu{
    //이름, 나이, 전공
    private Man man;
    private String major;

    public Stu(String name, int age, String major) {
        this.major = major;
        //name이랑 age의 매개변수를 받아 Man클래스에 이름과 나이를 초기화
        this.man = new Man(name, age);
    }

    public void showInfo(){
        //전공 출력하는 코드
        System.out.println("전공 : " + major);
        //이름출력
        System.out.println("이름 : " + man.getName());
        //나이출력
        System.out.println("나이 : " + man.getAge());
    }


}