
package vetores;

import java.util.Scanner;

/**
 *vetor a com 10 int.vetor b msm tipo com regras:
 * b devve receber A quando a for menor que 7
 * b deve receber b quando a for ==7
 * b deve receber c quando a for >7 e <10
 * b deve receber d quando a for ==10
 * b deve receber e quando a for >10
 * 
 */
public class ExercicioVetores26 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[]a=new int[10];
       char[]b=new char[a.length];
       
       for(int i=0;i<a.length;i++){
           System.out.println("Digite o valor de A no indice: "+i);    
       a[i]=s.nextInt();
       if(a[i]<7){
       b[i]='a';     
       }else if(a[i]==7){
       b[i]='b';    
       }else if(a[i]>7 && a[i]<10){
       b[i]='c';    
       }else if(a[i]==10){
       b[i]='d';    
       }else if(a[i]>10){
       b[i]='e';    
       }
       
    }
       
        System.out.print("\nValores em A: "); 
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" "); 
            
        }
        System.out.print("\nCaracteres recebidos em B:");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");    
        }
    }
}
