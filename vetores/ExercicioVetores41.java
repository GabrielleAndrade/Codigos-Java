package vetores;

import java.util.Scanner;

/**
 * ler 10 int a e coloca-los em ordem crescente e apresentar os elementos
 * ordenados
 *
 */
public class ExercicioVetores41 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int aux;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor no indice: " + i);
            a[i] = s.nextInt();
        }

        System.out.print("\nValores em A :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        System.out.print("\nOrdenado em ordem crescente: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
