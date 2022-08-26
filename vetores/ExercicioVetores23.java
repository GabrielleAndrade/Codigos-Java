package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int.construir vetor b msm tipo e tamanho obedecendo as regras:
 * b deve receber 1 quando a for par
 * b deve receber 0 quando a for impar
 * 
 */
public class ExercicioVetores23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[]a = new int[10];
        int[]b = new int[a.length];
        
        for(int i =0;i<a.length;i++){
            System.out.println("Digite o valor em A no indice :"+i);
            a[i]=s.nextInt();
            if(a[i]%2==0){
            b[i]=1;    
            }else{
            b[i]=0;
            }
        }
        System.out.println("Valores em A:");
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Valores em B:");
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]+" ");
        }
    }
}
