
package vetores;

import java.util.Scanner;

/**
 *ler vetor a com 10 e construir b ded msm tipo e tamanho sendo q estes deverao
 * estar invertidos o primeiro de A passa a ser o ultimo de B o segundo de A passa
 * a ser o penultimo
 * 
 */
public class ExercicioVetores27 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a = new int[10];
       int[] b = new int[a.length];
       
       for(int i=0;i<a.length;i++){
           System.out.println("Digite os valores de A: "+i);
           a[i]=s.nextInt();
           
       }for(int i=0;i<a.length;i++){
            b[i]=a[(a.length-1) -i];
       }
       
        System.out.print("\nValores em A: "); 
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" "); 
        }
         System.out.print("\nValores em b: "); 
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" "); 
        }
    }
}
