package vetores;

import java.util.Scanner;

/**
 * vetor A com 5 int.programa q imprima a tabuada de de cada elemento.
 *
 */
public class ExercicioVetores31 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int valor=0;
        int tabuada=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A: " + i);
            a[i] = s.nextInt();
        }
        /*for (int i = 0; i < a.length; i++) {
            System.out.print("Tabuada de :" + a[i]);
            for (int j = 0; j <= 10; j++) {
                System.out.print(j + "*" + a[i] + "=" + (a[i] * j));
            }
        }*/
        for (int i = 0; i < a.length; i++){
           while(tabuada<=10){
            valor=a[i]*tabuada;
               System.out.println(a[i]+"*"+tabuada+"="+valor);
               tabuada++;
           }
        }
    }

}
