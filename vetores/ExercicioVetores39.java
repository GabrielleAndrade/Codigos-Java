package vetores;

import java.util.Scanner;

/**
 * criar 2 vetores a e b com 10 int.programa q crie c que é aidferença dos
 * conjutnos formados pelos elementos de a e b(todos os elementos do conjunto A
 * que nao existem no conjunto b)
 *
 */
public class ExercicioVetores39 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int contadorc=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor de A no indice: " + i);
            a[i] = s.nextInt();
            System.out.println("Digite o valor de B no indice: " + i);
            b[i] = s.nextInt();

        }
       for (int i = 0; i < a.length; i++) {
           int contador=0;
            for (int j = 0; j < a.length; j++) {
                if (!(a[i]==b[j])){
                    contador++;
                }
            }
            if(contador==b.length){
                c[contadorc]=a[i];
                contadorc++;
            }
        }

        System.out.print("\nValores em A");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nValores em B");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\nValores em C");
        for (int i = 0; i <contadorc; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
