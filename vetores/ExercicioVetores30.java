
package vetores;

import java.util.Scanner;

/**
 *vetor a com 20.separar par e impar de A utilizando apenas o vetor B.
 * 
 */
public class ExercicioVetores30 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a = new int[20];
       int[] b=new int[a.length];
       int par=0;
       int impar=0;
       for(int i=0;i<a.length;i++){
           System.out.println("Digite os valores de A: "+i);
           a[i]=s.nextInt();
       }
       for(int i = 0;i<a.length;i++){
          if(a[i]%2==0){
              b[par]=a[i];
              par++;
          } else {
              b[impar]=a[i];
              impar++;
          }b[i]=par+impar;
       }/*for(int i = 0;i<a.length;i++){
          if(!(a[i]%2==0)){
              b[i]+=a[i];
          } 
       }*/
        System.out.print("\nValores em A: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.print("\nValores em B: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");
    }
}
}

