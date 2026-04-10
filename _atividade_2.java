package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb, result;

        System.out.println("Digite o valor do produto para ver se ele tem um desconto");
        numb = sc.nextDouble();

        if (numb > 100 ) {
            System.out.printf("O preço original é: R$%.2f%n", numb);
        }
        else {
            result = (numb * 0.90);
            System.out.printf("O preço final com desconto é: R$%.2f%n", result);
        }
    }
}
