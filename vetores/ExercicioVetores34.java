

package vetores;

import java.util.Scanner;

/**
 *vetor a 10 int.programa q imrpima cada elemento de A em relaçao de
 * todos os divisores do respectivo elemento.
 * 
 */
public class ExercicioVetores34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A: " + i);
            a[i] = s.nextInt();
        }
        System.out.print("\nValores em A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("\nDivisores de " + a[i] + ": ");
            for (int j = 1; j <= a[i]; j++) {
                if(a[i]%j==0){
                System.out.print(" " + j + " ");    
                }
         }
    }
}
}