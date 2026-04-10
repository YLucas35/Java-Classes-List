package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, result;

        System.out.println("Insira um número para saber se ele é divisível por 5");
        numb = sc.nextInt();
        result = numb % 5;

        if (result == 0) {
            System.out.println("Este número é divisível por 5");
        }
        else {
            System.out.println("Este número não é divisível por 5");
        }
    }
}
