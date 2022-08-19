
package vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *CRIAR VETOR A E B COM 10 INT
 * vetor c onde os indices recebema[i]/float(b[i])
 * 
 */
public class ExercicioVetores9 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a=new int[5];
       int[] b=new int[5];
       float[] c=new float[5];
       
       for(int i =0;i<a.length;i++){
           System.out.println("Digite os valores do indice A: ");
           a[i]=s.nextInt();     
       }
       for(int i =0;i<b.length;i++){
           System.out.println("Digite os valores do indice B: ");
           b[i]=s.nextInt();   
           c[i]=(float)a[i]/b[i];
       }
        System.out.print("Valores em A: ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.print("Valores em B: ");
        for(int i =0;i<b.length;i++){
            System.out.print(b[i]+ " ");
        }
      
        System.out.print("Valores em C: ");
        for(int i =0;i<c.length;i++){
            System.out.printf(" %.2f ", c[i]," ");
        }
    }
}
