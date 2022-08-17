/*
criar um vetor A com 8 elementos INTEIROS.criar vetor b de msm tipo e tamanho
do a multiplicaods por 2 b[i]=a[i]*2.
 */

package com.mycompany.exerciciovetores2;

import java.util.Scanner;


public class ExercicioVetores2 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int[] a = new int[8];
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
            System.out.println("Valor da posicao :"+i);
        a[i]=s.nextInt();
        b[i]=a[i]*2;
        }
        System.out.print("Vetor a = ");
            for (int i =0;i<a.length;i++){
                System.out.print(a[i]+ " ");
                 
        }
            System.out.print("Vetor b = ");
            for (int i =0;i<b.length;i++){
                System.out.print(b[i]+ " ");
            }
    }
}
