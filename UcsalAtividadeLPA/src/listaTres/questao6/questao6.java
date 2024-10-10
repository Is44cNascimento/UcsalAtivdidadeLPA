package listaTres.questao6;

import java.util.*;


public class questao6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println( "Digite a idade do aluno");
        int idade = sc.nextInt();
            {
                switch (idade){

                    case 1,2,3,4: System.out.println( "Idade incompativel com a escola");
                        break;
                    case 5,6,7: System.out.println("Infantil A");
                        break;

                    case 8,9,10: System.out.println("Infantil B");
                        break;

                    case 11,12,13: System.out.println("Juvenil A");
                        break;

                    case 14,15,16,17: System.out.println("IJuvenil B");
                        break;

                    default :  System.out.println("Adulto");
                        break;


                }


            }



    }
}
