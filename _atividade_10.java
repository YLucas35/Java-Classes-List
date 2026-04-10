package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1, numb2;

        System.out.println("Digite o primeiro número");
        numb1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        numb2 = sc.nextInt();

        if (numb1 == numb2) {
            System.out.println("Os dois números são iguais");
        }
        else {
            System.out.println("Os dois números são diferentes");
        }
    }
}
