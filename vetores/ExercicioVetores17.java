
package vetores;

import java.util.Scanner;

/**
 *ler vetor a com 10 int correspondentes as idades de um grupo de pessoas
 * programa q determine e escreva a qtdd de pessoas >35
 * 
 */
public class ExercicioVetores17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i=0;i<a.length;i++){
            System.out.println("Digite a idade no índice :"+i);
            a[i]=s.nextInt();
        }
        System.out.print("Idades nos índices de A: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");    
        }
        System.out.println("Pessoas com mais de 35 anos: ");
        for(int i=0;i<a.length;i++){
        if(a[i]>35){
            System.out.println(a[i]+" ");
        }    
        }
    }
}
