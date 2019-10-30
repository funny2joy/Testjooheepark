import java.util.Random;

/* 문제6. class 를 활용하여
          2 by 2 행렬의 덧셈을 구현하시오.
        */
class Matrix {

    int A[][]; //이중 배열 선언
    int B[][];
    int res[][];
    Random rand;

    void intiArr(){  // 메소드 선언 : 리턴타입(출력) void 이름 intiArr 인자(입력값) ()

        A = new int[2][2];
        B = new int[2][2];
        res = new int[2][2];
        // Random class 를 객체화 시킨 rand
        rand = new Random();

        // Loop 를 돌면서 각각의 이중 배열에 난수 설정
        for(int i = 0; i < 2; i++){
            for(int j = 0 ; j < 2; j++){
                A[i][j] = rand.nextInt(5) + 1;
                B[i][j] = rand.nextInt(5) + 1;

            }
        }

    }

    void addMatrix(){
        for(int i = 0; i <2 ; i++){
            for(int j = 0; j <2; j++){
                res[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    void addBetMat(Matrix src){
        for(int i =0 ; i < 2 ; i++){
            for(int j=0 ; j <2; j++){
                res[i][j] = A[i][j] + src.A[i][j];
            }
        }
    }

    //출력
    void printArr(){
        System.out.println("res = ");
        for(int i = 0; i <2 ; i++){
            for(int j =0; j <2 ; j++){
                System.out.printf("%d ", res[i][j]);
            }
            System.out.println();
        }
        System.out.printf("A= ");
        for(int i=0 ; i <2 ; i++){
            for(int j =0 ; j <2 ; j++){
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
           }

        System.out.println("B= ");
        for(int i=0 ; i <2 ; i++){
            for(int j =0 ; j <2 ; j++){
                System.out.printf("%d ", B[i][j]);
            }
            System.out.println();
        }

    }
}


public class TwoByTwo {
    public static void main(String[] args) {
       Matrix A = new Matrix(); //A라는 객체가 생성.
       A.intiArr();
       A.addMatrix();
       A.printArr();
       System.out.println();

       Matrix B = new Matrix(); // 재활용 가능. class 의 장점. 반복되는 기능을 class 함수로..
       B.intiArr();
       B.printArr();


       A.addBetMat(B);
       A.printArr();

       Matrix multiMat[];
       multiMat = new Matrix[7];

       for(int i = 0; i < 7; i++){
          multiMat[i] = new Matrix();
       }

    }
}

/* 실력은 우직하게 문제를 많이 풀어보면 좋아요
   요령은 없다. 많이 하면 된다.
   클래스!!!
 */

/*객체
: 메모리 올라간 상태(할당이 완료된 상태 : new )
  당장 쓸 수 있는 상태? GoF 의 디자인 패턴, 프로그램에 익숙한 다음에 읽어보면 좋은 책

  C++ java 프로그램 기반 작업하실 뿐은 필독서
 */