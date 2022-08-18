
package vetores;

import java.util.Scanner;

/**
 *criar dois vetores com 10
 * criar vetor c onde cada elemento é a subtração dos elementos de a e b.
 */
public class ExercicioVetores7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];
        
        for(int i=0;i<a.length;i++){
            System.out.println("Digite os valores do índice A: "+i);
        a[i]=s.nextInt();
        }
        for(int i=0;i<b.length;i++){
            System.out.println("Agora digite os valores do índice B: "+i);
        b[i]=s.nextInt();
        c[i]=a[i]-b[i];
        }
        System.out.println("Os valores em A são: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println(" |Os valores em B são: ");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+ " ");
        }
        System.out.println(" |Os valores em C são: ");
        for(int i=0;i<a.length;i++){
            System.out.println(c[i]+ " ");
    }
}
}