package listaTres.questao2;

import java.util.*;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        System.out.println("Digite um numero de 0 ate 9");
        num = sc.nextInt();

     switch (num){
         case 0 : System.out.println("O numero e nao e impar e nao e par" );
         break;
         case 1,3,5,7,9 : System.out.println("O numero " + num + " e impar" );
         break;
         case 2,4,6,8 : System.out.println("O numero " + num + " e par" );
         break;
     }
        sc.close();

    }
}
