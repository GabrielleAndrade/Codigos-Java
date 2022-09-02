

package vetores;

import java.util.Scanner;

/**
 *ler 10 int a . montar uma rotina de busca , para pesquisar se um dado elemento
 * x esta armazenado em a
 * 
 */
public class ExercicioVetores40 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int valor=0;
        for(int i=0;i<a.length;i++){
            System.out.println("Digite o valor de A: "+i);
            a[i]=s.nextInt();
        }
        System.out.print("Valores em A:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\nDigite o valor que quer encontrar:");
        valor=s.nextInt();
        boolean tem=false;
        for(int i=0;i<a.length;i++){
            
            if(valor==a[i]){
                tem=true;
                System.out.println("Contem o valor no indice:"+i);
       }
      }
        if(tem==false){
            System.out.println("Nao tem o valor.");
        }
  }
}