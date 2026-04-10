package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();

        while (idade < 0 || idade > 120) {
            System.out.println("Idade inválida, digite outra.");
            idade = sc.nextInt();
        }

        if (idade <= 12) {
            System.out.println("Você é uma criança (idade muito infantil).");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade <= 64) {
            System.out.println("Você é um adulto.");
        }
        else {
            System.out.println("Você é um idoso.");
        }
    }
}
