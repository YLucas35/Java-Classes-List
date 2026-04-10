package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.println("Quantos graus está a temperatura no ambiente?");
        temp = sc.nextInt();

        if (temp > 40) {
            System.out.println("Temperatura extremamente alta");
        }
        else {
            System.out.println("Temperatura dentro dos limites normais");
        }
    }
}
