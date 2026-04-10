package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();

        while (idade < 0) {
            System.out.println("Idade inválida, digite outra.");
            idade = sc.nextInt();
        }

        if (idade >= 16) {
            System.out.println("Você pode votar.");
        }
        else {
            System.out.println("Você não pode votar.");
        }
    }
}
