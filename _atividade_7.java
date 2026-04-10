package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numb1 = sc.nextInt();

        System.out.print("Insira o segundo número: ");
        int numb2 = sc.nextInt();

        System.out.print("Insira o terceiro número: ");
        int numb3 = sc.nextInt();

        int maior = numb1;

        if (numb2 > maior) {
            maior = numb2;
        }

        if (numb3 > maior) {
            maior = numb3;
        }

        System.out.println(maior + " é o maior de todos.");

        sc.close();
    }
}
