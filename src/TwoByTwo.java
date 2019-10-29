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
        rand = new Random();

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
       Matrix A = new Matrix();
       A.intiArr();
       A.addMatrix();
       A.printArr();

       Matrix B = new Matrix(); // 재활용 가능. class 의 장점. 반복되는 기능을 class 함수로..
       B.intiArr();

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