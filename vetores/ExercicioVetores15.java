
package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int
 * defina o percentual de elementos pares e impares respectivamentes armazenados
 * 
 */
public class ExercicioVetores15 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a = new int[5];
      
      
       for(int i =0;i<a.length;i++){
    
            System.out.println("Digite os valores de A no indice :"+i);
            a[i]=s.nextInt();
       }
            int impares=0;
            for(int i =0;i<a.length;i++){
            if(a[i]%2!=0){
            impares++; 
            }             
}       
           int pares=a.length-impares;
           float perPar=(pares*100)/a.length; 
           float perImpar=100-perPar;   
           
           System.out.println("Valores no vetor a :");
           for(int i=0;i<a.length;i++){
               System.out.println(a[i]);   
           }
           System.out.println();
           System.out.println("Porcentagem de pares em A: "+ perPar);
           System.out.println("Porcentagem de impares em A: "+ perImpar);
}
}