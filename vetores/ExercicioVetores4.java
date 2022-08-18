

package vetores;

import java.util.Scanner;

/*
1-criar um vetor A com 15 elementos INTEIROS.
    2-criar vetor b de msm tipo e tamanho do a .
    3-fazer o for para pegar os valores com sout +i 
    4-pegar com o scanner a[i]=s.nextint()
    5-cada elemento do vetor B deverá ser raiz quadrada de A por ex
    b[i]=sqrt(a[i]).
 */
public class ExercicioVetores4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a= new int[15];
        int[] b= new int[a.length];
        
        for(int i=0;i<a.length;i++){
            System.out.println("Digite o valor de cada indice de A "+i +":");
            a[i]=s.nextInt();
            b[i]=(int) Math.sqrt(a[i]);
            
        }
        System.out.print("Valores de A: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");    
        }
        System.out.print("-Vetor B com a sqrt de A: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");    
        }
    }
}
