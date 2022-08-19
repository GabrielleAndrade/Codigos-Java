
package vetores;

import java.util.Scanner;

/**
 *vetor A com 10 int
 * vetor b msm tipo e tamanho cada indice deve ser o resto da divisao dos indices
 * de a por 2 b[i]=a[i]%2
 * 
 */
public class ExercicioVetores10 {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int[] a= new int[3];
        int[] b= new int[a.length];
        
        for(int i=0;i<a.length;i++){
            System.out.println("Digite o valor de cada indice de A "+i );
            a[i]=s.nextInt();
            b[i]=a[i]%2;
            
        }
        System.out.print("Valores de A: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");    
        }
        System.out.print("-Vetor B com o resto da divisão de A: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");    
        }
    }

    }

