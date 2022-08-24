
package vetores;

import java.util.Scanner;

/**
 *implementar um progm que obtenha a cotação do dolar em relação ao real
 * e armazene no vetor a com 20 elementos as seguintes conversoes a[i]=cotação
 * do dolar*i,para todo i variando de 1 até 20.
 * 
 */
public class ExercicioVetores20 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       float[] a = new float[20];
       
       /*for(int i=0;i<a.length;i++){
           System.out.println("Digite a cotação atual do dolar no indice:"+i);
          a[i]=s.nextFloat();
       }
       for(int i=1;i<=a.length;i++){
         a[i-1]=a[i-1]*i;
       }*/
        System.out.println("Digite a cotação do dolar: ");
       for(int i=0;i<a.length;i++){
          a[i]=s.nextFloat();
          a[i]=a[i]*(i+1);
       }
        System.out.print("Os valores são :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }  
    }
}
