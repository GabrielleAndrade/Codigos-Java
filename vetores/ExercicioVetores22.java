package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int.desenvolver um programa q verifique se todos os elementos do
 * vetor a são pares.se pelo menos 1 for impar o processo para de percorrer e deve 
 * ser encerrado.
 */
public class ExercicioVetores22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i =0;i<a.length;i++){
            System.out.println("Digite o valor no indice: "+i);
            a[i]=s.nextInt();
            
        }
        System.out.print("Valores em a: ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i =0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("Nenhum impar encontrado no indice: "+i);
            }else {
                System.out.println("Programa encerrado no indice "+i+"pois contem"
                        + "um impar.");
                break;
            }
        }
       
    }
}
