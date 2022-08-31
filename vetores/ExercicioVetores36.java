package vetores;

import java.util.Scanner;

/**
 * criar um vetor a com 15 elementos.construir vetor B de msm tamanho sendo que
 * cada elemento de B seja o fatorial do elemento correspondente em A.
 *
 */
public class ExercicioVetores36 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A: " + i);
            a[i] = s.nextInt();
        }
        System.out.print("\nValores em A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            int numero = a[i];
            b[i] = a[i];
             if(b[i]==0){
                b[i]=1;    
                }else 
                 while (!(numero == 1)) {
                numero--;
                b[i] = b[i] * numero;   
            }
            System.out.print("\nFatorial de " + a[i] + ": ");
            for (int j = a[i]; j > 0; j--) {
                if (j == 1) {
                    System.out.print(j + "=");
                } else {
                    System.out.print(j + "x");
                }
            }
            System.out.println(b[i]);
        }
    }
}
