package vetores;

import java.util.Scanner;

/**
 * vetor a com 20 elementos construir b e c sendo que em b tera os pares de A e
 * c tera os impares de a.
 *
 */
public class ExercicioVetores29 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores em A no indice: " + i);
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[contadorPar] = a[i];
                contadorPar++;
            } else {
                c[contadorImpar] = a[i];
                contadorImpar++;
            }
        }

        System.out.print("\nValores em A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nValores em b: ");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\nValores em C: ");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
