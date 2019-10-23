import java.util.Scanner;

public class QuzAns4 {
        /*
    숙제 4. 아래와 같은 수열이 존재한다.

         1 1 3 4 5 8 12 17 25 37 ...

         키보드 입력을 받아 몇 번 째 항까지
         합치기(sigma) 를 수행할지 정한다.

         합치기 결과를 출력하시오.
     */

    public static void main(String[] args) {
        //final 은 상수를 만들 때 사용한다.
        final int INIT = 3;
        Scanner in = new Scanner(System.in);

        System.out.print("몇 번째 항까지 진행할까요?");
        int num = in.nextInt();

        //초기값 세팅

        int first = 1, second= 1, third= 3;
        int finalRes = 0; // 각각 더해야되니 초기 값 필요.

        System.out.println("first =" + first);
        System.out.println("second =" + second);
        System.out.println("third =" + third);

        num -= INIT;

        finalRes = first + second + third;

        /*  1          1        3         4        5       8        12
            first   second    third
                    first     second    third
                              first     second   third
                                        fisrt   second   third
                                                first    second     third


                                                ...처음에는 바로 안그려지면 이런식으로 써보세요.
            second = next first
            third = next second
            first + third = next third

         */
        while(num-- > 0 ){

            int tmp = first;
            first = second;
            second = third;

            third = tmp + second;

            finalRes += third;

            System.out.println("third =" + third);

        }
        System.out.println("Final Res =" + finalRes);

    }
}
