package Java_Lista_1_Se_e_Enquanto;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1, temp2;

        System.out.println("Quantos graus está a temperatura no ambiente?");
        temp1 = sc.nextInt();

        if (temp1 <= 25) {
            temp2 = temp1;
            if (temp2 < 15) {
                System.out.println("Está frio");
            }
            else {
                System.out.println("Está agradável");
            }
        }
        else {
                System.out.println("Está quente");
        }
    }
}
