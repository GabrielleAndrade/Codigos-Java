

package vetores;

import java.util.Scanner;

/**
 criar dois vetores - A e B cada um com 10 elementos inteiros
 * contruir vetor C onde cada elemento de C é a soma dos elementos de A E B.
 */
public class ExercicioVetores6 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a = new int[10];
       int[] b = new int[10];
       int[] c = new int[10];
       
       for(int i =0;i<a.length;i++){
           System.out.println("Digite os valores de A no índice: "+i);
           a[i]=s.nextInt();
       }for(int i=0;i<b.length;i++){
           System.out.println("Agora digite os valores de B no indice: "+i);
           b[i]=s.nextInt();
           c[i]=a[i]+b[i];
       }
        System.out.print("Valor de A : ");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.print(" |Valor de B: ");
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print(" |Valores nos índices de C que são a soma de a[] e b[]: ");
        for(int i = 0;i<a.length;i++){
            System.out.print(c[i]+" ");
    }
}
}