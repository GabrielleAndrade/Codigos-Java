
package vetores;

import java.util.Scanner;

/**
 *CRIAR VETORES A E B COM 10 INT
 * CRIAR C ONDE CADA DELEMENTO DE C É A[I]*B[I]*
 */
public class ExercicioVetores8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[7];
        int[] c = new int[5];
        
        for(int i =0;i<a.length;i++){
            System.out.println("Digite o valor de A no índice :"+i);
        a[i]=s.nextInt();
        }
        for(int i =0;i<b.length;i++){
            System.out.println("Digite o valor de B no índice :"+i);
        b[i]=s.nextInt();
        c[i]=a[i]*b[i];
        }
        System.out.print("Valores em a: ");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
         System.out.print("Valores em b: ");
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]+ " ");
        }
         System.out.print("Multiplicação do vetor A e B em C: ");
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]+ " ");
        }
    }
}
