import java.util.Scanner;

public class Homework4 {
    /*
    숙제 4. 아래와 같은 수열이 존재한다.

         1 1 3 4 5 8 12 17 25 37 ...

         키보드 입력을 받아 몇 번 째 항까지
         합치기(sigma) 를 수행할지 정한다.

         합치기 결과를 출력하시오.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇 번 째 항까지 합칠까요?");
        int num = in.nextInt();

        int Afirst = 1;
        int Asecond = 1;
        int Athird = 3;
        int Acount = 0;
        int Asum = 0;


        int i = 1;
        while (i ++ < num -3){

            Acount= Afirst + Athird;
            Afirst = Afirst + i ;
            Athird = Athird + 3;
            Acount += Acount;

            System.out.println(Acount);



        }

    }
}
