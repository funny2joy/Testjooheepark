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
    int a, b ;
    float c ;
    double d;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public double getD() {
        return d;
    }
}
public class Prov17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int i = in.nextInt();
        System.out.printf("", i);
    }
}
