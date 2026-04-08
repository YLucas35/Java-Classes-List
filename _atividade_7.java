package Java_Lista_1_If_e_Se;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1, numb2, numb3;
        boolean result1, result2; //As variáveis são só tamplates para fazer o cálculo, elas não tem nenhum valor atribuído a elas.

        System.out.println("Insira o primeiro número");
        numb1 = sc.nextInt();

        System.out.println("Insira o segundo número");
        numb2 = sc.nextInt();

        System.out.println("Insira o terceiro número");
        numb3 = sc.nextInt();

        if (numb1 > numb2) {
            result1 = (numb1 >= numb3);
            System.out.println(numb1+" é o maior de todos");
            sc.close();
        } else if (numb2 > numb1) {
            if (numb2 >= numb3) {
                System.out.println(numb2+" é o maior de todos");
                sc.close();
            }
            else {
                System.out.println(numb3+" é o maior de todos");
                sc.close();
            }
        } else {
            if (numb3 >= numb1) {
                result2 = (numb3 > numb2);
                System.out.println(numb3+" é o maior de todos");
                sc.close();
            }
            else {
                System.out.println(numb1+" é o maior de todos");
            }
        }
    }
}
