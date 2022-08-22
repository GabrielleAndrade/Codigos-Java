

package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int
 * progrm que determine a soma dos elementos no vetor que sao multiplos de 5
 * 
 */
public class ExercicioVetores13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int soma=0;
        for(int i=0;i<a.length;i++){
        System.out.println("Digite o valor no índice: "+i);
        a[i]=s.nextInt();
        if(a[i]%5==0){
          soma+=a[i];       
       }
           
        }
        System.out.println("Os valores nos índices são: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
     
        }    
      System.out.println("A soma dos multiplos de 5 são : "+ soma);
        
    }
    
}
