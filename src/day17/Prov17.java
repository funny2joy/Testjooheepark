package day17;

/*

문제8. 정수형 변수 2개,
       4byte 형 소수점 변수 1개,
       8byte 형 소수점 변수 1개를 만들고 출력하시오.

문제9. 8번 문제를 키보드 입력으로 처리해주세요 ~

문제 10. 랜덤 숫자를 만드시오.
문제 11. 랜덤 숫자 2개를 작성하고
         이들간의 and, or, xor, not 을 계산하시오.

문제 12. 랜덤 숫자를 만들고
        랜덤한 쉬프트 연산을 해보세요 ~

문제 13. 2,4, 5, 6, 10, ... 120,..
       100 번째까지 더한 숫자를 출력하시오.

문제 14. 랜덤한 숫잘르 2개 입력받고
         대소 비교를 하세요 ~

문제 15. 2 by 2 행렬의 뺄셈을 작성하세요 ~

문제 16. Bank 클래스를 작성하시오.

문제 17. 성적 관리 프로그램을 만들어보세요 ~

문제 18. abstract 클래스와
         interface 의 차이점을 기술해보세요.

         abstract 는 변수와 매서드를 사용할 수 있고
         interface 는 메서드만 사용한다.


 */

import java.util.Scanner;

class VariablePrint {
    int num1;
    int num2;
    float num3;
    double num4;

  public int getNum1(){return num1;}
  public void setNum1(int num1){ this.num1 = num1;}

  public int getNum2(){return num2;}
  public void setNum2(int num2){ this.num2 = num2;}

  public float getNum3(){return num3;}
  public void setNum3(float num3){ this.num3 = num3;}

  public double getNum4(){return num4;}
  public void setNum4(double num4){ this.num4 = num4;}

    @Override
    public String toString() {
        return "VariablePrint{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                '}';
    }
}

public class Prov17 {
    public static void main(String[] args) {
        VariablePrint v = new VariablePrint();
        v.setNum1(10);
        v.setNum2(10);
        v.setNum3(10);
        v.setNum4(10);

        System.out.println(v);

        Scanner.

    }

}
