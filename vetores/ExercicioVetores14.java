
package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int
 * escreva a media aritmetica simples dos IMPARES no vetor
 * 
 */
public class ExercicioVetores14 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a= new int[10];
       float impares=0;
       for(int i=0;i<a.length;i++){
        System.out.println("Digite o valor no índice: "+i);
        a[i]=s.nextInt();
        if(a[i]%2==1){
        impares+=a[i];
        }     
        }
        System.out.print("Valores dos índices : ");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
          
    }
       System.out.printf("A média dos impares no vetor é de : %.2f",impares/10);
}
}