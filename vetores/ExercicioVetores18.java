
package vetores;

import java.util.Scanner;

/**
 *ler vetor a com 10 int com idades de pessoas
 * programa qq escreva menor e a maior idade e suas posiçoes
 * 
 */
public class ExercicioVetores18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        
        for(int i=0;i<a.length;i++){
            System.out.println("Digite a idade das pessoas no índice: "+i);
            a[i]=s.nextInt();
        }
        System.out.println("Idades no vetor: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int indiceMaior=0;
        int maiorIdade=0;
        for(int i=0;i<a.length;i++){
        if(a[i]>maiorIdade){
        maiorIdade=a[i]; 
        indiceMaior=i;
        }
        
}       int indiceMenor=0;
        int menorIdade=a[0];
        for(int i=0;i<a.length;i++){
        if(a[i]<menorIdade){
        menorIdade=a[i]; 
        indiceMenor=i;
        }    
        }
        System.out.println("Maior idade no indice: "+indiceMaior+" é de "+maiorIdade);
        System.out.println("Menor idade no indice: "+indiceMenor+" é de "+menorIdade);
        
          
}
}
