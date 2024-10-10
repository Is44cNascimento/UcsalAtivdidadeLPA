package listaTres.questao1;

import java.util.*;

public class Questao1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println( "Desculpa qual tipo de triangulo e: |equilátero|isósceles|escaleno| ");


    int a,b,c;
        {

             System.out.println( "digite o lado UM do triangulo");
              a = sc.nextInt();

             System.out.println( "digite o lado DOIS do triangulo");
             b = sc.nextInt();


             System.out.println( "digite o lado 3 triangulo");
             c = sc.nextInt();

        }
        sc.close();

        if (a == b && a == c  && b == c ){
            System.out.println( "O triangulo e equilátero");
        }else {
            if ((a==b && a != c) || (a==c && c!=b )  || (b ==c && b !=a) ){
                System.out.println( "O triangulo e  isósceles");
            } else if (a != b && a != c  && b != c ){
                System.out.println( "O triangulo e escaleno");
            }
        }



    }
}