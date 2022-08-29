
package vetores;

import java.util.Scanner;

/**
 *ler vetor a e b com 10.construir C sendo a junção dos de A e B.
 * os primeiros 10 de c devem ser de A e os ultimos elementos de C devem ser de B
 * 
 * 
 */
public class ExercicioVetores28 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[]a = new int[10];
       int[]b = new int[10];
       int[]c = new int[20];
       
       
       for(int i=0;i<a.length;i++){
           System.out.println("Digite os valores em A no indice: "+i);
           a[i]=s.nextInt();
           
       }
       for(int i=0;i<b.length;i++){
           System.out.println("Digite os valores em B no indice: "+i);
           b[i]=s.nextInt();
           
       }for(int i=0;i<c.length;i++){
        if(i<10){
       c[i]=a[i];
       }else if(i>9 && i<20){
        c[i]=b[i-10];
       }
       }
        System.out.print("\nValores em A: "); 
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" "); 
        }
         System.out.print("\nValores em b: "); 
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" "); 
        }
        System.out.print("\nValores em C: "); 
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" "); 
        }
       
    }
}
