
package vetores;

import java.util.Scanner;

/**
 *
 * 
 */
public class ExercicioVetores24 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] a = new int[10];
       
       for(int i = 0;i<a.length;i++){
           System.out.println("Digite o valor no índice: "+i);
       a[i]=s.nextInt();
       }
        System.out.print("Os valores em A são de :");
       for(int i = 0;i<a.length;i++){
           System.out.print(a[i]+" ");    
       }
        /*if(a[0]==a[9] && a[1]==a[8] && a[2]==a[7] && a[3]==a[6] && a[4]==a[5]){
           System.out.println("|O vetor e um palindromo.");
           }else {
           System.out.println("O vetor nao e um palindromo.");    
       }*/
       boolean polindromo = true; 
       for (int i =0; i < a.length; i++) { 
          if(!(a[i] == a[a.length - 1 -i])) 
   {     polindromo = false; break; } } 
          if (polindromo)
       { System.out.println("O vetor é um polindromo"); }
       else { System.out.println("O vetor não é um polindromo"); }
       
    }
}
