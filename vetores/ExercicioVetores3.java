package vetores;

import java.util.Scanner;

public class ExercicioVetores3 {
/*
    1-criar um vetor A com 15 elementos INTEIROS.
    2-criar vetor b de msm tipo e tamanho do a .
    3-fazer o for para pegar os valores com sout +i 
    4-pegar com o scanner a[i]=s.nextint()
    5-atribuir a b sendo que cada elemento do vetor B deverá ser o quadrado do elemento A 
    por ex : b[i]=a[i]*a[i].(a vezes ele mesmo)
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[a.length];
        //que B TEM O MESMO TAMANHO QUE A
        
        for(int i=0;i<a.length;i++){
        System.out.println("Digite o valor :"+i);
        a[i]=s.nextInt();
        b[i]=a[i]*a[i];
        }
        
        System.out.print("os valores de a são :");   
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.print("os valores de b são :");   
        for(int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
    }
}
}