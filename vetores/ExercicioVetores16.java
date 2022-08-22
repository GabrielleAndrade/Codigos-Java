
package vetores;

import java.util.Scanner;

/**
 *vetor a c 10 int
 * calc e escreva a soma de elementos armazenados q sao inferiores a 15
 * qtds de elementos armazenados que sao =15
 * media dos elementos armazenados q sao >15
 * 
 */
public class ExercicioVetores16 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int[] a=new int[10];
      
      
      for(int i =0;i<a.length;i++){
          System.out.println("Digite os valores do indice a :"+i);
      a[i]=s.nextInt();
      }
      //System.out.print("Soma de indices menores que 15: ");
      int somaMenores=0;
      for(int i =0;i<a.length;i++){
          if(a[i]<15){
          somaMenores+=a[i];  
          }
          
      }
     // System.out.print("Quantidade de indices com 15: ");
      int indQuinze=0;
      for(int i =0;i<a.length;i++){
       if(a[i]==15){
           indQuinze+=a[i]; 
           //System.out.print(indQuinze+" ");
       }
          
      }
      //System.out.print("Soma de indices maiores que 15: ");
        int somaMaiores=0;
       for(int i =0;i<a.length;i++){
          if(a[i]>15){
          somaMaiores+=a[i];
         // System.out.print(somaMaiores+" ");
          }
           
    }
        System.out.print("Os valores do indice a são :");
        for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");    
        }
     System.out.print("Soma de indices menores que 15: "+somaMenores);
     System.out.print(" |Soma de indices iguais 15: "+indQuinze);
     System.out.print(" |Soma de indices maiores que 15: "+somaMaiores);
}
}