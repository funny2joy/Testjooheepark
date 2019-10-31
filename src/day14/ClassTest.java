package day14;
/* 2019-10-31
 게임 캐릭터 마법사 클래스를
   여러분 마음껏 만들어보세요 ~
   class 를 활용하도록 하며 toString 을 사용하시오.
   또한 Good Abstraction을 적용하세요 ~
    */

class Magician {
    //public 은 공용(외부에 공개가 가능함)
    //private 은 전용(내부에서만 사용 가능함)
    private String skill1;
    private String skill2;
    private String skill3;
    private int level;
    private String id;

    // get 은 class 의 내부의 값을 가져올 때 사용
    // set 은 class 내부에 값을 설정할 때 사용

    public String getSkill1() {
        return skill1;
    }

    // 자기 자신을 표현하는 것이 this
    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Magicia{" +
                "skill1='" + skill1 + '\'' +
                ", skill2='" + skill2 + '\'' +
                ", skill3='" + skill3 + '\'' +
                ", level=" + level +
                ", id='" + id + '\'' +
                '}';
    }
}

public class ClassTest {
    public static void main(String[] args) {
        Magician m = new Magician();
        m.setSkill1("파이어 볼");
        m.setSkill2("플레임");
        m.setSkill3("메테오");
        m.setLevel(99);
        m.setId("블리자드망함");

        System.out.println(m);
    }
}
