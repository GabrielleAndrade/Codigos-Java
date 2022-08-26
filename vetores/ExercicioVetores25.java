
package vetores;

import java.util.Scanner;

/**
 *a e b 10 int.vetor c msm tipo e tamanho com regras:
 * c deve receber 1 qdo a for maior que b
 * c deve receber 0 qdo a for igual a b
 * c deve receber -1 qdo a for menor q b
 * 
 */
public class ExercicioVetores25 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[]a = new int[10];
        int[]b = new int[a.length];
        int[]c = new int[a.length];
        
        for(int i =0;i<a.length;i++){
            System.out.println("Digite o valor em A no indice :"+i);
            a[i]=s.nextInt();
    }
        for(int i =0;i<b.length;i++){
            System.out.println("Digite o valor em B no indice :"+i);
            b[i]=s.nextInt();
            
    }
        for(int i =0;i<c.length;i++){
        if(a[i]>b[i]){
            c[i]=1;
        }else{
            c[i]=-1;
        }
     } for(int i =0;i<c.length;i++){
        if(a[i]==b[i]){
            c[i]=0; 
        }
     }
        System.out.println("Valores em A:");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Valores em B:");
        for(int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("Valores em C:");
        for(int i =0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
}
}