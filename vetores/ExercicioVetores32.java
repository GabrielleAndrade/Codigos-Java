package vetores;

import java.util.Scanner;

/**
 * vetor a com 10 int.programa q imrpima cada elemento e uma mensagem indicando
 * se é numero primo ou nao.
 *
 */
public class ExercicioVetores32 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        boolean primo;
        String msg;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite os valores de A: " + i);
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            primo=true;
            for(int j=2;j<a[i];j++){
            if (a[i] % j ==0) {
                primo = false;
                break;
           } 
         }
            msg="";
            if(primo){
                msg="Primo.";
            }else {
                msg="Nao e primo.";
            }
        }

    }
}
