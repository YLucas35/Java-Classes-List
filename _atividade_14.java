package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Insira a primeira nota do aluno");
        numb = sc.nextInt();

        if (numb >= 7) {
            System.out.println("Ele está aprovado");
        }
        else {
            System.out.println("Ele está reprovado");
        }
    }
}
