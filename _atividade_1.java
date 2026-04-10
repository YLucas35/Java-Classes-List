package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numb;

        System.out.println("Qual é o seu salário?");
        numb = sc.nextDouble();

        if (numb > 2000) {
            System.out.println("Salário alto");
        }
        else {
            System.out.println("Salário baixo");
        }
    }
}
