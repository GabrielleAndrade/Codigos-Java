package com.mycompany.exerciciovetores33;

import java.util.Scanner;

/**
 * vetor a com 10 int.programa q imprima cada elemento do vetor a e a relação de
 * todos os pares de 0 ate o respectivo elemento
 *
 */
public class ExercicioVetores33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {1, 5, 4, 3, 10, 22, 57, 60, 75, 34};
        int cont = 1;
        /*for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A: " + i);
            a[i] = s.nextInt();
        }*/
        System.out.print("\nValores em A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("\nPares entre " + a[i] + ": ");
            for (int j = 2; j < a[i]; j += 2) {
                System.out.print(" " + j + " ");
                cont++;
            }
        }
    }

}
