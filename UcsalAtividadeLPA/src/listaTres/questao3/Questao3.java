package listaTres.questao3;


import java.util.*;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a, b;
        {
            a = 0;
            b = 50;
        }


        double num;
        {
            System.out.println("Digite um valor entre 0 e 50");
            num = sc.nextInt();


        }

        double cin;
        double qua;

        if (num % 5 == 0 ){
            System.out.println ("O numero " + num + " e dvidisivel por 5");
        } else {
                if (num % 4 == 0) {
                    System.out.println("O numero " + num + " e dvidisivel por 4");
                } else if ( (num % 5 != 0) ||( num % 4 != 0 )){
                    System.out.println("O numero " + num + " nao e  dvidisivel por 4 ou 5");
            }
        }



    }
}

