package Java_Lista_1_If_e_Se;

import java.util.Scanner;

public class _atividade_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numb1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numb2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numb3 = scanner.nextDouble();

        double maior = numb1;
        double menor = numb1;

        // Lógica para encontrar o maior
        if (numb2 > maior) {
            maior = numb2;
        }
        if (numb3 > maior) {
            maior = numb3;
        }

        // Lógica para encontrar o menor
        if (numb2 < menor) {
            menor = numb2;
        }
        if (numb3 < menor) {
            menor = numb3;
        }

        System.out.printf("O maior número é: %.0f%n", maior);
        System.out.printf("O menor número é: %.0f%n", menor);

        scanner.close();
    }
}
