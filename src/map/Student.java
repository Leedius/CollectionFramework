package map;

public class Student {
    private int stuNum;
    private String name;
    private int score;

    //매개변수로 데이터 세팅하는 생성자
    //getter, setter
    //toString overriding


    public Student(int stuNum, String name, int score){
        this.stuNum = stuNum;
        this.name = name;
        this.score = score;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
