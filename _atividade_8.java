package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Digite um número para saber se ele é postivo ou negativo");
        numb = sc.nextInt();

        if (numb >= 0) {
            System.out.println("Esse número é positivo");
        }
        else {
            System.out.println("Esse número é negativo");
        }
    }
}
