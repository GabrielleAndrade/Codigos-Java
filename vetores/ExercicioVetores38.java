
package vetores;

import java.util.Scanner;

/**
 *vetor a e b 10 int.programa q realize a interseção de a e b para vetor c
 * interseção:tds os elementos que existem em A tbm existem em B.
 * 
 */
public class ExercicioVetores38 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int[] b= new int[a.length];
        int[] c= new int[a.length];
        int intersecao=0;
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A no indice: " + i);
            a[i] = s.nextInt();
        }for (int i = 0; i < b.length; i++) {
            System.out.println("Digite os valores de b no indice: " + i);
            b[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int valor=0;
            for (int j = 0; j < b.length; j++) {
            if(a[i]==b[j]){
             valor=a[i];
            c[intersecao]=valor;
            intersecao++;
            }
          }
        }
        System.out.print("\nValores em A :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nValores em B :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\nValores em C :");
        for (int i = 0; i < intersecao; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
