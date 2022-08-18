
package vetores;

import java.util.Scanner;

/**
 1-CRIAR VETOR A COM 10 INTEIROS;
 2-VETOR B MSM TIPO E TAMANHO;
 3-for para receber valores a e atribuir a b
 4-b deve receber a[i]*i
 5-mostrar os valores (pergunta,percorre,mostra)
 */
public class ExercicioVetores5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
     
     for(int i = 0;i<a.length;i++){
         System.out.println("Digite os valores de A no índice: "+i); 
         a[i]=s.nextInt();
         b[i]=a[i]*i;
     }
        System.out.print("Valores no índice A: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");    
        }
        System.out.print("Valores no índice B: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");   
    }
}
}