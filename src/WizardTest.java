/* 2019-10-31
 게임 캐릭터 마법사 클래스를
   여러분 마음껏 만들어보세요 ~
   class 를 활용하도록 하며 toString 을 사용하시오.
   또한 Good Abstraction을 적용하세요 ~
    */

class Wizard{
    String name;
    String kind;
    int level;


    void setName(String n){
        name = n ;
    }

    void setLevel(int a){
        level = a;
    }
    void setKind(String m){
        kind = m;
    }


   public String toString(){
        return "마법사명=" + name + " 종류=" + kind + " 레벨 = " + level ;
    }
}
public class WizardTest {
    public static void main(String[] args) {
        Wizard wiz = new Wizard();
        wiz.setName("지니");
        wiz.setKind("디즈니 마법사");
        wiz.setLevel(10000);

        System.out.println(wiz);

    }
}
