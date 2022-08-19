
package vetores;

import java.util.Scanner;

/**
 *criar vetor a 10 int
 * programa q defina e escreva a soma de tds os indices
 * 
 */
public class ExercicioVetores12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a= new int[4];
        
        for(int i =0;i<a.length;i++){
            System.out.println("Digite os valores de A no indice :"+i);
            a[i]=s.nextInt();
        }
         int valor=0;
        for(int i =0;i<a.length;i++){
         valor+=a[i];
        }
         System.out.print(valor+" ");
    }
}
