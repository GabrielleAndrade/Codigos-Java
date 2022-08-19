
package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int
 * implementar um programa q defina e escreva a qtd de elementos armazenados
 * que sao pares
 */
public class ExercicioVetores11 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int[] a= new int[10];
        
        for(int i =0;i<a.length;i++){
            System.out.println("Digite os valores de A no indice :"+i);
            a[i]=s.nextInt();
            System.out.println("Os valores pares de A sao: ");
            }
         for(int i =0;i<a.length;i++){
           if(a[i]%2==0){
           System.out.print(a[i]+" "+ "correspondentes aos indices :"+i); 
            }
    }
}
}
