package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();

        while (idade < 0) {
            System.out.println("Idade inválida, digite outra.");
            idade = sc.nextInt();
        }

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você é menor de idade");
        }
    }
}
