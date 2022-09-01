package vetores;

import java.util.Scanner;

/**
 * vetor a com 10 int.vtor b msm tipo e tamanho sendo q cada elemento de B deve
 * ser o somatorio:bi=somatorio de aj para todo j variando de i ate 10.
 *
 */
public class ExercicioVetores37 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A no indice: " + i);
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            for (int j = i; j <=10; j++) {
                b[i] = b[i] + j;
            }
        }
        /*for (int i = 0; i < a.length; i++) {
            int soma=0;
         for (int j = i; j <10; j++) {
               soma +=a[j];
            }
         b[i]=soma;
        }*/
        System.out.print("\nValores em A :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nValores em B :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
