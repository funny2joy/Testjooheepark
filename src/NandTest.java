import java.util.Random;

public class NandTest {

    public static void main(String[] args) {
        /* 16 진수 표기법;
        1. 맨 앞에 0x 를 붙인다.
        2. 0 ~ 9 까지는 동일하다.
        3. a - 10, b - 11, c - 12, d -13, e - 14, f -15
        4. 10 진수는 0 ~9 까지, 16 진수는 0 ~f(15)까지
        5. 16진수 1자리는 2진수 4자리로 대체된다.
           (2^4 = 16 이라서 그렇다)
         */
        int postive = 0xffffffff;
        int postive2 = 0xf; // 1111(2), 15

        /* 16 진수 -> 2 진수와 2진수 -> 16 진수를 잘 해야함
          0xf -> 10 진수 15
          15- 8 -> 2^3
          7 - 4 -> 2^2
          3 - 2 -> 2^1
          1     -> 2^0

          0xf == 1111(2)

          0xc == 12 == 1100(2)

          12 - 8 - > 2^3
          4      - > 2^2

          16진수 변환의 장점(빠르게 비트 수를 볼 수 있다)

          0xcf38ad  ---> 2 진수 변환
          1100 1111 0011 1000 1010 1101

          0xca ---> 2진수 변환
          1100 1010

          12(c) x 16^1 + 10(a)  x 16^8 = 202
          (16 x 10 + 16 x 2) + 10 = 202

          2^7 + 2^6 + 2^3 + 2^1 =
          128 + 64  + 8 + 2 =202

         */

        int notPos = ~postive;
        //System.out.println(postive);
        System.out.println("notPos = " + notPos);

        int notPos2 = ~postive2;
        //System.out.println(postive);
        System.out.println("notPos2 = " + notPos2);

        /* 음수를 bit로 해석 하는 방법 (정석은 2 의 보수) -  꼼수
            1. 첫 번째 1 을 찾는다.
            2. 첫 번째 1 을 포함하여 이전 정보를 유지한다.
            3. 나머지는 전부 반전한다.
            4. 그 결과를 재해석하면 음수가 된다.

             결론: 양수를 음수로 바꾼 기법임
                   음수를 양수로 바꿀 수도 있음 */

        System.out.println("postive = " + postive);


        /* 실제 이 bit 가 어떤 음수인가?
           1. 우리가 찾을려는 임의의 음수를 x로 지정한다.
           2. 여기에 위의 음수를 bit 로 해석하는 기법을 적용한다.
           3. 그럼 결과만 양수로 나올 것이다.
         */
        System.out.println("~00001110(2) == ~14 ==" +(~14) );

        int[] arr;
        arr = new int[16];
        Random rand = new Random();

        //nand 를 쓰는 경우 반드시 2^n-1 의 숫자를 배치하도록 한다.
        for(int i = 0 ; i < 16 ; i++){
            arr[i] = rand.nextInt(128) + 1 ;
            System.out.println("arr[" + i + "] =" + arr[i] + ", arr["+ i + "] &~7 = " + (arr[i] &~31) );
        }
        /* not 은 모든 비트를 반전
               음수 표현은 제가 만든 꼼수

             창고관리, 재고관리 규격...
            (공간을 어떻게 하면 효율적으로 만들것인가 )소프트웨어에 활용...써먹을 때 많아요...
             */


        /* 문제 5. ~77 을 bit 로 표현하고 해석하시오
        * 77 -> 64 + 8 + 4 + 1
        * 77 -> 0100 1101
        * ~77 -> 1011 0010 = -X
        *        0100 1110 = + X
        *        64 + 8 + 4 + 2 = 78 = X
        *   그러므로 - X는 -78
        *
        * */


        /* 숙제 7-1. -137 을 bit 로 표현하시오.

           숙제 7-2. 10001010 11111010 을 10 진수로 표현하시오.

           숙제 7-3. 랜덤 숫자를 입력 받아서 1024 단위로 정렬하도록 프로그램 하시오.

         */
    }
}
