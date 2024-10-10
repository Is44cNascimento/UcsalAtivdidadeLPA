package listaTres.questao4;

import java.util.*;


public class questao4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Digite o seu salario");
    double salario = sc.nextDouble();
        {
            double pcUm,pcDois, pcTres;{
                 pcUm =  ((23.7/100) * salario) + salario;
                 pcDois = ((18.5/100) * salario) + salario;
                 pcTres = ((12.1/100) * salario) + salario;
            }



            if (salario >= 1500 && salario <=2000  ){
                    System.out.println ("Seu salario com o reajuste de 23,7% foi de: " + pcUm);
                } else {
                if ( salario  >= 3500 && salario <= 5000){
                    System.out.println ("Seu salario com o reajuste de 18,5% foi de: " + pcDois);
                } else {
                    if (salario >= 7500 && salario <= 9000){
                        System.out.println ( "Seu salario com o reajuste de 12,1% foi de: " + pcTres);
                    }
                }

            }
        }




    }

}
